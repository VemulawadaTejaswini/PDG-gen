import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {

	
// 配列版
public static boolean nextPermutation(int[] a) {
  for (int i = a.length - 1; i > 0; --i) {
    if (a[i - 1] < a[i]) {
      int swapIndex = find(a[i - 1], a, i, a.length - 1);
      int temp = a[swapIndex];
      a[swapIndex] = a[i - 1];
      a[i - 1] = temp;
      Arrays.sort(a, i, a.length);
      return true;
    }
  }
  return false;
}

// destより大きい要素の中で最小のもののインデックスを二分探索で探す
private static int find(int dest, int[] a, int s, int e) {
  if (s == e) {
    return s;
  }
  int m = (s + e + 1) / 2;
  return a[m] <= dest ? find(dest, a, s, m - 1) : find(dest, a, m, e);
}


// List版
public static <T extends Comparable<? super T>> boolean nextPermutation(
    List<T> l) {
  int size = l.size();
  for (int i = size - 1; i > 0; --i) {
    if (l.get(i - 1).compareTo(l.get(i)) < 0) {
      int swapIndex = find(l.get(i - 1), l, i, size - 1);
      Collections.swap(l, i - 1, swapIndex);
      Collections.sort(l.subList(i, size));
      return true;
    }
  }
  return false;
}

private static <T extends Comparable<? super T>> int find(T dest,
    List<T> a, int s, int e) {
  if (s == e) {
    return s;
  }
  int m = (s + e + 1) / 2;
  return a.get(m).compareTo(dest) <= 0 ? find(dest, a, s, m - 1)
                                       : find(dest, a, m, e);
}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		String[]p = new String[n];
		String[]q = new String[n];
		
		for(int i = 0; i < n; i++) {
			p[i] = stdIn.next();
		}
		for(int i = 0; i < n; i++) {
			q[i] = stdIn.next();
		}
		
		String pp = "";
		String qq = "";
		String[] count = new String[n];
		
		for(int i = 0; i < n; i++) {
			pp += p[i];
			qq += q[i];
			count[i] = String.valueOf(i+1);
		}
		

		int[] tmp = new int[count.length];
		
		for(int i = 0; i < n; i++) {
			tmp[i] = Integer.parseInt(count[i]);
		}
		
		int a = 0;
		int b = 0;
		
		int index = 0;
		
		int ppp = Integer.parseInt(pp);
		int qqq = Integer.parseInt(qq);
		
		
		 
			 
		 
		do {
			String s="";
			for(int i = 0; i < n; i++) {
				s+= String.valueOf(tmp[i]);
			}
			int ss = Integer.parseInt(s);
			
			if(ppp == ss) {
				a = index;
				index++;
			}else if(qqq == ss) {
				b = index;
				index++;
			}else if (ppp == ss && qqq ==ss) {
				a = index;
				b = index;
				index++;
			}
		}while(nextPermutation(tmp));
			
		System.out.println(Math.abs(b-a));
		
	}

}

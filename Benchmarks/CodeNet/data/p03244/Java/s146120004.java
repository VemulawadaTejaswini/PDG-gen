import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力
		int n = sc.nextInt();                
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
          int in = sc.nextInt();
          list.add(in);
          if (i % 2 == 0) {
            list1.add(in);
          } else {
            list2.add(in);            
          }
		}
        ArrayList<Integer> hash = new ArrayList<Integer>(new HashSet <> (list));
        ArrayList<Integer> hash1 = new ArrayList<Integer>(new HashSet <> (list1));
        ArrayList<Integer> hash2 = new ArrayList<Integer>(new HashSet <> (list2));
        
        if (hash.size() == 1) {
        	System.out.println(n/2);
        	return;
        }
        
        int[] count1 = new int[hash1.size()];
        for (int i = 0; i < hash1.size(); i++) {
        	count1[i] = 0;
        	for (int j : list1) {
        		if (hash1.get(i) == j) {
        			count1[i] ++;
        		}
        	}
        }
        int[] count2 = new int[hash2.size()];
        for (int i = 0; i < hash2.size(); i++) {
        	count2[i] = 0;
        	for (int j : list2) {
        		if (hash2.get(i) == j) {
        			count2[i] ++;
        		}
        	}
        }
        
        int ans1 = 0;
        for (int i = 0; i <= count1.length - 1; i++) {
        	ans1 += count1[i];
        	if (i == count1.length -1) {
        		ans1 -= count1[i];
        	}
        }
        int ans2 = 0;
        for (int i = 0; i <= count2.length - 1; i++) {
        	ans2 += count2[i];
        	if (i == count2.length -1) {
        		ans2 -= count2[i];
        	}
        }
		System.out.println(ans1+ans2);
	}
	
}

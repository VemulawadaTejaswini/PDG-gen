import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		while(sc.hasNext()){
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(m + n == 0)break;
			boolean[] member = new boolean [n+1];
			for(int i=1;i<=n;i++) {
				member[i] = false;
			}
			
			for(int i=1;i<=n;i++) {
				String str = sc.next();
				if(i%3==0 && i%5==0 && str.equals("FizzBuzz")) 
					member[i] = true;
				else if(i%3==0 && str.equals("Fizz"))
					member[i] = true;
				else if(i%5==0 && str.equals("Buzz"))
					member[i] = true;
				else if(i%3 != 0 && i%5!=0 && str.equals(String.valueOf(i)))
					member[i] = true;
				else member[i] = false;
			}
			print(member,m,n);
		}
	}
	
	private static void print(boolean[] a,int m,int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1;i<=m;i++) {
			list.add(Integer.valueOf(i));
		}
		
		for(int i=1;i<=n;i++) {
			if(a[i] == true){
				int o = list.get(0);
				list.remove(0);
				list.add(o);
			}
			else {
				list.remove(0);
				m--;
			}
		}
		
		
		Collections.sort(list);
		
		for(int i=0;i<m;i++) {
			int o = list.get(0);
			list.remove(0);
			if(i==0)System.out.print(o);
			else System.out.print(" "+o);
		}
		System.out.println();
		list.clear();
	}
}


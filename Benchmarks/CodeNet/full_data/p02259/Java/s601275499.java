
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		int n=cin.nextInt(),c=0;List<Integer> A=new ArrayList<>();
		for(int i=0;i<n;i++)A.add(cin.nextInt());
		
		boolean flag=true;
		while(flag) {
			flag=false;
			for(int i=n-1;i>0;i--) {
				if(A.get(i)<A.get(i-1)) {
					Collections.swap(A, i, i-1);
					c++;
					flag=true;
				}
				
			}
		}
		
		
		for(int i=0;i<n;i++) {
			System.out.print(A.get(i));
			if(i!=n-1)System.out.print(" ");
		}
		System.out.println();
		System.out.println(c);
	}

}


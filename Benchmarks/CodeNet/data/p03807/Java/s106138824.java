import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		long[] a = new long[n];
		for(int i=0; i<n; i++){
			a[i] = scan.nextLong();
			if(a[i]%2!=0){count++;}
		}
		if(count%2==0){System.out.println("YES");}
			else{System.out.println("NO");}

	}
}
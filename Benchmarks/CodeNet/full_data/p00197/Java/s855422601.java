import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0)break;
			if(n>m){
				int l = m;
				m=n;
				n=l;
			}
			int count=0;
			while(n!=0){
				int l = n;
				n = m%n;
				m = l;
				count++;
			}
			System.out.println(m + " " + count);
		}
	}
}
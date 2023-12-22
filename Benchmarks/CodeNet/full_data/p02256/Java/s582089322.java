import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.valueOf(sc.next());
		int m=Integer.valueOf(sc.next());
		if(n==m){
			System.out.println(n);
			return;
		}else if(n>m){
			int temp=m;
			m=n;
			n=temp;
		}
		while(n!=0){
			m%=n;
			if(m==0){
				System.out.println(n);
				return;
			}
			n%=m;
		}
		System.out.println(m);
	}

}
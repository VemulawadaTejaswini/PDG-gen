import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		int k = sc.nextInt();
		while(k>0){
		 if(a%2==0){
			 a = a/2;
			 b += a;
		 }
		 else{
			 a--;
		 }
		 if(b%2==0){
			 b = b/2;
			 a+=b;
		 }
		 else
			 b--;
		}
		System.out.println(a+" "+b);
	}

}

import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String[] s= sc.nextLine().split(" ");
		long n=Long.parseLong(s[0]);
		long m=Long.parseLong(s[1]);
		if(n>1 && m>1){
			System.out.println((n-2)*(m-2));
		}else if(n==1 && m==1){
			System.out.println(1);
		}else{
			System.out.println(n*m-2);
		}
	}
}
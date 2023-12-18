import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		String c=a+b;
		int bool=0;
		int sum=Integer.parseInt(c);
		for(int i=1;i<=100;i++){
			if(sum%i==0&&sum==i*i){
				bool=1;
			}
		}
		if(bool==1){
			System.out.println("Yes");
		}
		if(bool==0){
			System.out.println("No");
		}	
	}
}
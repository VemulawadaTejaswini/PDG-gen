import java.util.Scanner;

public class Main {
	

	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		System.out.println((sum(b-a)-a));
	}
	public static int sum(int in){
		int ans=0;
		for(int i=1;i<in;i++){
			ans=ans+i;
		}
		return ans;
	}
}

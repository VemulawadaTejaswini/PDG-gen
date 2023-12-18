import java.util.Scanner;

public class Main {
	static int N,K;
	static boolean D[];
	static int min=10000;
	public static void main(String[] args) {
		Scanner stdIn= new Scanner(System.in);
		N=Integer.valueOf(stdIn.next());
		K=Integer.valueOf(stdIn.next());
		stdIn.nextLine();
		D=new boolean[10];
		for(int i=0;i<K;i++){
			D[Integer.valueOf(stdIn.next())]=true;
		}
		solve(3,0);
		System.out.println(min);
	}
	static boolean solve(int n,int num){
		if(n==-1){
			if(num>=N&&min>num){
				min=num;
				return true;
			}
			return false;
		}
		for(int i=0;i<10;i++){
			if(!D[i]&&solve(n-1,num+i*(int)Math.pow(10,n)))return true;
		}
		return false;
	}
}

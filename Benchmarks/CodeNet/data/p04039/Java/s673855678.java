import java.util.Scanner;

public class Main {
	static int N,K;
	static boolean D[];
	public static void main(String[] args) {
		Scanner stdIn= new Scanner(System.in);
		N=Integer.valueOf(stdIn.next());
		K=Integer.valueOf(stdIn.next());
		stdIn.nextLine();
		D=new boolean[10];
		for(int i=0;i<K;i++){
			D[Integer.valueOf(stdIn.next())]=true;
		}
		solve(4,0);
	}
	static boolean solve(int n,int num){
		if(n==-1){
			if(num>=N){
				System.out.println(num);
				return true;
			}
			return false;
		}
		for(int i=0;i<10;i++){
			if(!D[i]&&solve(n-1,num+i*(int)Math.pow(10,3-n)))return true;
		}
		return false;
	}
}

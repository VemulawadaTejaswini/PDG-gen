import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int n=sc.nextInt();
			System.out.println(sum(a%b*10,b,n,0));
		}
	}
	static int sum(int a,int b,int n,int sum){
		if(n==0){
			return sum;
		}else{
			return sum(a%b*10,b,n-1,sum+a/b);
		}
	}
}
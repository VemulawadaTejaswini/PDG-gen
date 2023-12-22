import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			int s=sc.nextInt();
			if(n==0&&s==0){
				break;
			}
			System.out.println(sum(n,s,0,0));
		}
	}
	static int sum(int n,int s,int i,int sum){
		if(n==0){
			return s==sum?1:0;
		}else{
			int count=0;
			for(;i<10;i++){
				count+=sum(n-1,s,i+1,sum+i);
			}
			return count;
		}
	}
}
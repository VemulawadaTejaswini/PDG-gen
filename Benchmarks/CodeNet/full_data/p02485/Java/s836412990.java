import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=0;
		while(a!=-1){
			a=sc.nextInt();
			int sum=0;
			if(a==0){
				a=-1;
				continue;
			}
			for(int i=0;i<1000;i++){
				sum+=a%10;
				a=a/10;
			}
			System.out.println(sum);
		}
	}
}
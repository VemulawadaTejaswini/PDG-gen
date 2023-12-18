import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		double ans=0.000000000;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		 for(int i=1;i<=n;i++){
			    long temp=i;
			    long tri=0;
			    while(temp<k){
			      temp*=2;
			      tri++;
			    }
			    ans+=1.000000000/(n*Math.pow(2,tri));
			 }
		 System.out.println(ans);
	}
}

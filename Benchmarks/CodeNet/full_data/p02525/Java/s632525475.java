import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0){
				break;
			}else{
				int sum=0;
				double m=0,a=0;
				int[] s=new int[n];
				for(int i=0;i<n;i++){
					s[i]=sc.nextInt();
					sum+=s[i];
				}
				m=sum/n;
				for(int i=0;i<n;i++){
					double b=s[i]-m;
					a=a+b*b;
				}
				a=Math.sqrt(a/n);
				System.out.printf("%.8f\n",a);
			}
		}
	}
}
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j,sum,count;
		boolean p[]=new boolean[10000];
		Arrays.fill(p, true);
		for(i=2;i<10000;i++){
			if(p[i]){
				for(j=2;i*j<10000;j++){
					p[i*j]=false;
				}
			}
		}//
		while(true){
			sum=0;count=0;i=2;
			n=sc.nextInt();
			if(n==0) break;
			while(count<n){
				if(p[i]){
					sum+=i;
					count++;
				}
				i++;
			}//
			System.out.println(sum);
		}
	}
}
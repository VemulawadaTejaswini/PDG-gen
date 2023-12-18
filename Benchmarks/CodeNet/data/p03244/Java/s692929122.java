import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int v1[]=new int[n/2];
		int v2[]=new int[n/2];

		for(int i=0;i<n/2;++i){
			v1[i]=sc.nextInt();
			v2[i]=sc.nextInt();
		}

		int v1max=1, v1sec=1, v1num1=v1[0], v1num2;
		int v2max=1, v2sec=1, v2num1=v2[0], v2num2;
		Arrays.sort(v1);
		Arrays.sort(v2);

		for(int i=0;i<n/2;++i){
			int sum=1;
			for(; i<n/2-1&&v1[i]==v1[i+1] ;++i){
				++sum;
			}
			if(v1max<sum){
				v1max=sum;
				v1num1=v1[i];
			}
			else if(v1sec<sum){
				v1sec=sum;
				v1num2=v1[i];
			}
		}

		for(int i=0;i<n/2;++i){
			int sum=1;
			for(; i<n/2-1 && v2[i]==v2[i+1];++i){
				++sum;
			}
			if(v2max<sum){
				v2max=sum;
				v2num1=v2[i];
			}
			else if(v2sec<sum){
				v2sec=sum;
				v2num2=v2[i];
			}
		}

		if(v1num1!=v2num1)	System.out.println(n-v1max-v2max);
		else{
			if(v1sec+v2max>v1max+v2sec) System.out.println(n-v1sec-v2max);
			else System.out.println(n-v1max-v2sec);
		}


	}
}

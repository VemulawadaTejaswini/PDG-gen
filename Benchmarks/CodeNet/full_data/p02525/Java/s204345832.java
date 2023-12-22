import java.util.Scanner;
public class main {
public static void main(String args[]){
	int size=1000,sum=0;
	double a=0;
	double b;
	int[] list=new int[size];
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n==0){
		System.exit(-1);
	}else{
	for(int i=0;i<n;i++){
		int input=sc.nextInt();
		list[i]=input;
		sum+=list[i];
	}
	for(int j=0;j<n;j++){
	    a+=Math.pow(list[j]-sum/n,2)/n;
	}
	b=Math.sqrt(a);
	System.out.printf("%.8f\n",b);
	}
}
}
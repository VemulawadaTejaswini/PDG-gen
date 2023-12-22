import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long i[]=new long[n];
		long sum=0;
		long ans=0;
		int flag=0;
		for(int k=0;k<n;k++){
			i[k]=sc.nextLong();
		}
		for(int k=0;k<n;k++){
			for(int j=0;j<k;j++){
				sum +=i[k]*i[j];
				flag+=i[k]*i[j]/200003;
			}
		}
		System.out.println(""+(sum-flag*2000003));
	}
}
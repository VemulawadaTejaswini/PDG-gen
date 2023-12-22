import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long f[]=new long[n];
		for(int i=0;i<n;i++){
		f[i]=(long)(sc.nextDouble()*1000000000);
		}
		int ans=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
				if(f[i]*f[j]%100000000000000000l==0d){
					System.out.println(f[i]+"**"+f[j]);
					ans++;
				}
			}
		}
		System.out.println(""+ans);
	}
}
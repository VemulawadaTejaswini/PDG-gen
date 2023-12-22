
import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		boolean[] f=new boolean[1000000];
		Arrays.fill(f, true);
		for(int i=2;i<1000000;i++){
			if(f[i]){
				for(int j=i+i;j<1000000;j+=i){
					f[j]=false;
				}
			}
		}
		while(sc.hasNextInt()){
			int n=sc.nextInt();
			int cnt=0;
			for(int i=2;i<=n;i++){
				if(f[i]==true&&n%i==0)cnt++;
			}
			System.out.println(cnt);
		}
		sc.close();
	}
}
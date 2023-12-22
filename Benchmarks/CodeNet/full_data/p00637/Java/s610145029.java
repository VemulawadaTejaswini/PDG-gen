
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,n,f;
		f=0;
		
		
		for(;;){
			n=sc.nextInt();
			if(n==0)break;
			int p[] = new int[50];
			for(i=0;i<n;i++){
				p[i]=sc.nextInt();
				if(f==0){
					System.out.print(p[i]);
					f=i+1;
				}
				if(i>1&&p[i]-1!=p[i-1]){
					System.out.print("-"+p[i-1]+" "+p[i]);
				}
				if(i==n-1){
					System.out.print("-"+p[i]+"\n");
				}
			}
			f=0;
		}
		
	}
}
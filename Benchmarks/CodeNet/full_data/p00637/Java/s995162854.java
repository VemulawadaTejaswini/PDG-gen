
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,n,f,count;
		f=0;
		count=0;
		
		for(;;){
			n=sc.nextInt();
			if(n==0)break;
			int p[] = new int[50];
			for(i=0;i<n;i++){
				p[i]=sc.nextInt();
			}
			count=p[0];
			for(i=0;i<n;i++){
				if(i==0){
					System.out.print(p[0]);
				}else if(i==n-1){
					if(p[i]-1==p[i-1]){
						System.out.print("-"+p[i]+"\n");
					}else{
						System.out.print(" "+p[i]+"\n");
					}
				}else{
					if(p[i]-1==p[i-1]&&p[i]+1==p[i+1]){
					}
					if(p[i]-1!=p[i-1]&&p[i]+1==p[i+1]){
						System.out.print(" "+p[i]);
					}
					if(p[i]-1==p[i-1]&&p[i]+1!=p[i+1]){
						System.out.print("-"+p[i]);
					}
					if(p[i]-1!=p[i-1]&&p[i]+1!=p[i+1]){
						System.out.print(" "+p[i]);
					}
					
					
				}
				
				
			}
		}
		
	}
}
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int l=sc.nextInt();
			if(l==0)break;
			int c=12,p=0,ans=0;
			for(int i=0;i<12;i++){
				int m=sc.nextInt();
				int n=sc.nextInt();
				l-=(m-n);
				if(l<=0){
					p=c;
					c=i+1;
						if(c<p){
							ans=c;
					}
				}
			}
			if(l>0)System.out.println("NA");
			else System.out.println(ans);

		}
	}
}
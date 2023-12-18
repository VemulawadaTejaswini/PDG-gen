import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		long k=sc.nextLong();
		int p=1<<m;
		if(k<p){
			if(m==1 && k==1){
				System.out.println(-1);
				return;
			}
			if(m==1 && k==0){
				System.out.print(0+" "+0+" "+1+" "+1);
				return;
			}
			for(int i=0; i<p; i++){
				if(i==k){
					continue;
				}
				System.out.print(i+" ");
			}
			System.out.print(k+" ");
			for(int i=p-1; i>=0; i--){
				if(i==k){
					continue;
				}
				System.out.print(i+" ");
			}
			System.out.print(k);
		}else{
			System.out.println(-1);
		}
	}
}

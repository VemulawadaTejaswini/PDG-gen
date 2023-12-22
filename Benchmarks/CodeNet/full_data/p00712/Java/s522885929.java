import java.util.Scanner;

public class Main {
	static int p,q,a,n,count;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		while(true){
			count=0;
			p=sc.nextInt();
			q=sc.nextInt();
			a=sc.nextInt();
			n=sc.nextInt();
			if(p+q+a+n==0) break;
			search(1,0,0,1);
			System.out.println(count);
		}
	}
	static void search(int deno,int nume,int k,int t){
		if(n<k) return;
		if(p*deno==q*nume){
			count++;
		}
		for(int i=t;i*deno<=a;i++){
			int de=deno*i;
			int nu=(nume*i)+deno;
			search(de,nu,k+1,i);
		}
	}
}
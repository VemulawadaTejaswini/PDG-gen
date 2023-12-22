//2706 石井夏鈴 問3
import java.util.Scanner;
public class Main{
	int x,y,b,p,a;
	int a1=0;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=1;i<=N;i++){
			x=sc.nextInt();
			y=sc.nextInt();
			b=sc.nextInt();
			p=sc.nextInt();
			a=(x*b+y*p);
			
			if(b>=5&&p>=2){
				a1=(x*b+y*p)*4/5;
			}else{
				if(b<5){
					b=5;
				}
				if(p<2){
					p=2;
				}
				a1=(x*b+y*p)*4/5;
			}
			if(a>a1){
				a=a1;
			}
			System.out.println(a);
		}
	}
	
	public static void main(String[]args){
		Main obj=new Main();
		obj.solve();
	}
}
//問題３　2704 上石彩花
import java.util.Scanner;
public class Main{
	public void solve(){
		Scanner sc=new Scanner(System.in);
		int N,x,y,b,p;
		double w,goukei,goukei1;
		
		w=0.8;
		N=sc.nextInt();
		goukei1=0;
		
		for(int i=1;i<=N;i++){
		x=sc.nextInt();
		y=sc.nextInt();
		b=sc.nextInt();
		p=sc.nextInt();
			
			goukei=(x*b)+(y*p);
			
			if(b>=5&&p>=2){
				goukei1=(x*w*b)+(y*w*p);
				}else{
					if(b<5){
						b=5;
						}
						if(p<2){
							p=2;
						}
						goukei1=(x*w*b)+(y*w*p);
				}
					if(goukei>goukei1){
						goukei=goukei1;
					}
					System.out.println(goukei);
		}
	}
		public static void main(String[]args){
			Main obj=new Main();
			obj.solve();
		}
}
import java.util.Scanner;
public class Main{
	public void solve(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int r=0;r<N;r++){
			int nr=sc.nextInt();
			int pr=sc.nextInt();
			int ns=sc.nextInt();
			int ps=sc.nextInt();
			int goukei=nr*ns+pr*ps;
			if(ns>=5&&ps>=2){
				goukei=(nr*ns+pr*ps)*4/5;
			}else{
				if(ns<5){
					ns=5;
				}
				if(ps<2){
					ps=2;
				}
				int wari=(nr*ns+pr*ps)*4/5;
				if(goukei>=wari){
					goukei=wari;
				}
			}
			System.out.println(goukei);
		}
	}
	public static void main(String[]args){
		Main obj=new Main();
		obj.solve();
	}
}
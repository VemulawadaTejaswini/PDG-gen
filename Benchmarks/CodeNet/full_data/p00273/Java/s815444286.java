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
				goukei=goukei*4/5;
			}else{
				if(nr<5){
					nr=5;
				}
				if(pr<2){
					pr=2;
				}
				int wari=goukei*4/5;
				if(goukei<wari){
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
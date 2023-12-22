import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int nkin,pkin,nmai,pmai,cnt;
	int niti = sc.nextInt();
	int goukei,karikei;
	int[] kei = new int[niti];
	
	public void sinnnotikara(){
		for(cnt = 0;cnt <= niti-1;cnt++){
			nkin = sc.nextInt();
			pkin = sc.nextInt();
			nmai = sc.nextInt();
			pmai = sc.nextInt();
			
			if (nmai>=5&&pmai>=2){
				goukei = (nkin*nmai+pkin*pmai)*8/10;
			}else if(nmai>=5&&pmai<=2){
				goukei = (nkin*nmai+pkin*pmai);
				pmai = 2;
				karikei = (nkin*nmai+pkin*pmai)*8/10;
			}else if (nmai<=5&&pmai>=2){
				goukei = (nkin*nmai+pkin*pmai);
				nmai = 5;
				karikei = (nkin*nmai+pkin*pmai)*8/10;
			}else{
				goukei = (nkin*nmai+pkin*pmai);
				nmai = 5;
				pmai = 2;
				karikei = (nkin*nmai+pkin*pmai)*8/10;
			}
			if (goukei < karikei){
					kei[cnt] = goukei;
			}else{
					kei[cnt] = karikei;
			}
		}
	}
	
	public void chaos(){
		for(cnt = 0;cnt <= niti-1;cnt++){
			System.out.println(kei[cnt]);
		}
	}


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main YO = new Main();
		YO.sinnnotikara();
		YO.chaos();
	}
}
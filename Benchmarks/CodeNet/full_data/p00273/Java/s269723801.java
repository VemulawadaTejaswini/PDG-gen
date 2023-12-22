import java.util.Scanner;
public class Main {
	Scanner sc = new Scanner(System.in);
	int niti;
	int x;
	int y;
	int b;
	int p;
	int[] goukei = new int[365];
	int a;
	
	public void keisan(){
		niti = sc.nextInt();
		for(a=0;a<niti;a++){
			x = sc.nextInt();
			y = sc.nextInt();
			b = sc.nextInt();
			p = sc.nextInt();
			if(b>=5&&p>=2){
				goukei[a] = ((x * 8/10) * b) + ((y * 8/10) * p);
			}else if(b>=5&&p<=2){p = 2;goukei[a] = ((x * 8/10) * b) + ((y * 8/10) * p);
			}else{goukei[a] = (x * b) + (y * p);
			}
		}
	}
	
	public void hyouji(){
		for(a=0;a<=niti-1;a++){
			System.out.println(goukei[a]);
		}	
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main go = new Main();
		go.keisan();
		go.hyouji();
	}

}
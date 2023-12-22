import java.util.Scanner;
public class Main {
	Scanner sc = new Scanner(System.in);
	int kode,mai,a;
	int[] kin ={6000,4000,3000,2000};
	int[] gou = new int[4];
	
	public void keisan(){
		System.out.println("チケットの種類と枚数を入力してください");
		for(a=0;a<=3;a++){
			kode = sc.nextInt();
			mai = sc.nextInt();
			switch(kode){
			case 1:
				gou[a] += kin[kode - 1] * mai; break;
			case 2:	
				gou[a] += kin[kode - 1] * mai; break;
			case 3:
				gou[a] += kin[kode - 1] * mai; break;
			case 4:	
				gou[a] += kin[kode - 1] * mai; break;
			}
		}
	}
	
	public void hyouji(){
		for(a=0;a<=3;a++){
			System.out.println(gou[a]);
		}	
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main go = new Main();
		go.keisan();
		go.hyouji();
		
	}

}
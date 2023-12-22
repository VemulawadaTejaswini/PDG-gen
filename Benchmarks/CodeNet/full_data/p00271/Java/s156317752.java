public class Main {
	int []syurui =  {3,1,4,2};
	int []maisu = {10,4,1,5};
	int[] iei = new int[4];
	int[] gokei= new int[4];
	int kusa;
	int ee;
	int ww;
public void me(){
	for(kusa=0;kusa<4;kusa++){
		ee = syurui[kusa];
		switch(ee){
		case 1: gokei[kusa] =  maisu[kusa]* 6000;
				break;
		case 2: gokei[kusa] =  maisu[kusa] *4000;
				break;
		case 3: gokei[kusa] =  maisu[kusa] *3000;
				break;
		case 4: gokei[kusa] =  maisu[kusa]* 2000;
				break;
		}
	}

}
public void hyouji(){

		for(ww=0;ww<4;ww++){	
			System.out.println(gokei[ww]);
		}
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main A = new Main();
		A.me();
		A.hyouji();


	}

}
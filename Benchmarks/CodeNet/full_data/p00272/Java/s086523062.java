public class Main {
	int []t =  {3,1,4,2};
	int []n = {10,4,1,5};
	int[] gokei= new int[4];
	int kusa;
	int ee;
	int ww;
public void me(){
	for(kusa=0;kusa<4;kusa++){
		ee = t[kusa];
		switch(ee){
		case 1: gokei[kusa] =  n[kusa]* 6000;
				break;
		case 2: gokei[kusa] =  n[kusa] *4000;
				break;
		case 3: gokei[kusa] = n[kusa] *3000;
				break;
		case 4: gokei[kusa] =  n[kusa]* 2000;
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
		Main A = new Main();
		A.me();
		A.hyouji();


	}

}
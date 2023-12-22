public class Main {
	Scanner sc =new Scanner(System.in);
	
	int kingaku;
	int[] goukei = new int[4];
	int x;

	public void syurui(){
		for(x=0;x<=3;x++){
			int syurui = sc.nextInt();
			int maisuu = sc.nextInt();
		
		
			switch(syurui){
				case 1: kingaku = 6000; break;
				case 2: kingaku = 4000; break;
				case 3: kingaku = 3000; break;
				case 4: kingaku = 2000; break;
			}
			goukei[x] = kingaku * maisuu;
		}
	}
	public void hyouji(){
		for(x=0;x<=3;x++){
			System.out.println(goukei[x]);
		}
	}


	public static void main(String[] args) {
		Main hai = new Main();
		hai.syurui();
		hai.hyouji();

	}

}
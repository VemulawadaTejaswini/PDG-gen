public class Main {
	Scanner sc =new Scanner(System.in);
	int x;
	int nissu = sc.nextInt();
	int[]  goukei = new int[nissu];
	double gnyuryo,gpuryo;;
	public void ryoukin(){
		for(x=0;x<=nissu-1;x++){
			int nyuryo = sc.nextInt();
			int puryo = sc.nextInt();
			int nyumai = sc.nextInt();
			int pumai  = sc.nextInt();

				if(nyumai>=5&&pumai>=2){
					gnyuryo = (nyuryo * nyumai)* 0.8 ;
					gpuryo = (puryo * pumai)* 0.8;
				}else{
				if(nyumai==6&&pumai<=0){
					goukei[x] = (int)((goukei[x]+puryo*2)*0.8);	
				}}
				gpuryo = puryo * pumai;
				gnyuryo = nyuryo * nyumai;
				goukei[x] = (int) (gnyuryo + gpuryo);
		}
	}
	public void hyouji(){
		for(x=0;x<=nissu-1;x++){
		System.out.println(goukei[x]);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main kin = new Main();
		kin.ryoukin();
		kin.hyouji();
	}
}
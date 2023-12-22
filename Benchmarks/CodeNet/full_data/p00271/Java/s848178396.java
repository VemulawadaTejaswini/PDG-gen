public class Main {
	Scanner sc = new Scanner(System.in);
	
	int[] dai = new int[8];
	int[] tei = new int[8];
	int[] sa = new int[8];
	int nikka ;
	int ww ;
	
	
public void syukei(){
	for (nikka=1;nikka <8;nikka++){
		System.out.println(nikka + "日目の最大気温を入力してください。；");
		 dai[nikka] = sc.nextInt();
		 System.out.println(nikka + "日目の最低気温を入力してください。；");
		 tei[nikka] = sc.nextInt();
		 sa[nikka] = dai[nikka] - tei [nikka];
		
	}
	
}
public void hyouji(){
	for(ww=1;ww<8;ww++){
		
	
	System.out.println(sa[ww]);
	}
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Mondai20131 wao = new Mondai20131();
		wao.syukei();
		wao.hyouji();
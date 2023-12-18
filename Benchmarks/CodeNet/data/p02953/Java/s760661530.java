public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] h = new int[a];
		for(int i = 0; i < a; i++){
			h[i] = sc.nextInt();
		}
		boolean flg = true;
		for(int i = h.length-1; i >= 0; i--){
			for(int j = 0; j < i; j++){
				if(h[i]-h[j] >= 2){
					flg = false;
				}
			}
		}
		if(flg){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}

}
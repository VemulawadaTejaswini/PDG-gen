public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int n =0 ;
		
		switch(n % 10) {
		
		case 2:
		case 4:
		case 5:
		case 7:
		case 9:
			System.out.println("hon");
			break;
		 
		case 0:
		case 1:
		case 6:
		case 8: 
			System.out.println("pon");
			break;
		
		case 3:
			System.out.println("bon");
			break;
		
		default: break;
		
		}
			
	}
}
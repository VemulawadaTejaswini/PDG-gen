public class Main {
	public static void main(String[] args) {
		try(Scanner X = new Scanner(System.in)){
			int oak = X.nextInt();
			System.out.println(calc(oak));		
		}		
	} 
	public static int calc(int oak) {
		if(oak >= 400 && oak <= 599) {
			return 8;
		}else if(oak >= 600 && oak <= 799) {
			return 7;
		}else if(oak >= 800 && oak <= 999) {
			return 6;
		}else if(oak >= 1000 && oak <= 1199) {
			return 5;
		}else if(oak >= 1200 && oak <= 1399) {
			return 4;
		}else if(oak >= 1400 && oak <= 1599) {
			return 3;
		}else if(oak >= 1600 && oak <= 1799) {
			return 2;
		}else if(oak >= 1800 && oak <= 1999) {
			return 1;
		}
		return 0;
	}
}

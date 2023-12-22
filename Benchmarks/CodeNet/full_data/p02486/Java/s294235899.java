public class Main {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int result = 0;
		int num = 0;
		while(true){
			int n = scan.nextInt();
			int x = scan.nextInt();
			for(int i = 0 ; i < n - 2 ; i++){
				for(int j = i + 1 ; j < n - 1 ; j++){
					for(int k = i + 2 ; k < n ; k++){
						if(i + j + k == x){
							result++;
						}
					}
				}
			}
			num++;
			if(num == n){
				break;
			}
		}
	}

}
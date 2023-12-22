import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doIt();

	}
	
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			int[] num = new int[10];
			for(int j = 0; j < 10; j++){
				num[j] = sc.nextInt();
			}
			int left = 0;
			int right = 0;
			boolean bOK = true;
			for(int j = 0; j < 10; j++){
				if(right > left){
					if(num[j] > right){
						right = num[j];
					}
					else if(num[j] > left){
						left = num[j];
					}
					else{
						bOK = false;
						break;
					}
				}
				else{
					if(num[j] > left){
						left = num[j];
					}
					else if(num[j] > right){
						right = num[j];
					}
					else{
						bOK = false;
						break;
					}
				}
			}
			if(bOK){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}
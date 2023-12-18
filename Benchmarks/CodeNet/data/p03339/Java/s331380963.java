import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws IOException{
                ArrayList<Integer> direction = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int np = sc.nextInt();
		InputStreamReader isr = new InputStreamReader(System.in);
		
		for(int i = 0; i < np; i++) {
			direction.add(isr.read());
		}
		
		int count = np;
		for(int i = 0; i < np; i++) {
			int cc = 0;
			
			for(int n = 0; n <np; n++) {
				int target = direction.get(n);
				
				if(n < i) {
					/* Wと比較する
					 * directionには10進数のユニコードが格納されている
                                         *  Wに対応する87と比較
					 */
					if(target == 87) {
						cc++;
						
						if(cc >= count) {
							break;
						}
						
					}
				}
				
				if(n > i) {
					/* Eと比較する
					 * Wと同様、Eに対応する69と比較
					 */
					if(target == 69){
						cc++;
						
						if(cc >= count) {
							break;
						}
					}
				}
			}
			
			count = Math.min(count, cc);
			
		}
		
		System.out.println(count);
		
	}
}
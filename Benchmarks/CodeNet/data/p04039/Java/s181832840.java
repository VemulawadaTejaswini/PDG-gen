import java.io.InputStreamReader;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(new InputStreamReader(System.in))){
			int N = scan.nextInt();
			int K = scan.nextInt();
			
			boolean[] D = new boolean[10];
			
			int min = 0;
			int minNot0 = 1;
			
			for(int i = 0; i<K; i++){
				int tmp = scan.nextInt();
				
				if(min == tmp){
					min++;
					minNot0 = min;
				}
				if(minNot0 == tmp){
					minNot0++;
				}
				D[tmp] = true;
			}
			
			String nStr = String.valueOf(N);
			StringBuffer ans = new StringBuffer();
			boolean isLarge = false;
			
			for(int i = 0; i<nStr.length(); i++){
				if(isLarge){
					ans.append(min);
				}else if(D[Character.digit(nStr.charAt(i),10)] == false){
					ans.append(nStr.charAt(i));
				}else{
					for(int j = Character.digit(nStr.charAt(i),10); j<K; j++){
						if(D[j] == false){
							ans.append(j);
							isLarge = true;
							break;
						}
					}
					if(isLarge == false){
						ans.append(minNot0);
						isLarge = true;
						i--;
					}
				}
			}
			
			System.out.println(ans.toString());

		}
	}
}

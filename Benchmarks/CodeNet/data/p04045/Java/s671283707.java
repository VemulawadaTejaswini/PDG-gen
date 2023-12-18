import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N = keyboard.nextInt();
		int K = keyboard.nextInt();
		
		String[] hate = new String[K];
		
		for(int i = 0; i < K; i ++) {
			hate[i] = keyboard.next();
		}
		
		boolean error = true;
		
		while(error) {
			String NN = String.valueOf(N);
			
			String[] bunkatsu = new String[NN.length()];			
			
			for(int i = 0; i < NN.length(); i ++) {
				bunkatsu[i] = NN.substring(i, i+1);	
			}
			for(int i = 0; i < NN.length(); i ++) {
				if(Arrays.asList(hate).contains(bunkatsu[i])){
					 N ++;
					 break;
		          }else if(i == NN.length() - 1){
		               error = false;
		          }
				}
		}
		System.out.println(N);
		keyboard.close();
	}
}
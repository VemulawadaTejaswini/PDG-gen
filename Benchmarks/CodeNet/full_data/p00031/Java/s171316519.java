import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int[] hundou = new int[10];
		hundou[0] = 1;
		for(int i = 1; i < 10; i++){
			hundou[i] = 2 * hundou[i-1];
		}
 
		while(sc.hasNext()){
			boolean[] use = new boolean[10];
			int target = sc.nextInt();

			for(int i = 9; 0 <= i; i--){
				if(target >= hundou[i]){
					use[i] = true;
					target -= hundou[i];
				}else{
					use[i] = false;
				}
			}

			for(int i = 0; i < 10; i++){
				if(use[i]){
					System.out.print(hundou[i]);
					System.out.print(" ");
				}
			}
			System.out.println("");
 		}
	}
}
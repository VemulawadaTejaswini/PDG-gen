import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		//String word_before = sc.next();
		int array[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		int N = sc.nextInt();
//		int K = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int b = sc.nextInt();
			for (int j = 0; j < 3; j++) {
				for (int j2 = 0; j2 < 3; j2++) {
					if(array[j][j2]==b){
						array[j][j2] =0;
					}
				}
			}
			
		}
		boolean flag = false;
		for (int i = 0; i < 3; i++) {
			if(array[i][0]==array[i][1]&&array[i][1]==array[i][2]){
				flag  = true;
			}
		}
		for (int i = 0; i < 3; i++) {
			if(array[0][i]==array[1][i]&&array[1][i]==array[2][i]){
				flag  = true;
			}
		}
		if(array[0][0]==array[1][1]&&array[1][1]==array[2][2]||array[2][0]==array[1][1]&&array[1][1]==array[0][2]){
			flag = true;
		}

		if(flag){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}		
		
      	sc.close();
    }
		
		
}
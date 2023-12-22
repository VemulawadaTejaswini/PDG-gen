import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][][] count = new int[4][3][10];
		int b, f, r, v;
		
		for (int i = 0; i < n; i++){
			b = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			v = sc.nextInt();
			count[b][f][r] += v;
		}
		
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 3; j++){
				for (int k = 0; k < 10; k++){
					if (k < 9){System.out.print(count[i][j][k] + " ");}
					else {System.out.println(count[i][j][k]);}
				}
			}
			if (i < 3){
				System.out.println("####################");
			}
		}
	}
}
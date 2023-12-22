import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double [] c = new double [8];
		for(int i = 0; i < n; i++){
			for(int m = 0; m < 8; m++){
				c[m] = in.nextDouble();
			}
			if (((c[1] - c[3]) / (c[0] - c[2])) == ((c[5] - c[7]) / (c[4] - c[6]))){
				System.out.println("YES");
			}
			else if(c[0] == c[2] && c[4] ==c[6]){
				System.out.println("YES");
			}
			else if(c[1] == c[3] && c[5] ==c[7]){
				System.out.println("YES");
			}
			else System.out.println("NO");
			
		}

	}

}
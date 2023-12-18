import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int[] costp = new int[w];
		int[] costq = new int[h];
		int max = 0, cost = 0;

		for(int i=0; i<w; i++){
			costp[i] = sc.nextInt();
			cost += costp[i]*2;
		}
		Arrays.sort(costp);
		for(int i=0; i<h; i++){
			costq[i] = sc.nextInt();
			cost += costq[i]*2;		
		}
		Arrays.sort(costq);

		cost -= Math.max(costp[w-1], costq[h-1]);

		int p=0;
		for(int i=0; i<h-1; i++){
			while(true){
				if(costq[i]>costp[p]){
					cost += costp[p]*(h-1-i);
					p++;
				}else{
					cost += costq[i]*(w-1-p);
					break;
				}
			}
		}

		System.out.println(cost);
	}
}
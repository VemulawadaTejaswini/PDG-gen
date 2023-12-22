import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] x = new int[3000];
		int[] y = new int[3000];
		int tmp;
		for(int i=0;i<3000;i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			if(x[i] == 0 && y[i] == 0) break;
			if(x[i] > y[i]){
				tmp=x[i];
				x[i]=y[i];
				y[i]=tmp;
			}
			System.out.println(x[i]+" "+y[i]);
		}
	}
}
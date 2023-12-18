import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int max =0;
		for(int i = 0; i < n; i++){
			x[i] = sc.nextInt();
			if(i !=0 && max < x[i]){
				max = x[i];
			}
		}
		int res = 0;
		int min = 0;

		for(int i = 1; i <= max; i++){
			int tmp = 0;
			for(int j = 0; j < x.length; j++){
				tmp += (i - x[j]) * (i - x[j]);
			}
			if(i == 1){
				min = tmp;
			}else if(min > tmp){
				min = tmp;
			}
		}
		System.out.println(min);

	}


}
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while(true){
			int num = input.nextInt();
			if(num == 0)break;
			int[] a = new int[num];
			for(int i = 0 ; i < num ; i++){
				a[i] = input.nextInt();
			}
			int max = 0;
			for(int i = 0 ; i < num ; i++){
				int tmp = 0;
				for(int j = i ; j < num ; j++){
					tmp += a[j];
					max = Math.max(max, tmp);
				}
			}
			System.out.println(max);
		}
		input.close();
	}
}
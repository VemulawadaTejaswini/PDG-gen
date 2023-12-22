import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[5];
		for(int i = 0;i < 5;i++){
			num[i] = Integer.parseInt(input.next());
		}
		sort(num);
		for(int i = 0;i < 5;i++){
			System.out.print(num[i] + " ");
		}


	}

	public static void sort(int[] num){
		int dammy = 0;
		for(int i = 0;i < 5;i++){
			for(int j = i+1;j < 5;j++){
				if(num[i] < num[j]){
					dammy = num[i];
					num[i] = num[j];
					num[j] = dammy;
				}
			}
		}
	}

}
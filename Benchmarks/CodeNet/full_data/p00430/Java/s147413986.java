import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n, i;
		int[] data;
		while((n = sc.nextInt()) != 0){
			data = new int[n + 1];
			data[0] = n;
			while(data[0] > 1){
				for(i = n - 1; data[i] < 2; i--);
				do{
					
					data[i]--;
					data[i + 1]++;
				}while(data[i] < data[++i]);
				System.out.print(data[0]);
				for(i = 1; data[i] != 0; i++){
					System.out.print(" " + data[i]);
				}
				System.out.println();
			}
		}
	}
}
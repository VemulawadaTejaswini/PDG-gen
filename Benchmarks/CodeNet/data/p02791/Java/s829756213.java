import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0;i<n;i++){
			array[i] = sc.nextInt();
		}

		int min = 0;
		int count = 0;
		min = array[0];
		for(int i = 1;i<n;i++){
			if(min >= array[i]){
				min = array[i];
			}else{
				count++;
			}
		}
System.out.println(n-count);

	}
}
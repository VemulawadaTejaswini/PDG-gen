import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 int N = scanner.nextInt();
		 int[] array = new int[N];
		 int sum = 0;
		 for(int i = 0 ; i < N ; i++){
			 array[i] = scanner.nextInt();
			 sum = sum + array[i];
		 }
		 Arrays.sort(array);
		 int min = array[0];
		 int max = array[N-1];
		 System.out.print(min + " " + max + " " + sum);
		 scanner.close();
	}

}
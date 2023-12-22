import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.next());
		int[] arrays = new int[number];

		for (int i = 0; i < number; i++) {

			arrays[i] = Integer.parseInt(sc.next());

		}
		
		StringBuilder sb =insertionSort(arrays,number);
		
		System.out.print(sb);
		sc.close();
		
	}

	private static StringBuilder insertionSort(int[] arrays, int number) {
		
		StringBuilder sb = new StringBuilder();
		
		store(sb,arrays);
		for(int i =1;i<number;i++){
			
			int v = arrays[i];
			int j = i -1;
			while( 0<= j && v < arrays[j]){
				arrays[j+1] = arrays[j];
				j--;
			}
			arrays[j+1] = v;
			store(sb,arrays);
		}
		
		return sb;
		
	}

	private static void store(StringBuilder sb, int[] arrays) {
		
		for(int i =0; i<arrays.length;i++){
			
			sb.append(arrays[i]);
			
			if(i != arrays.length -1){
				sb.append(" ");
			}
			
			
		}
		
		
		sb.append("\n");
	}
}


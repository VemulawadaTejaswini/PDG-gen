import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line1 = Integer.parseInt(br.readLine());
		int[] array = new int[line1+1];
		String[] line2 = br.readLine().split(" ");
		for(int i = 0; i < line1 ; i++) {
			array[i+1] = Integer.parseInt(line2[i]);
		}
		System.out.println(metodo(line1, array));
	}
	
	public static int metodo(int N, int[] array) {
		int[] array1 = new int[N+1];
		array1[2] = Math.abs(array[1] - array[2]);
		for(int i = 3; i <= N; i++) {
				array1[i] = Math.min(array1[i-1] + Math.abs(array[i-1] - array[i]), array1[i-2] + Math.abs(array[i-2]-array[i]));
			}		
		return array1[N];
	}
}
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println(metodo());
	}
	public static float metodo() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line1 = br.readLine().split(" ");
		int N = Integer.parseInt(line1[0]);
		int W = Integer.parseInt(line1[1]);
		int[] n1 = new int[N+1];
		int[] n2 = new int[N+1];
		
		
		for(int i = 1; i <= N ; i++) {
			line1 = br.readLine().split(" ");
			n1[i] = Integer.parseInt(line1[0]);
			n2[i] = Integer.parseInt(line1[1]);
		}
		
		float[] array = new float[W+1];
		float[] array1 = new float[W+1];
		
		
		for(int i = 0; i <= W; i++) {
			if(i >= n1[1]) {
				array[i] = n2[1];
			}
		}
		
		for(int i = 2; i <= N ; i++) {
			for(int w = 1; w <= W ; w++) {
				array1[w] = array[w];
				if(w >= n1[i]) {
					array1[w] = Math.max(array1[w], n2[i] + array[w-n1[i]]);
				}
			}
			array = array1;
			array1 = new float[W+1];
		}
		
		return array[W];
	}
}
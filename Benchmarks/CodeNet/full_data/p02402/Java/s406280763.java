import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String  first = br.readLine();
		int[] array = new int[Integer.parseInt(first)];
		String str = br.readLine();
		String[] stra = str.split(" ");
		for (int i = 0 ; i < array.length ; i++){
			array[i] = Integer.parseInt(stra[i]);
		}
		int max = array[0]; int min = array[0]; long sum = 0;
		for (int x = 0 ; x < array.length ;x++){
			max = Math.max(max, array[x]);
			min = Math.min(min,array[x]);
			sum = sum + array[x];
		}
		System.out.println(min + " " + max + " " + sum);
	}

}
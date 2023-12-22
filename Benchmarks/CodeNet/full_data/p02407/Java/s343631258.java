import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	
	static int[] array;
	
	public static void main(String[] args)throws IOException{
		Main app = new Main();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		int n = Integer.parseInt(reader.readLine());
		array = new int[n];
		String string = reader.readLine();
		
		for(int i = 0; i < n; i++)
			array[i] = Integer.parseInt(string.split(" ")[i]);
		
		app.reverse(array);
		
		for(int i = 0; i < n; i++){
			if(i != n - 1)
				System.out.print(array[i] + " ");
			else
				System.out.println(array[i]);
		}
		reader.close();
	}
	public void reverse(int[] array){
		int temp;
		for(int i = 0; i < array.length / 2; i++){
			temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
	}
}
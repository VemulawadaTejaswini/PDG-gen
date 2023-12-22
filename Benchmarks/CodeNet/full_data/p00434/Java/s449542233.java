import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean yet[] = new boolean[30];
		Arrays.fill(yet, true);

		for(int i=0; i<28; i++){
			yet[Integer.parseInt(br.readLine()) - 1] = false;
		}
		for(int i=0; i<30; i++){
			if(yet[i]){
				System.out.println(i+1);
			}
		}
	}
}
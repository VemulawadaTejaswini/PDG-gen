import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		int[] array = new int[len];
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");

		for(int i = 0; i < len; i++){
			array[i] = Integer.parseInt(st.nextToken());
		}

		for(int i = len - 1; i >= 0; i--){
			System.out.print(array[i]);
			if(i != 0){
				System.out.print(" ");
			}else{
				System.out.print("\n");
			}
		}

	}
}
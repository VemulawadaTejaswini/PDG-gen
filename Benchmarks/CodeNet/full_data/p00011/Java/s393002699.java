import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		str = br.readLine();
		int w = Integer.parseInt(str);
		str = br.readLine();
		int n = Integer.parseInt(str);

		int array[] = new int[w];

		for(int i=0; i<w; i++){
			array[i] = i+1;
		}

		for(int i=0; i<n; i++){
			str = br.readLine();
			int a = Integer.parseInt(str.substring(0, str.indexOf(",")));
			int b = Integer.parseInt(str.substring(str.indexOf(",")+1, str.length()));

			swap(array,a-1,b-1);

		}

		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}

	}


	static int[] swap(int[] list,int a, int b){
		int temp = list[a];
		list[a] = list[b];
		list[b] = temp;

		return list;
	}

}
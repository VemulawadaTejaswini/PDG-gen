
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> lines = new ArrayList<String>();
		while (br.ready()){
			lines.add(br.readLine());
		}
		
		int N = Integer.parseInt(lines.get(0));
		String[] tmp = lines.get(1).split(" ");
		int[] num = new int[tmp.length];
		for(int i=0; i<tmp.length; i++){
			num[i] = Integer.parseInt(tmp[i]);
		}
		sort(num);


	}

	static void sort(int[] num){
		int key;
		for(int i=0; i<num.length; i++){
			key = num[i];
			
			for(int j=i; j>0 && key < num[j-1];j--){
				num[j] = num[j-1];
				num[j-1] = key;
			}
			print(num);
		}
			
	}
	
	static void print(int[] num){
		for(int i=0; i<num.length-1; i++){
			System.out.print(num[i]);
			System.out.print(" ");
		}
		System.out.println(num[num.length-1]);
	}
}
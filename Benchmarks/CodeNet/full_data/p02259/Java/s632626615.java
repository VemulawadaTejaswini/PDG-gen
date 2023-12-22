import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> lines = new ArrayList<String>();
		while (br.ready()){
			lines.add(br.readLine());
		}
		String[] tmp = lines.get(1).split(" ");
		int[] num = new int[tmp.length];
		for(int i=0; i<tmp.length; i++){
			num[i] = Integer.parseInt(tmp[i]);
		}
		int N= sort(num);
		print(num, N);


	}
	static void print(int[] num, int cnt){
		for(int i=0;i<num.length-1;i++){
			System.out.print(num[i]);
			System.out.print(" ");
		}
		System.out.println(num[num.length-1]);
		System.out.println(cnt);
	}
	static int sort(int[] num){
		int tmp;
		int cnt=0;
		for(int i=0; i<num.length;i++){
			for(int j=num.length-1;i<j;j--){
				if(num[j-1]>num[j]){
					tmp = num[j];
					num[j] = num[j-1];
					num[j-1] = tmp;
					cnt++;
				}
			}
		}
		return cnt;
		
	}
}
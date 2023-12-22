import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		ArrayList<String> in = readInputs();
		String[] tmp = in.get(1).split(" ");
		int[] num = new int[tmp.length];
		for(int i=0; i<tmp.length;i++){
			num[i] = Integer.parseInt(tmp[i]);
		}
		int cnt = sort(num);
		for(int i:num ){
			System.out.print(i);
			if(i != num[num.length-1]){
				System.out.print(" ");
			}else{
				System.out.print("\n");
			}
		}
		System.out.print(cnt);

	}
	
	static ArrayList<String> readInputs() throws IOException{
		ArrayList<String> tmp = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(br.ready()){
			tmp.add(br.readLine());
		}
		return tmp;
	}

	static int sort(int[] num){
		int cnt=0;
		for(int i=0; i<num.length; i++){
			int mini=i;
			for(int j=i; j<num.length; j++){
				if(num[mini] > num[j]){
					mini = j;
				}
			}
			if(mini != i){
				int tmp = num[i];
				num[i] = num[mini];
				num[mini] = tmp;
				cnt++;
			}
		}
		return cnt;
	}
}
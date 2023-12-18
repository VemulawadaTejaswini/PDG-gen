import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		int N = Integer.parseInt(W);
		W = in.readLine();

		String[] Ws = W.split(" ");

		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<N;i++){
			list.add(Integer.parseInt(Ws[i]));
		}

		int i=0;
		while(i<list.size()){
			if((i+1) == list.get(i)){
				i++;
			}else{
				list.remove(i);
			}
		}
		int ans = 0;
		if(list.size()==0){
			ans = -1;
		}else{
			ans = N-list.size();
		}
		System.out.println(ans);



	}
}

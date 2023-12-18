import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String S = in.readLine();
		ArrayList<String> list = new ArrayList<String>();
		String tmp = S.substring(0,1);
		int indx=1;

		list.add(tmp);
		for(int i=2;i<S.length();i++){
			if(!tmp.equals(S.substring(indx,i))){
				tmp = S.substring(indx,i);
				list.add(tmp);
				indx=i;

			}
		}
		if(!"".equals(S.substring(indx,S.length())) && !tmp.equals(S.substring(indx,S.length()))){
			tmp = S.substring(indx,S.length());
			list.add(tmp);
		}


		System.out.println(list.size());

	}




}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		int N = Integer.parseInt(W);

		String S = in.readLine();

		//各文字の発生位置の格納
		ArrayList<Integer>[] list = new ArrayList[10];
		for(int i = 0;i<10;i++){
			list[i] = new ArrayList<Integer>();
		}

		for(int i=0;i<N;i++){
			list[S.charAt(i)-'0'].add(i);
		}
		HashMap<String,Boolean> map = new HashMap<String,Boolean>();
		String find ;
		int indx1 = -1;
		int indx2 = -1;
		int indx3 = -1;

		for(int i1=0;i1<10;i1++){
			if(list[i1].size()==0){
				continue;
			}
			indx1 = list[i1].get(0);
			for(int i2=0;i2<10;i2++){
				indx2=-1;
				//2桁目の値を探す
				for(int k = 0;k<list[i2].size();k++){
					if(indx1 < list[i2].get(k)){
						indx2 = list[i2].get(k);
						break;
					}
				}
				if(indx2 == -1){
					continue;
				}

				for(int i3=0;i3<10;i3++){
					indx3=-1;
					//3桁目の値を探す
					for(int k = 0;k<list[i3].size();k++){
						if(indx2 < list[i3].get(k)){
							indx3 = list[i3].get(k);
							break;
						}
					}
					if(indx3 != -1){
						find = S.substring(indx1,indx1+1)+S.substring(indx2,indx2+1)+S.substring(indx3,indx3+1);
						map.put(find, true);
						continue;
					}
				}
			}
		}

		System.out.println(map.keySet().size());



	}


}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		List<HashMap<String, String>> input = new ArrayList<HashMap<String,String>>();


		for(int i=0;i<num;i++) {
			HashMap<String,String> tmp=new HashMap<String,String>();
			tmp.put("city", sc.next());
			tmp.put("score", sc.next());
			tmp.put("id", Integer.toString(i));
			input.add(tmp);
		}
		sc.close();

		int[] re=new int[num];

		for(int i=0;i<num;i++) {
			int ord=0;
			HashMap<String,String> tgt=input.get(ord);

			if(input.size()==0) {
				break;
			}else {
				for(int j=1; j<input.size();j++) {
					if(tgt.get("city").compareTo(input.get(j).get("city"))<0) {
						continue;
					}else if(tgt.get("city").compareTo(input.get(j).get("city"))>0) {
						tgt=input.get(j);
						ord=j;
					}else {
						if(Integer.parseInt(tgt.get("score"))<Integer.parseInt(input.get(j).get("score"))){
							tgt=input.get(j);
							ord=j;
						}
					}
				}
			}
			re[i]=Integer.parseInt(tgt.get("id"));
			input.remove(ord);
		}

		for(int c:re) {
			System.out.println(c+1);
		}


	}

}


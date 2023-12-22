import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int cup = 0;
		int mun = 0;
		int ter = 0;
		String[] rrr;
		int st = 0,sr = 0;
		int mon = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		while(true){
			
			try {
				tmp = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			if(tmp == null){
				break;
			}
			
			if(tmp.equals("")){
				break;
			}
			
			al.add(Integer.parseInt(tmp));
		}
		
		//System.out.println(al.toString());
		Collections.sort(al);
		//System.out.println(al.toString());
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		int tmpr = 0;
		
		for(int i=0;i<al.size();i++){
			if(tmpr ==0){
				al2.add(al.get(i));
			}
			if(al2.get(tmpr) < al.get(i)){
				tmpr++;
				al2.add(al.get(i));
			}
		}
		int aaa = 0;
		for(int i=0;i<al2.size();i++){
			tmpr = 0;
			for(int j=0;j<al.size();j++){
				if(al.get(j) == al2.get(i)){
					tmpr++;
				}
				al3.add(tmpr);
				if(aaa < tmpr){
					aaa = tmpr;
				}
			}
		}
		
		for(int i=0;i<al3.size();i++){
			if(aaa == al3.get(i)){
				System.out.println(al2.get(i));
			}
		}
		
		
		
	}

}
import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 人数を取得
		Integer n = sc.nextInt();
		// 名前を取得
		ArrayList<String> m = new ArrayList<String>();
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> r = new ArrayList<String>();
		ArrayList<String> c = new ArrayList<String>();
		ArrayList<String> h = new ArrayList<String>();
		for(int i = 0; i < n ; i++){
			String name = sc.next();
			if("M".equals(name.substring(0,1))){
				m.add(name);
			}else if("A".equals(name.substring(0,1))){
				a.add(name);
			}else if("R".equals(name.substring(0,1))){
				r.add(name);
			}else if("C".equals(name.substring(0,1))){
				c.add(name);
			}else if("H".equals(name.substring(0,1))){
				h.add(name);
			}
		}
		// それぞれの文字から始まる名前の数を集計
		Long mNum = (long)m.size();
		Long aNum = (long)a.size();
		Long rNum = (long)r.size();
		Long cNum = (long)c.size();
		Long hNum = (long)h.size();
		ArrayList<Long> valid = new ArrayList<Long>();
		if(mNum != 0){
			valid.add(mNum);
		}
		if(aNum != 0){
			valid.add(aNum);
		}
		if(rNum != 0){
			valid.add(rNum);
		}
		if(cNum != 0){
			valid.add(cNum);
		}
		if(hNum != 0){
			valid.add(hNum);
		}
		// 組み合わせ総数を計算(valid.size()<3の場合は組み合わせが1つも成立しないので更新なし)
		long pair = 0;
		if(3 == valid.size()){
			long allMulti = 1;
			for(int i = 0 ; i < valid.size() ; i++){
				allMulti = allMulti * valid.get(i);
			}
			pair = allMulti;
		}else if(4 == valid.size()){
			long allMulti = 1;
			for(int i = 0; i < valid.size(); i++){
				allMulti = allMulti * valid.get(i);
			}
			for(int i = 0; i < valid.size(); i++){
				long tmp = allMulti/valid.get(i);
				pair = pair + tmp;
			}
		}else if(5 == valid.size()){
			long allMulti = 1;
			for(int i = 0; i < valid.size(); i++){
				allMulti = allMulti * valid.get(i);
			}
			for(int i = 0; i < valid.size(); i++){
				long tmp = allMulti/valid.get(i);
				for(int j = 0; j < valid.size(); j++){
					if(i < j ){
						tmp = tmp/valid.get(j);
						pair = pair + tmp;
					}
				}
			}
		}
		System.out.println((long)pair);
	}
}
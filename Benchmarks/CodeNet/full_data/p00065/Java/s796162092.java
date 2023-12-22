/**
 * 
 */
import java.util.*;
/**
 * @author akira
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		pair[][] cos = new pair[2][1000]; /* first は顧客番号 second　は取引回数 */
		int[] cosCnt = new int[2];
		int month = 0;
		while(scan.hasNextLine()){
			String str = scan.nextLine();
			if(str.indexOf(",") == -1){
				month++;
				if(month == 2){
					break;
				}
				continue;
			}
			int cosNum = Integer.parseInt(str.substring(0,str.indexOf(",")));
			int i;
			for(i = 0;i < cosCnt[month];i++){
				if(cos[month][i].first == cosNum){
					cos[month][i].second++;
					break;
				}
			}
			if(cosCnt[month] == i){
				cos[month][i] = new pair(cosNum,1);
				cosCnt[month]++;
			}			
		}
		ArrayList<pair> lst = new ArrayList<pair>();
		for(int i = 0;i < cosCnt[0];i++){
			for(int j = 0;j < cosCnt[1];j++){
				if(cos[0][i].first == cos[1][j].first){
					lst.add(new pair(cos[0][i].first,cos[0][i].second + cos[1][j].second));
				}
			}
		}
		Collections.sort(lst,new Compare());
		for(int i = 0;i < lst.size();i++){
			System.out.println("" + lst.get(i).first + " " + lst.get(i).second);
		}
	}

}
class pair{
	int first;
	int second;
	pair(int f,int s){
		first = f;
		second = s;
	}
}
class Compare implements Comparator<pair>{
	public int compare(pair a,pair b){
		return a.first - b.first;
	}
}
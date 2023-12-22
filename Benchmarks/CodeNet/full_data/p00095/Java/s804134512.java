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
		int n;
		n = scan.nextInt();
		ArrayList<fisher> alf = new ArrayList<fisher>();
		for(int i = 0;i < n;i++){
			alf.add(new fisher(scan.nextInt(),scan.nextInt()));
		}
		Collections.sort(alf,new Compare());
		System.out.println(alf.get(0).a + " " + alf.get(0).v);
	}

}

class fisher{
	int a;
	int v;
	fisher(int arg1,int arg2){
		a = arg1;
		v = arg2;
	}
}

class Compare implements Comparator<fisher>{
	public int compare(fisher f1,fisher f2){
		if(f1.v < f2.v){
			return 1;
		}else if(f1.v > f2.v){
			return -1;
		}else{
			if(f1.a < f2.a){
				return -1;
			}else{
				return 1;
			}
		}
	}
}
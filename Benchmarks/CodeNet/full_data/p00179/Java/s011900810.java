import java.awt.geom.Point2D;
import java.util.*;


public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {

		new AOJ0179();


	}

	class AOJ0179{
		public AOJ0179() {
			while(true){
				String warm = in.next();
				if(warm.equals("0"))break;
				int ans = get_warm(warm);
				System.out.println(ans==-1? "NA":ans);
			}
		}
		
		int get_warm(String input){
			Queue<String> warm = new LinkedList<String>();
			Queue<Integer> cnt = new LinkedList<Integer>();
			HashMap<String, Boolean> memo = new HashMap<String, Boolean>();
			memo.put(input,true);
			warm.add(input);
			cnt.add(0);
			while(warm.size()>0){
				String a = warm.remove();
				int step = cnt.remove();
//				System.out.println(a+" "+step);//deba
				boolean sw = true;
				for(int i=0;i<a.length()-1;i++)if(a.charAt(i)!=a.charAt(i+1))sw=false;
				if(sw)return step;
				//ここから
				for(int i=0;i<a.length()-1;i++)if(a.charAt(i)!=a.charAt(i+1)){
					String b = a.substring(0,i)+getColor(a.charAt(i),a.charAt(i+1))+a.substring(i+2,a.length());
					if(memo.containsKey(b))continue;
					warm.add(b);
					cnt.add(step+1);
					memo.put(b, true);
				}
			}
			return -1;
		}
		
		String getColor(char a, char b){
			if(a=='r'&&b=='b'||a=='b'&&b=='r')return "gg";
			else if(a=='r'&&b=='g'||a=='g'&&b=='r')return "bb";
			else return "rr";
		}
		
	}

}
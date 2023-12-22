import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main(){
		new AOJ2001().doIt();
	}

	class AOJ2001{
		ArrayList<ArrayList<Line>> list;
		int tate,yoko,a;
		
		void solve(){
			int target = a;
			for(int i=1000;i>=0;i--){
				if(list.get(i).size()==0)continue;
				for(int s=0;s<list.get(i).size();s++)if(list.get(i).get(s).contains(target)){
					target = list.get(i).get(s).move(target);
				}
			}
			System.out.println(target);
		}
		
		void doIt(){
			while(in.hasNext()){
				tate = in.nextInt();
				yoko = in.nextInt();
				a = in.nextInt();
				if(tate+yoko+a==0)break;
				list = new ArrayList<ArrayList<Line>>();
				for(int i=0;i<1001;i++)list.add(new ArrayList<Line>());
				for(int i=0;i<yoko;i++){
					int h = in.nextInt();
					int a = in.nextInt();
					int b = in.nextInt();
					list.get(h).add(new Line(a, b, h));
				}
				solve();
			}
		}
		class Line{
			int a,b,h;
			public Line(int a,int b,int h){
				this.a = a;
				this.b = b;
				this.h = h;
			}
			
			boolean contains(int c){
				if(a==c||b==c)return true;
				else return false;
			}
			
			int move(int c){
				if(a==c)return b;
				else if(b==c)return a;
				else return -1;
			}
			
		}
	}

}
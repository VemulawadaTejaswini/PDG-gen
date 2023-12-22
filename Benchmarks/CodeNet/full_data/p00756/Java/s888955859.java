import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		new Main().start();
	}


	ArrayList<Circle> topCircles;
	void start(){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n == 0) break;
			Circle[] circles = new Circle[n];
			topCircles = new ArrayList<Circle>();
			for(int i = 0; i < n; i++){
				Circle c = new Circle(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
				circles[n-1-i] = c;
			}
			for(int i = 0; i < circles.length; i++){
				Circle c = circles[i];
				for(int j = i-1; j >= 0; j--){
					circles[j].putC(c);
				}
				c.level += 1;
			}
			for(Circle c : circles){
				if(c.aboveList.isEmpty())topCircles.add(c);
			}
//			for(Circle c : circles){
//				System.out.print(c);
//			}
			int count = 0;
			boolean isChanged = false;
			do{
				isChanged = false;
				for(int i = 0; i < topCircles.size()-1; i++){
					Circle c1 = topCircles.get(i);
					for(int j = i+1; j < topCircles.size(); j++){
						Circle c2 = topCircles.get(j);
						if(c1.c == c2.c){
							c1.remove();
							c2.remove();
							isChanged = true;
							count += 2;
							break;
						}
					}
					if(isChanged){
						break;
					}
				}
			}while(isChanged);
			System.out.println(count);
		}
		in.close();
	}
	class Circle{
		int x, y, r, c;
		ArrayList<Circle> clist;
		ArrayList<Circle> aboveList;
		int level = 0;
		Circle(int x, int y, int r, int c){
			this.x = x;
			this.y = y;
			this.r = r;
			this.c = c;
			clist = new ArrayList<Circle>();
			aboveList = new ArrayList<Circle>();
		}
		void putC(Circle c){
			if((x-c.x)*(x-c.x) + (y-c.y)*(y-c.y) < (r+c.r)*(r+c.r)){
				if(level >= c.level){
					c.clist.add(this);
					this.aboveList.add(c);
					c.level = level;
				}
			}
		}
		void remove(){
			topCircles.remove(this);
			for(Circle c : clist){
				c.aboveList.remove(this);
				if(c.aboveList.isEmpty()){
					topCircles.add(c);
				}
			}
		}
		public String toString(){
			String s = "(" + x +"," + y + ")" + r +":" + c + "," + level + "\n";
//			s += "below\n";
//			for(Circle c : clist){
//				s += "\t" + "(" + c.x +"," + c.y + ")" + c.r +":" + c.c + "," + c.level + "\n";;
//			}
//			s+= "above\n";
//			for(Circle c : aboveList){
//				s += "\t" + "(" + c.x +"," + c.y + ")" + c.r +":" + c.c + "," + c.level + "\n";;
//			}
			return s;
		}
	}
}
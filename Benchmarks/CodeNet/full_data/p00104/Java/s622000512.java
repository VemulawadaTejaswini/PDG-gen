import java.util.*;
import java.awt.geom.*;
public class Main {
	
	class C{
		int x,y;

		public C(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
	}
	
	//2310 start
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			
			if(w == 0 && h == 0) break;
			char [][] data = new char[h][w];
			for(int i = 0; i < h; i++){
				String s = sc.next();
				for(int j = 0 ; j < w; j++){
					data[i][j] = s.charAt(j);
				}
			}
			
			LinkedList<C> open = new LinkedList<C>();
			open.add(new C(0,0));
			boolean [][] close = new boolean[h][w];
			
			while(! open.isEmpty()){
				C now = open.removeFirst();
				if(close[now.y][now.x]){
					System.out.println("LOOP");
					break;
				}
				close[now.y][now.x] = true;
				switch(data[now.y][now.x]){
				case '>':
					open.add(new C(now.x + 1, now.y));
					break;
				case '<':
					open.add(new C(now.x -1, now.y));
					break;
				case 'v':
					open.add(new C(now.x, now.y + 1));
					break;
				case '^':
					open.add(new C(now.x, now.y - 1));
					break;
				case '.':
					System.out.println(now.x + " " + now.y);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}
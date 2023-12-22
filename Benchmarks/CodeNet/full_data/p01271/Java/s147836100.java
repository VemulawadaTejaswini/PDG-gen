import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	static int W,H;
		
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
			while(true){
			W = in.nextInt();
			H = in.nextInt();
			if(W==0&&H==0) break;
			String[] left = new String[H];
			String[] right = new String[H];
			int goal = 0;
			int start = 0;
			for(int i=0;i<H;i++){
				left[i] = in.next();
				right[i] = in.next();
				for(int j=0;j<W;j++){
					if(left[i].charAt(j)=='%'){
						goal += (100*j + i)*10000;
					}else if(left[i].charAt(j)=='L'){
						start += (100*j + i)*10000;
					}
					if(right[i].charAt(j)=='%'){
						goal += 100*j + i;
					}else if(right[i].charAt(j)=='R'){
						start += 100*j + i;
					}
				}
			}
			boolean[] pos = new boolean[100000000];
			LinkedList<Integer> stack = new LinkedList<>();
			stack.push(start);
			pos[start] = true;
			String ans = "No";
			while(!stack.isEmpty()){
				int now = stack.pop();
				//UP
				int up = now;
				if(!isWall(getLx(now),getLy(now)-1,left)){
					up -= 10000;
				}
				if(!isWall(getRx(now),getRy(now)-1,right)){
					up -= 1;
				}
				if(up==goal){
					ans = "Yes"; break;
				}
				if(!pos[up]){
					stack.add(up); pos[up] = true;
				}
				//DOWN
				int down = now;
				if(!isWall(getLx(now),getLy(now)+1,left)){
					down += 10000;
				}
				if(!isWall(getRx(now),getRy(now)+1,right)){
					down += 1;
				}
				if(down==goal){
					ans = "Yes"; break;
				}
				if(!pos[down]){
					stack.add(down); pos[down] = true;
				}
				//into
				int into = now;
				if(!isWall(getLx(now)+1,getLy(now),left)){
					into += 1000000;
				}
				if(!isWall(getRx(now)-1,getRy(now),right)){
					into -= 100;
				}
				if(into==goal){
					ans = "Yes"; break;
				}
				if(!pos[into]){
					stack.add(into); pos[into] = true;
				}
				//out
				int out = now;
				if(!isWall(getLx(now)-1,getLy(now),left)){
					out -= 1000000;
				}
				if(!isWall(getRx(now)+1,getRy(now),right)){
					out += 100;
				}
				if(out==goal){
					ans = "Yes"; break;
				}
				if(!pos[out]){
					stack.add(out); pos[out] = true;
				}
			}
			System.out.println(ans);
			System.gc();
		}	
	}
	
	public static int getLx(int pos){
		return pos/1000000;
	}
	public static int getLy(int pos){
		return pos/10000 %100;
	}
	public static int getRx(int pos){
		return pos/100 % 100;
	}
	public static int getRy(int pos){
		return pos%100;
	}
	public static boolean isWall(int x,int y,String[] map){
		return x<0 || x>=W || y<0 || y>=H || map[y].charAt(x) == '#';
	}
}
import java.io.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while((line = in.readLine()) != null){
			int size = Integer.parseInt(line);
			for(int i=0; i<size; i++){
				line = in.readLine();
				String[] tmp = line.split(" ");
				int[] pts = new int[tmp.length];
				for(int j=0; j<tmp.length; j++){
					pts[j] = Integer.parseInt(tmp[j]);
				}
				
				Point p1 = new Point(pts[0], pts[1]);
				Point p2 = new Point(pts[2], pts[3]);
				Point p3 = new Point(pts[4], pts[5]);
				Point pk = new Point(pts[6], pts[7]);
				Point ps = new Point(pts[8], pts[9]);
				Point vk1 = new Point(p1.x - pk.x, p1.y - pk.y);
				Point vk2 = new Point(p2.x - pk.x, p2.y - pk.y);
				Point vk3 = new Point(p3.x - pk.x, p3.y - pk.y);
				Point vs1 = new Point(p1.x - ps.x, p1.y - ps.y);
				Point vs2 = new Point(p2.x - ps.x, p2.y - ps.y);
				Point vs3 = new Point(p3.x - ps.x, p3.y - ps.y);
				int k12 = Point.outer(vk1, vk2);
				int k23 = Point.outer(vk2, vk3);
				int k31 = Point.outer(vk3, vk1);
				int s12 = Point.outer(vs1, vs2);
				int s23 = Point.outer(vs2, vs3);
				int s31 = Point.outer(vs3, vs1);
				
				boolean bk = k12 == k23 && k23 == k31;
				boolean bs = s12 == s23 && s23 == s31;
				if(bk != bs){
					System.out.println("OK");
				}else{
					System.out.println("NG");
				}
			}
		}
	}
}

class Point{
	int x;
	int y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public static int outer(Point p1, Point p2){
		return sign(p1.x * p2.y - p2.x * p1.y);
	}
	
	private static int sign(int a){
		if(a>0) return 1;
		else if(a==0) return 0;
		else return -1;
	}
}
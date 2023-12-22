import java.util.*;

class Color{
	int r,g,b;
	String name;

	Color(int r,int g,int b,String name){
		this.r=r; this.g=g; this.b=b;
		this.name = name;
	}

	double dist(Color c){
		return Math.sqrt( Math.pow(this.r - c.r, 2) +
											Math.pow(this.g - c.g, 2) +
											Math.pow(this.b - c.b, 2));
	}
}

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		Color color[] = {new Color(0,0,0,"black"),
											new Color(0,0,255,"blue"),
											new Color(0,255,0,"lime"),
											new Color(0,255,255,"aqua"),
											new Color(255,0,0,"red"),
											new Color(255,0,255,"fuchsia"),
											new Color(255,255,0,"yellow"),
											new Color(255,255,255,"white")};

		while(true){
			int minIndex = 0;
			double minDist = Double.MAX_VALUE;
			String s = scan.next();

			if(s.equals("0")) break;

			Color input = new Color(Integer.parseInt(s.substring(1,3),16),
															Integer.parseInt(s.substring(3,5),16),
															Integer.parseInt(s.substring(5,7),16),
															"");

			for(int i=0;i<8;i++){
				double dist = color[i].dist(input);
				if(minDist > dist){
					minIndex = i;
					minDist = dist;
				}
			}

			System.out.println(color[minIndex].name);
		}
	}
}
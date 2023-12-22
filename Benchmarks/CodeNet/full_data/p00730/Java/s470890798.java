import java.util.*;
import java.awt.geom.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int w = sc.nextInt();
			int d = sc.nextInt();
			if(n==0 && w==0 && d==0) break;
			
			Rectangle2D.Double r = new Rectangle2D.Double(0, 0, w, d);
			Rectangle2D.Double q;
			ArrayList<Rectangle2D.Double> list = new ArrayList<Rectangle2D.Double>();
			list.add(r);
			
			int p, s, x, y;
			for(int i=1;i<=n;i++){
				p = sc.nextInt()-1;
				s = sc.nextInt();
				
				r = list.get(p);
				list.remove(p);
				
				x = (int)r.getX();
				y = (int)r.getY();
				w = (int)r.getWidth();
				d = (int)r.getHeight();
				s %= 2*w+2*d;
				
				for(int j=0;j<2;j++){
					if(s<w){
						if(j==1) s = w-s;
						r = new Rectangle2D.Double(x, y, s, d);
						q = new Rectangle2D.Double(x+s, y, w-s, d);
						if(s<=w/2) list.add(r);
						list.add(q);
						if(s>w/2)list.add(r);
						break;
					}
					s -= w;
					if(s<d){
						if(j==1)s = d-s;
						r = new Rectangle2D.Double(x, y, w, s);
						q = new Rectangle2D.Double(x, y+s, w, d-s);
						if(s<=d/2) list.add(r);
						list.add(q);
						if(s>d/2)list.add(r);
						break;
					}
					s -= d;
				}
			}
			int[] ans = new int[n+1];
			for(int i=0;i<=n;i++) ans[i] = (int)(list.get(i).getWidth()*list.get(i).getHeight());
			Arrays.sort(ans);
			
			for(int i=0;i<n+1;i++){
				if(i!=0) System.out.print(" ");
				System.out.print(ans[i]);
			}
			System.out.println();
		}	
	}	
}
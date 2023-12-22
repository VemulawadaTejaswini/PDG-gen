import java.util.*;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			if(n == 0) break;
			int xmax=0,xmin=0,ymax=0,ymin=0;
			ArrayList<Integer> x = new ArrayList<Integer>();
			ArrayList<Integer> y = new ArrayList<Integer>();
			x.add(0);
			y.add(0);
			for(int i=1; i<n; i++){
				int id = in.nextInt();
				switch(in.nextInt()){
				case 0:
					x.add(x.get(id)-1);
					y.add(y.get(id));
					break;
				case 1:
					x.add(x.get(id));
					y.add(y.get(id)-1);
					break;
				case 2:
					x.add(x.get(id)+1);
					y.add(y.get(id));
					break;
				case 3:
					x.add(x.get(id));
					y.add(y.get(id)+1);
					break;
				}
				xmax = Math.max(xmax, x.get(i));
				xmin = Math.min(xmin, x.get(i));
				ymax = Math.max(ymax, y.get(i));
				ymin = Math.min(ymin, y.get(i));
				
			}
			System.out.println((xmax-xmin+1)+" "+(ymax-ymin+1));
		}
		
	}

}
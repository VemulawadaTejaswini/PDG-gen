import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		ArrayList<Point> red = new ArrayList<>();
		ArrayList<Point> blue = new ArrayList<>();
		ArrayList<Point> bcopy = new ArrayList<>();

		for(int n=0;n<N;n++){
			red.add(new Point(sc.nextInt(),sc.nextInt()));
		}
		for(int n=0;n<N;n++){
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			blue.add(new Point(v1,v2));
			bcopy.add(new Point(v1,v2));
		}

		int countX = 0;
		int countY = 0;

		for(int n=0;n<N;n++){
			int r = red.get(n).x;

			int min=-1;
			int tmp=999;
			for(int m=0;m<blue.size();m++){
				if(blue.get(m).x>r &&  
					red.get(n).y<blue.get(m).y &&
					(blue.get(m).x - red.get(m).x) + (blue.get(m).y - red.get(m).y)<tmp){
					min = m;
					tmp = (blue.get(m).x - red.get(m).x) + (blue.get(m).y - red.get(m).y);
				}
			}
			if(min!=-1){
				countX++;
				blue.remove(min);
			}
		}
		for(int n=0;n<N;n++){
			int r = red.get(n).y;

			int min=-1;
			int tmp=999;
			for(int m=0;m<bcopy.size();m++){
				if(bcopy.get(m).y>r &&  
					red.get(n).x<bcopy.get(m).x &&
					(bcopy.get(m).x - red.get(m).x) + (bcopy.get(m).y - red.get(m).y)<tmp){
					min = m;
					tmp = (bcopy.get(m).x - red.get(m).x) + (bcopy.get(m).y - red.get(m).y);
				}
			}
			if(min!=-1){
				countY++;
				bcopy.remove(min);
			}
		}

		System.out.println(Math.max(countX,countY));
	}
	private static class Point{
		int x,y;

		Point(int x,int y){
			this.x = x;
			this.y = y;
		}
	}
}
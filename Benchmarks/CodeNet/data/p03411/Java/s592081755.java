import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		ArrayList<Point> red = new ArrayList<>();
		ArrayList<Point> blue = new ArrayList<>();
		for(int n=0;n<N;n++){
			red.add(new Point(sc.nextInt(),sc.nextInt()));
		}
		for(int n=0;n<N;n++){
			blue.add(new Point(sc.nextInt(),sc.nextInt()));
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
			for(int m=0;m<blue.size();m++){
				if(blue.get(m).y>r &&  
					red.get(n).x<blue.get(m).x &&
					(blue.get(m).x - red.get(m).x) + (blue.get(m).y - red.get(m).y)<tmp){
					min = m;
					tmp = (blue.get(m).x - red.get(m).x) + (blue.get(m).y - red.get(m).y);
				}
			}
			if(min!=-1){
				countY++;
				blue.remove(min);
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
import java.util.Scanner;
import java.util.HashSet;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
class Point implements Comparable<Point> {
	int x, y;

	public int compareTo(Point p) {
		if (this.y == p.y) {
			return this.x - p.x;
		} else {
			return this.y - p.y;
		}
	}

	public String toString() {
		return x + " " + y;
	}

}
public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		CSmonotone monotone = new CSmonotone(N);
		for(int i = 0; i < N ; i++){
			monotone.addPoint(i,scanner.nextInt(), scanner.nextInt());
		}
		monotone.monoTone();
	}	
	public static long cross(Point O, Point A, Point B) {
		return (A.x - O.x) * (long) (B.y - O.y) - (A.y - O.y) * (long) (B.x - O.x);
	}

	static class CSmonotone{//C Style monotone algorithm
		int N;
		Point[] Map;
		int Max_X;
		int Max_Y;
		int Min_X;
		int Min_Y;

		public CSmonotone(int N){//constructer
			this.N = N;
			this.Map = new Point[N];
			this.Max_X = 0;
			this.Max_Y = 0;
			this.Min_X = 0;
			this.Min_Y = 0;
		}
		public void addPoint(int i ,int X, int Y){
			Map[i] = new Point();
			Map[i].x = X;
			Map[i].y = Y;
			maxX(X,Y);
			maxY(X,Y);
			minX(X,Y);
			minY(X,Y);
		}
		public int [] cd2arr(int X, int Y){// use to change the coordinate to unsigned array offset
			int [] ret = new int[2];
			ret[0] = X + 10000;
			ret[1] = Y + 10000;
			return ret;
		}
		public int [] arr2cd(int X, int Y){// use to change the unsigned array offset coordinate 
			int [] ret = new int[2];
			ret[0] = X - 10000;
			ret[1] = Y - 10000;
			return ret;
		}
		public int cd2arr(int T){
			return T+10000;
		}
		public int arr2cd(int t){
			return t-10000;
		}

		public void maxX(int X, int Y){
			if(X > Max_X){Max_X = X;}
			else{Max_X = Max_X;}
		}
		public void maxY(int X, int Y){
			if(Y > Max_Y){Max_Y = Y;}
			else{Max_Y = Max_Y;}
		}

		public void minX(int X, int Y){
			if(X < Min_X){Min_X = X;}
			else{Min_X = Min_X;}
		}

		public void minY(int X, int Y){
			if(Y < Min_Y){Min_Y = Y;}
			else{Min_Y = Min_Y;}
		}

//		public int [] findLY(int Y){// find left most on given y axis
//			int y = cd2arr(Y);
//			int[] ret =new int[2];
//			for(int x = 0; x<=20000; x++){
//				if(Map[x][y] == 1){ret[0] =arr2cd(x); ret[1] = arr2cd(y); return ret;}
//			}
//			return null;
//		}
//		public int [] findRY(int Y){// find right most on given y axis
//			int y = cd2arr(Y);
//			int[] ret = new int[2];
//			for(int x = 20000; x == 0; x--){
//				if(Map[x][y]  == 1){ret[0] = arr2cd(x); ret[1] = arr2cd(y); return ret;}
//			}
//			return null;
//		}


//		public int [] findStart(){
//			int[] ret = new int[2];
//			ret = findLY(Min_Y);
//			return ret;
//		}
//		public Point findRNext(int [] point){
//			Point ret = point;
//			int Y = point.y;
//			for (int I = Y; I <= 10000;I++ ){
//				ret = findRY(Y);
//				if (ret != null){
//					if (Arrays.equals(ret,point)){continue;}
//					return ret;
//				}
//			}
//			return null;
//		}

		public void monoTone (){//according to the question constrain of AOJ, 
					//will start at bottom(different from wiki)
					//and the Low Upper will become Right,Left
					//this will remain CCW 
			Arrays.sort(Map);
			int horizen = -10000;
			LinkedList<Point> L = new LinkedList<Point>();
			LinkedList<Point> R = new LinkedList<Point>();
			LinkedList<Point> T = new LinkedList<Point>();
			Point P = Map[0];
			horizen = 0;
			//if(horizen != Min_Y){System.out.println("What the fuck?");return;}
			R.addLast(P);
			while(Map[horizen].y <Max_Y ){
				Point tmp = R.removeLast();
				while(R.size() >= 1){// if R size > 2 check CCW with new one
					if (cross(R.getLast(), tmp, Map[horizen+1]) < 0){
						tmp = R.removeLast();
					}else{break;}
				}
				horizen++;
				R.addLast(tmp);
				//System.out.println("add tmp into R, size is = " + R.size());
				if (Map[horizen].y == Max_Y){break;}
				R.addLast(Map[horizen]);
				//System.out.println("add MAP next into R, it is =" + Map[horizen+1].toString());
			}
			
			while(Map[horizen].y == Max_Y){
				T.addFirst(Map[horizen]);
				if(horizen < N-1){horizen++;}else{break;}
			}

			while(T.size() >0){
				L.addFirst(T.removeLast());
				horizen--;
			}

			while(horizen >=0){
				Point tmp = L.removeLast();
				while(L.size() >= 1){// if R size > 2 check CCW with new one
					if (cross(L.getLast(), tmp, Map[horizen]) < 0){
						tmp = L.removeLast();
					}else{break;}
				}
				//horizen--;
				L.addLast(tmp);
				if (horizen == 0){break;}
				L.addLast(Map[horizen]);

				horizen--;


			}


			System.out.println(R.size()+L.size()+T.size());

			while(R.size() != 0){
			System.out.println(R.removeFirst().toString());}
			


			while(T.size() != 0){
			System.out.println(T.removeFirst().toString());}


			
			while(L.size() != 0){
			System.out.println(L.removeFirst().toString());}

		}


	}










}



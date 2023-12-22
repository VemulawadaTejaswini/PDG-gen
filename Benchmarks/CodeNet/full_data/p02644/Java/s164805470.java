import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;
/*
3 5 2
3 2 3 4
.....
.@..@
..@..

 */
public class Main {

	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		int h=fs.nextInt(), w=fs.nextInt(), maxJump=fs.nextInt();
		int startY=fs.nextInt()-1, startX=fs.nextInt()-1, endY=fs.nextInt()-1, endX=fs.nextInt()-1;
		TreeSet<Integer>[] onX=new TreeSet[w];
		TreeSet<Integer>[] onY=new TreeSet[h];
		TreeSet<Integer>[] noX=new TreeSet[w];
		TreeSet<Integer>[] noY=new TreeSet[h];
		for (int x=0; x<w; x++) onX[x]=new TreeSet<>();
		for (int y=0; y<h; y++) onY[y]=new TreeSet<>();
		for (int x=0; x<w; x++) noX[x]=new TreeSet<>();
		for (int y=0; y<h; y++) noY[y]=new TreeSet<>();
		boolean[][] board=new boolean[w][h];
		for (int y=0; y<h; y++) {
			char[] line=fs.next().toCharArray();
			for (int i=0; i<line.length; i++) {
				board[i][y]=line[i]!='@';
				if (board[i][y]) {
					onX[i].add(y);
					onY[y].add(i);
				}
				else {
					noX[i].add(y);
					noY[y].add(i);
				}
			}
		}
		ArrayDeque<Integer> xs=new ArrayDeque<>();
		ArrayDeque<Integer> ys=new ArrayDeque<>();
		xs.addLast(startX);
		ys.addLast(startY);
		onX[startX].remove(startY);
		onY[startY].remove(startX);
		int[][] dist=new int[w][h];
		for (int x=0; x<dist.length; x++) Arrays.fill(dist[x], -1);
		dist[startX][startY]=0;
		while (!xs.isEmpty()) {
			int curX=xs.removeFirst(), curY=ys.removeFirst();
//			System.out.println("At "+curX+" "+curY+" "+dist[curX][curY]);
			//up
			{
				Integer aboveY=onX[curX].floor(curY);
				Integer block=noX[curX].floor(curY);
				while (aboveY!=null) {
					if ((block==null || aboveY>block) && curY-aboveY<=maxJump) {
						onX[curX].remove(aboveY);
						onY[aboveY].remove(curX);
						xs.addLast(curX);
						ys.addLast(aboveY);
						dist[curX][aboveY]=dist[curX][curY]+1;
					}
					else break;
					aboveY=onX[curX].floor(curY);
				}
			}
			//down
			{
				Integer belowY=onX[curX].ceiling(curY);
				Integer block=noX[curX].ceiling(curY);
				while (belowY!=null) {
					if ((block==null || belowY<block) && belowY-curY<=maxJump) {
						onX[curX].remove(belowY);
						onY[belowY].remove(curX);
						xs.addLast(curX);
						ys.addLast(belowY);
						dist[curX][belowY]=dist[curX][curY]+1;
					}
					else break;
					belowY=onX[curX].ceiling(curY);
				}
			}
			
			//left
			{
				Integer aboveX=onY[curY].floor(curX);
				Integer block=noY[curY].floor(curX);
				while (aboveX!=null) {
					if ((block==null || aboveX>block) && curX-aboveX<=maxJump) {
						onY[curY].remove(aboveX);
						onX[aboveX].remove(curY);
						xs.addLast(aboveX);
						ys.addLast(curY);
						dist[aboveX][curY]=dist[curX][curY]+1;
					}
					else break;
					aboveX=onY[curY].floor(curX);
				}
			}
			//right
			{
				Integer belowX=onY[curY].ceiling(curX);
				Integer block=noY[curY].ceiling(curX);
				while (belowX!=null) {
					if ((block==null || belowX<block) && belowX-curX<=maxJump) {
						onY[curY].remove(belowX);
						onX[belowX].remove(curY);
						xs.addLast(belowX);
						ys.addLast(curY);
						dist[belowX][curY]=dist[curX][curY]+1;
					}
					else break;
					belowX=onY[curY].ceiling(curX);
				}
			}
		}
		
//		for (int y=0; y<h; y++) {
//			for (int x=0; x<w; x++) {
//				System.out.print(dist[x][y]+" ");
//			}
//			System.out.println();
//		}
		System.out.println(dist[endX][endY]);
	}

	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}

	
}

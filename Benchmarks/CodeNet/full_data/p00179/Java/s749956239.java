import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		MainLoop : while(true){
			String text = scan.next();
			int len = text.length();
			int n = wormToInt(text);
			if(n==-1) break;
			boolean[] pattern = new boolean[(int)pow(3,len)];
			LinkedList<int[]> que = new LinkedList<int[]>();
			que.offer(new int[]{n,0});

			while(!que.isEmpty()){
				int[] ary = que.poll();
				int worm = ary[0],cnt = ary[1];

				if(pattern[worm]) continue;
				pattern[worm]=true;

				if(monotonous(worm,len)){
					out.println(cnt);
					continue MainLoop;
				}

				for (int i = 0; i < len-1; i++) {
					if(worm/(int)pow(3,i)%3!=worm/(int)pow(3,i+1)%3){
						for (int j = 0; j < 3 ; j++) {
							if(worm/(int)pow(3,i)%3!=j && worm/(int)pow(3,i+1)%3!=j) que.offer(new int[]{change(worm,i+1,i,j),cnt+1});
						}
					}
				}
			}

			out.println("NA");
		}

		out.flush();
	}

	static int change(int w,int p1,int p2,int color){
		int a = (int)pow(3,p1+1);
		int b = (int)pow(3,p2);
		return w/a*a+w%b+color*(int)(pow(3,p1)+pow(3,p2));
	}

	static boolean monotonous(int w,int len){
		int color = w%3;
		for (int i = 1; i < len; i++) {
			if(color!=w/(int)pow(3,i)%3) return false;
		}
		return true;
	}

	static int wormToInt(String w){
		if(w.equals("0")) return -1;
		int x=0;
		for (int i = w.length()-1; i >=0; i--) {
			switch(w.charAt(i)){
				case 'r' : x=x*3+0; break;
				case 'g' : x=x*3+1; break;
				case 'b' : x=x*3+2; break;
			}
		}
		return x;
	}
}
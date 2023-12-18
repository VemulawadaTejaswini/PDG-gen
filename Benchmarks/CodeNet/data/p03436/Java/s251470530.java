import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String p[] = new String[h];
		char pmae;
		boolean[][] s = new boolean[h][w];

		int motonoshiro = 0;

		for(int i=0;i<h;i++) {
			p[i]=sc.next();
			System.out.print(motonoshiro);
			for(int j=0;j<w;j++) {
				pmae = p[i].charAt(j);
				String str = String.valueOf(pmae);
				if(str==".") {
					s[i][j]=true;
					motonoshiro++;
				}
				else {
					s[i][j]=false;
				}
			}
		}
		sc.close();
		System.out.print(motonoshiro);
		if(!s[0][1]&&!s[1][0]) {
			System.out.print(-1);
		}
		else {
			int answer = fukasa(h,w,s);
			if(answer!=-1)
				System.out.print(motonoshiro-answer);
			else
				System.out.print(-1);
		}



	}

	public static int fukasa(int h, int w, boolean s[][]) {
		Queue<Integer> queue = new ArrayDeque<Integer>();

		int[] ichiji = new int[3];
		int kaisuu = 0;
		int hight=0;
		int width=0;
		ichiji[0]=1;
		ichiji[1]=1;
		ichiji[2]=1;


        while(true){
        	for(int i=0;i<3;i++)    queue.add(ichiji[i]);
        	kaisuu = queue.poll();
        	hight=queue.poll();
        	width=queue.poll();
        	if(hight==h&&width==w) {
        		return kaisuu;
        	}
        	if(hight+1<h&&hight+1>=0) {
        		if(s[hight+1][width]==s[0][0]) {
        			queue.add(kaisuu++);
        			queue.add(hight++);
        			queue.add(width);

        		}
        	}
        	if(width+1<w&&width+1>=0) {
        		if(s[hight][width+1]==s[0][0]) {
        			queue.add(kaisuu++);
        			queue.add(hight);
        			queue.add(width++);
        		}
        	}
        	if(hight-1<h&&hight-1>=0) {
        		if(s[hight-1][width]==s[0][0]) {
        			queue.add(kaisuu++);
        			queue.add(hight--);
        			queue.add(width);

        		}
        	}
        	if(width-1<w&&width-1>=0) {
        		if(s[hight][width-1]==s[0][0]) {
        			queue.add(kaisuu++);
        			queue.add(hight);
        			queue.add(width--);
        		}
        	}
        	if(kaisuu>w*h) {
        		return -1;
        	}

        }

	}

}

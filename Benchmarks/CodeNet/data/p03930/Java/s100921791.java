import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
	static int c[][];
	static int origin_c[][];
	static int H;
	static int W;
	static int K;
	static int max_score=0;
	static List<List<Integer>> empty_zahyou = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		K = sc.nextInt();

		c=new int[H][W];
		origin_c=new int[H][W];

		for(int i=0;i<H;i++) {
			int num = sc.nextInt();
			for(int j=W-1;j>-1;j--) {
				c[i][j]=num%10;
				num = num / 10;
			}
		}
		array_copy(origin_c,c);
//		int h =4-1;
//		int w =3-1;
//		slide(h,w);
//		h =3-1;
//		w =3-1;
//		slide(h,w);

		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {

			}
		}

		int score=0;
		int del_count=0;
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				slide(i,j);
				score+=del(0);//この関数がうまく動作するか調べる。
				del_count+=1;
				while(empty_zahyou.size()!=0) {
					for(List<Integer> zahyou: empty_zahyou) {
						int h=zahyou.get(0);
						int w=zahyou.get(1);
						slide(h,w);
					}
					empty_zahyou.clear();
					score+=del(del_count);
					del_count+=1;
				}
				if(score>max_score) {
					max_score=score;
				}
				score=0;
				del_count=0;
				array_copy(c,origin_c);
			}
		}

		//(4,3)を消す例題
//		int i=4-1;
//		int j=3-1;
//		slide(i,j);
//		score+=del(0);//この関数がうまく動作するか調べる。
//		del_count+=1;
//		while(empty_zahyou.size()!=0) {
//			for(List<Integer> zahyou: empty_zahyou) {
//				int h=zahyou.get(0);
//				int w=zahyou.get(1);
//				slide(h,w);
//			}
//			empty_zahyou.clear();
//			score+=del(del_count);
//			del_count+=1;
//		}
//		if(score>max_score) {
//			max_score=score;
//		}
//		score=0;
//		del_count=0;

		System.out.println(max_score);
		sc.close();

	}
	//空きマスを埋める関数
	public static void slide(int h,int w) {
		int i = h;
		while(i>0 && c[i-1][w]!=-1) {
			c[i][w] = c[i-1][w];
			i--;
		}
		c[i][w]=-1;
	}

	//現在の盤面から削除できるマスを消す
	public static int del(int del_count) {
		int score=0;
		int count=1;
		int x_start=0;
		int cur_x=0;
		for(int i=0;i<H;i++) {
			if(count>=K) {
				for(int x=x_start;x<cur_x+1;x++) {
					empty_zahyou.add(new ArrayList<Integer>(Arrays.asList(i-1,x)));
				}
				score+=(int) Math.pow(2, del_count) * c[i-1][cur_x-1]*count;
			}
			count=1;
			x_start=0;
			cur_x=0;
			while(cur_x<W-1) {
				if(c[i][cur_x]==c[i][cur_x+1] && c[i][cur_x]!=-1) {
					count++;
				}
				else {
					if(count>=K) {
						for(int x=x_start;x<cur_x+1;x++) {
							empty_zahyou.add(new ArrayList<Integer>(Arrays.asList(i,x)));
						}
						score+=(int) Math.pow(2, del_count) * c[i][cur_x]*count;
					}
					x_start=cur_x+1;
					count=1;
				}
				cur_x++;
			}
		}
		if(count>=K) {
			for(int x=x_start;x<cur_x+1;x++) {
				empty_zahyou.add(new ArrayList<Integer>(Arrays.asList(H-1,x)));
			}
			score+=(int) Math.pow(2, del_count) * c[H-1][cur_x]*count;
		}
		return score;
	}

	public static void array_copy(int[][] dst, int[][] src) {
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				dst[i][j] = src[i][j];
			}
		}
	}
}











import java.util.*;
 
public class Main{
	public static boolean[][] kanou = new boolean[50][50];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] paint = new String[H];
		for(int i=0;i<H;++i) paint[i] = sc.next();
		
		int[] dx = {1,0,-1,0};
		int[] dy = {0,1,0,-1};
		for(int i=0;i<H;++i){
			for(int j=0;j<W;++j){
				if(paint[i].charAt(j)=='#'&&!kanou[i][j]){
					boolean cant = true;
					for(int k=0;k<4;++k){
						if(inrange(i+dy[k],j+dx[k],H,W)&&paint[i+dy[k]].charAt(j+dx[k])=='#'){
							kanou[i][j] = true;
							kanou[i+dy[k]][j+dx[k]] = true;
							cant = false;
							break;
						}
					}
					if(cant){
						System.out.println("No");
						return;
					}
				}
			}
		}
		System.out.println("Yes");
		return;
	}
	
	public static boolean inrange(int a,int b,int x,int y){
		return ((a>=0)&&(a<x))&&((b>=0)&&(b<y));
	}
}
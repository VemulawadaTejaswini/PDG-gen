import java.util.*;
import java.math.*;
import java.text.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[][] paper = new int[10][10];
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				paper[i][j] = 0;
			}
		}
		while(in.hasNext()){
			String str = in.next();
//			if(str.equals("0,0,0")) break;
			String st[] = str.split(",");
			int x = Integer.parseInt(st[0])-1;
			int y = Integer.parseInt(st[1])-1;
			int size = Integer.parseInt(st[2]);
			switch(size){
			case 1:
				paper = small(x,y,paper);
				break;
			case 2:
				paper = middle(x,y,paper);
				break;
			case 3:
				paper = big(x,y,paper);
				break;
				
			}
/*
			for(int i=0; i<10; i++){
				for(int j=0; j<10; j++){
					System.out.print(paper[i][j]);
				}
				System.out.println();
			}
*/
		}
		int blank = 0;
		int max = 0;
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				if(paper[i][j] == 0) blank++;
				else if(max<paper[i][j]) max = paper[i][j];
			}
		}
		System.out.println(blank);
		System.out.println(max);
	}
	
	public static int[][] small(int x, int y, int[][] paper){
		paper[x][y]++;
		if(x!=0) paper[x-1][y]++;
		if(x!=9) paper[x+1][y]++;
		if(y!=0) paper[x][y-1]++;
		if(y!=9) paper[x][y+1]++;
		return paper;
	}
	
	public static int[][] middle(int x, int y, int[][] paper){
		for(int i=-1; i<=1; i++){
			if(0<=i+x && i+x<10){
				for(int j=-1; j<=1; j++){
					if(0<=j+y && j+y<10){
						paper[i+x][j+y]++;
					}
				}
			}
		}
		return paper;
	}
	
	public static int[][] big(int x, int y, int[][] paper){
		for(int i=-1; i<=1; i++){
			if(0<=i+x && i+x<10){
				for(int j=-1; j<=1; j++){
					if(0<=j+y && j+y<10){
						paper[i+x][j+y]++;
					}
				}
			}
		}
		if(x>1) paper[x-2][y]++;
		if(x<8) paper[x+2][y]++;
		if(y>1) paper[x][y-2]++;
		if(y<8) paper[x][y+2]++;
		return paper;
	}
	
}
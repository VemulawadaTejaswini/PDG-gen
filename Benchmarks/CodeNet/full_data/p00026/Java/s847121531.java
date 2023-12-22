import java.util.*;

public class Main {
	
	static int zeroCheck(int[][] p){
		int count=0;
		for(int i[]: p)
			for(int j : i) if(j==0) count++;
		return count;
	}
	
	static int max(int[][] p){
		int max=0;
		for(int i[] : p)
			for(int j:i) if(max<j) max = j ;
		return max;
	}
	
	static boolean judge(int x,int y){
		if(x>=0 && x<=9 && y>=0 && y<=9)
			return true;
		else return false;
	}
	
	static int[][] dropS(int[][] p,int x,int y){
		if(judge(x,y)) p[y][x]++;
		if(judge(x+1,y)) p[y][x+1] ++;
		if(judge(x-1,y)) p[y][x-1] ++;
		if(judge(x,y+1)) p[y+1][x] ++;
		if(judge(x,y-1)) p[y-1][x] ++;
		return p;
	}
	
	static int[][] dropM(int[][] p,int x,int y){
		for(int i=-1; i<=1; i++){
			for(int j=-1; j<=1; j++){
				if(judge(x+i,y+j)) p[y+j][x+i]++;
			}
		}
		return p;
	}
	
	static int[][] dropL(int[][] p,int x,int y){
		p = dropM(p,x,y);
		if(judge(x+2,y)) p[y][x+2] ++;
		if(judge(x-2,y)) p[y][x-2] ++;
		if(judge(x,y+2)) p[y+2][x] ++;
		if(judge(x,y-2)) p[y-2][x] ++;
		return p;
	}
	
	public static String[] kommmaReader(String sc) {
		String line= sc;
		String[] array = line.split(",");
		return array;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] p = new int[10][10];
		do{
			String[] str = kommmaReader(sc.nextLine());
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			int size = Integer.parseInt(str[2]);
			
			switch(size){
			case 1: p = dropS(p,x,y); break;
			case 2: p = dropM(p,x,y); break;
			case 3: p = dropL(p,x,y); break;
			}
		} while(sc.hasNext());
		System.out.println(zeroCheck(p));
		System.out.println(max(p));
		
	}

}
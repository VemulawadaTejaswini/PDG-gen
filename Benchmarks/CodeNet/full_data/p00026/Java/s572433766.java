import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	int[][] ink = new int[10][10];
    	Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			String[] st = input.next().split(",");
			int x = Integer.parseInt(st[0]);
			int y = Integer.parseInt(st[1]);
			if(st[2].charAt(0) == '1'){
				ink[y][x]++;
				if(0 <= x-1)ink[y][x-1]++;
				if(0 <= y-1)ink[y-1][x]++;
				if(x+1 < 10)ink[y][x+1]++;
				if(y+1 < 10)ink[y+1][x]++;
			}else if(st[2].charAt(0) == '2'){
				for(int i = y-1 ; i <= y+1 ; i++){
					for(int j = x-1 ; j <= x+1 ;j++){
						if(isok(j,i))ink[i][j]++;
					}
				}
			}else{
				for(int i = y-2 ; i <= y+2 ; i++){
					for(int j = x-2 ; j <= x+2 ;j++){
						if(isok(j,i) && Math.abs(x-j)+Math.abs(y-i) <= 2)ink[i][j]++;
					}
				}
			}
		}
		int maxink = 0;
		int count = 0;
		for(int i = 0 ; i < 10 ; i++){
			for(int j = 0 ; j < 10 ; j++){
				if(ink[i][j] == 0)count++;
				maxink = Math.max(maxink, ink[i][j]);
			}
		}
		System.out.println(count);
		System.out.println(maxink);
    }
    
    public static boolean isok(int x,int y){
    	if(x < 0 || y < 0 || x >= 10 || y >= 10)return false;
    	return true;
    }
   
}
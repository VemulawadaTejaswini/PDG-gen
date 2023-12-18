import java.util.*;
import java.io.*;

public class Main {
    
    
    public static void makeBlackDotMap(int black){
    	int H = 30;
    	int W = 100;
    	boolean[][] blackMap = new boolean[H][W];
    	for(int h=0;h<H;h++) for(int w=0;w<W;w++) blackMap[h][w]=false;
    	
    	for(int b=0;b<black;b++){
    		blackMap[1+(b/50)*2][(b%50)*2]=true;
    	}
    	for(int h=0;h<H;h++){
    		for(int w=0;w<W;w++){
    			System.out.print(blackMap[h][w] ? '#' : '.');
    		}
    		System.out.println();
    	}
    }


    public static void makeWhiteDotMap(int white){
    	int H = 30;
    	int W = 100;
    	boolean[][] blackMap = new boolean[H][W];
    	for(int h=0;h<H;h++) for(int w=0;w<W;w++) blackMap[h][w]=true;
    	
    	for(int w=0;w<white;w++){
    		blackMap[1+(w/50)*2][(w%50)*2]=false;
    	}
    	for(int h=0;h<H;h++){
    		for(int w=0;w<W;w++){
    			System.out.print(blackMap[h][w] ? '#' : '.');
    		}
    		System.out.println();
    	}
    }

    
    public static void solve(int white, int black){
    	int H = 100;
    	int W = 100;
    	boolean[][] blackMap = new boolean[H][W];
    	
    	if(white == 1){
    		System.out.println("30 100");
    		makeBlackDotMap(black);
    	}else if(black==1){
    		System.out.println("30 100");
    		makeBlackDotMap(white);
    	}else{
    		System.out.println("60 100");
    		makeBlackDotMap(black-1);
    		makeWhiteDotMap(white-1);
    	}
    	
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int white = sc.nextInt();
        int black = sc.nextInt();
        
        solve(white,black);
        
    }
}
import java.util.*;
import java.io.*;
 
public class Main {
    public static int distance(int x1,int y1, int x2,int y2){
    	return Math.abs(x1-x2)+Math.abs(y1-y2);
    }
    public static char color(int colorNumber){
        switch(colorNumber%4){
        	case 0:
        	    return 'R';
        	case 1:
        	    return 'Y';
        	case 2:
        	    return 'G';
        	default:
        	    return 'B';
        	
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int d = sc.nextInt();
        char[][] ans = new char[H][W];
        
        if(d%2!=0){//d:odd
        	for(int h=0;h<H;h++) for(int w=0;w<W;w++){
        	    ans[h][w] = color(h+w);
        	}
        }
        else{//d:even
/*make the block like this;
GGGGGGBRRRRY GGGGGGBRRRRY
YGGGGBBBRRYY YGGGGBBBRRYY
YYGGBBBBBYYY YYGGBBBBBYYY
YYRRBBBBBYYY YYRRBBBBBYYY
YRRRRBBBGGYY YRRRRBBBGGYY
RRRRRRBGGGGY RRRRRRBGGGGY
BRRRRYGGGGGG BRRRRYGGGGGG
BBRRYYYGGGGB BBRRYYYGGGGB
BBBYYYYYGGBB BBBYYYYYGGBB
BBBYYYYYRRBB BBBYYYYYRRBB
BBGGYYYRRRRB BBGGYYYRRRRB
BGGGGYRRRRRR BGGGGYRRRRRR

GGGGGGBRRRRY GGGGGGBRRRRY
YGGGGBBBRRYY YGGGGBBBRRYY
YYGGBBBBBYYY YYGGBBBBBYYY
YYRRBBBBBYYY YYRRBBBBBYYY
YRRRRBBBGGYY YRRRRBBBGGYY
RRRRRRBGGGGY RRRRRRBGGGGY
BRRRRYGGGGGG BRRRRYGGGGGG
BBRRYYYGGGGB BBRRYYYGGGGB
BBBYYYYYGGBB BBBYYYYYGGBB
BBBYYYYYRRBB BBBYYYYYRRBB
BBGGYYYRRRRB BBGGYYYRRRRB
BGGGGYRRRRRR BGGGGYRRRRRR
*/        
        int[][] block = new int[2*d][2*d];
	for(int h=0;h<2*d;h++) for(int w=0;w<2*d;w++){
	    int radius = d/2 -1;
	    if(   distance(h,w,d/2-1,d/2-1)<=radius
	       || distance(h,w,d/2-1,d/2)<=radius
	       || distance(h,w,3*d/2-1,3*d/2-1)<=radius
	       || distance(h,w,3*d/2-1,3*d/2)<=radius)block[h][w]=0;
	       
	    else if( distance(h,w,d/2,3*d/2-1)<=radius
	           ||distance(h,w,d/2,3*d/2)<=radius
	           ||distance(h,w,3*d/2,d/2-1)<=radius
	           ||distance(h,w,3*d/2,d/2)<=radius) block[h][w]=1;
	           
	    else if( distance(h,w,d/2-1,0)<=radius
	           ||distance(h,w,d/2,0)<=radius
	           ||distance(h,w,d/2-1,2*d)<=radius
	           ||distance(h,w,d/2,2*d)<=radius
	           ||distance(h,w,0,d)<=radius
	           ||distance(h,w,2*d-1,d)<=radius) block[h][w]=2;
	           
	    else block[h][w]=3;
	}
	for(int h=0;h<H;h++)for(int w=0;w<W;w++) ans[h][w] =color(block[h%(2*d)][w%(2*d)]);
        
        
        
        	
        }
        //output
        for(int h=0;h<H;h++){
        	for(int w=0;w<W;w++){
        	    System.out.print(ans[h][w]);
        	}
        	System.out.println();
        }
    }
}
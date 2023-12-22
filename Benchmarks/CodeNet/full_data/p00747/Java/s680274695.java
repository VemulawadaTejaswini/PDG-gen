import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new B().doIt();
    }
    class B{
    	int[][]map;
    	boolean[][]xmap;
    	boolean[][]ymap;
    	int w,h;
    	class Par{
    		int x,y;
    		public Par(int y,int x){
    			this.x = x;
    			this.y = y;
    		}
    	}
    	int dfs(int ansh,int answ){
    		int result = 10000;
    		int cnt = 0;
    		ArrayList<Par> array = new ArrayList<Par>();
    		array.add(new Par(0,0));
//    		System.out.println(map[y][x]);
//    		System.out.println(y+" "+x);
    		while(array.size() > 0){
    			int length = array.size();
//    			for(int i = 0;i < length;i++){
//    				System.out.println(array.get(i).y+" "+array.get(i).x);
//    			}
//    			System.out.println();
    			cnt++;
    			for(int i = 0;i < length;i++){
    				Par p = array.get(0);
    				array.remove(0);
    				map[p.y][p.x] = cnt;
    				if(ansh == p.y && answ == p.x)return cnt;
    				if(p.x > 0){
    	    			if(xmap[p.y][(p.x)-1] && map[p.y][(p.x)-1] > cnt){
    	    				array.add(new Par(p.y,p.x-1));
    	    			}
    	    		}
    	    		if(p.x < w - 1){
    	    			if(xmap[p.y][p.x] && map[p.y][(p.x)+1] > cnt){
    	    				array.add(new Par(p.y,p.x+1));
    	    			}
    	    		}
    	    		if(p.y > 0){
    	    			if(ymap[(p.y)-1][p.x] && map[(p.y)-1][p.x] > cnt){
    	    				array.add(new Par(p.y-1,p.x));
    	    			}
    	    		}
    	    		if(p.y < h - 1){
    	    			if(ymap[p.y][p.x] && map[(p.y)+1][p.x] > cnt){
    	    				array.add(new Par(p.y+1,p.x));
    	    			}
    	    		}
    			}
    		}
    		return result;
    	}
        void doIt(){
        	while(true){
        		w = sc.nextInt();
        		h = sc.nextInt();
        		if(w + h == 0)break;
        		map = new int[h][w];
        		xmap = new boolean[h][w-1];
        		ymap = new boolean[h-1][w];
        		for(int i = 0;i < h;i++){
        			for(int j = 0;j < w;j++){
        				map[i][j] = Integer.MAX_VALUE;
        			}
        		}
        		map[0][0] = 1;
        		for(int i = 0;i < h;i++){
        			for(int j = 0;j < w-1;j++){
        				xmap[i][j] = (sc.nextInt() == 1 ? false : true);
        			}
        			if(i == h - 1)break;
        			for(int j = 0;j < w;j++){
        				ymap[i][j] = (sc.nextInt() == 1 ? false : true);
        			}
        		}
        		int ans = dfs(h-1,w-1);
        		if(ans == 10000)System.out.println(0);
        		else System.out.println(map[h-1][w-1]);
//        		check();
        	}
     	}
        void check(){
        	for(int i = 0;i < h;i++){
        		for(int j = 0;j < w-1;j++){
        			System.out.print((xmap[i][j] == true ? 1 : 0)+" ");
        		}
        		System.out.println();
        	}
        	System.out.println();
        	for(int i = 0;i < h-1;i++){
        		for(int j = 0;j < w;j++){
        			System.out.print((ymap[i][j] == true ? 1 : 0)+" ");
        		}
        		System.out.println();
        	}
        	System.out.println();
        	for(int i = 0;i < h;i++){
        		for(int j = 0;j < w;j++){
        			System.out.print(map[i][j]+" ");
        		}
        		System.out.println();
        	}
        }
    }
}
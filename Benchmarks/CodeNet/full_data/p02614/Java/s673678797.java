import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int black = 0;
        //黒1 白0
        int[][] map = new int[h][w];
        for(int i=0; i<h; i++) {
             String S = sc.next();
             String[] c = S.split(""); 
            for(int j=0; j<w; j++) {
                if(c[j].equals("#")) {
                    map[i][j] = 1;
                    black++;
                }
            }
        }
        
        
        int count = black;
        int ans = 0;
        int[][] copy = new int[h][w];
        for(int i=0; i<h; i++) {
            copy[i] = map[i].clone();
        }
        
        
        for (int i=0; i<(Math.pow(2,h)); i++) {
            count = black;
            for(int o=0; o<h; o++) {
                copy[o] = map[o].clone();
            }
			for (int j=0; j<h; j++) {
			    if ((1&i>>j) == 1) {
			        for(int a=0; a<w; a++) {
			            if(copy[j][a] == 1) {
			                count--;
			            }
			            copy[j][a] = -1; 
			        }
			    }
			}
			int count2 = count;
            int[][] cp = new int[h][w];
            for(int z=0; z<h; z++) {
                cp[z] = copy[z].clone();
            }
			for (int x=0; x<(Math.pow(2,w)); x++) {
    			for (int y=0; y<w; y++) {
    				if ((1&x>>y) == 1) {
    			        for(int a=0; a<h; a++) {
    			            if(cp[a][y] == 1) {
    			                count2--;
    			            }
    			            cp[a][y] = -1; 
    			        }
    			    }
    			}
        		if(count2 == k) ans++;
        		for(int z=0; z<h; z++) {
                    cp[z] = copy[z].clone();
                }
        		count2 = count;
    		}
    	
    		
		}
		
		System.out.println(ans);

    }
}
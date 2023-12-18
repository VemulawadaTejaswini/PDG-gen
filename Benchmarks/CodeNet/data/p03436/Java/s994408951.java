import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int h = Integer.parseInt(sc.next());
            int w = Integer.parseInt(sc.next());
            int[][] list = new int[h][w];
            int[][] list2 = new int[h][w];
            int bcounter = 0;
            int counter = 1;
            
            for(int i=0; i<h; i++){
            	String a = sc.next();
            	for(int j=0; j<w; j++){
            		list2[i][j] = h*w+1;
            		if(a.substring(j,j+1).equals("#")){
            			list[i][j] = 1;
            			bcounter++;
            		}else{
            			list[i][j] = 0;	
            		}
            	}
            }
            list2[0][0] = 1;
            while(counter != 0){
            	counter = 0;
            	for(int i=0; i<h; i++){
                	for(int j=0; j<w; j++){
                		if(list[i][j] == 0){
                			int a = 1 + Math.min(Math.min(list2[Math.max(0, i-1)][j], list2[Math.min(h-1, i+1)][j]), Math.min(list2[i][Math.max(0, j-1)], list2[i][Math.min(w-1, j+1)]));
                			if(list2[i][j] > a){
                				counter++;
                				list2[i][j] = a;
                			}
                		}
                	}
                }
            }
            
            //出力
            System.out.println(Math.max(-1, h*w - list2[h-1][w-1] - bcounter));
            sc.close();
        }
    }
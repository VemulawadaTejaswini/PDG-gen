import java.util.*;

public class Main { //AOJ0610
    Scanner sc = new Scanner(System.in);
    public int h = sc.nextInt();
    public int w = sc.nextInt();
    public int[][] cloud = new int [h][w];
	public char[][] weather = new char [h][w];
	void doIt(){
        for(int i = 0; i < h; i++){
            weather[i]= sc.next().toCharArray();
        }
		for(int i = 0; i < h; i++){
    	   int minutes = -1;
    	   for(int k = 0; k < w; k++){
    		   if(weather[i][k] == 'c'){		//??????????????°????????????
    			   minutes = 0;
    			   cloud[i][k] = minutes;
    			   minutes++;
    		   }else if(minutes >= 0){		//??????????????°??????????????????????????????????????????
    			   cloud[i][k] = minutes;
    			   minutes++;
    		   }else{		//????????\??????
    			   cloud[i][k] = minutes;
    		   }
    	   }
       }
       for(int i = 0; i < h; i++){
    	   for(int k = 0; k < w; k++){
    		   if(k == w - 1){
    			   System.out.print(cloud[i][k]);
    		   }else{
    			   System.out.print(cloud[i][k] + " ");
    		   }
    	   }
    	   System.out.println();
       }
	}
    public static void main(String[] args) {
    	new Main().doIt();
    }
}
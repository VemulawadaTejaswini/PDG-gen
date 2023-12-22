import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
	    int n = Integer.parseInt(line);
	    
	    for(int i=0;i<n;i++){
	        Count count = new Count();
	        while(count.isOver()){
	            line = br.readLine().toString();
	            if(line.equals("HIT")){
	                count.hit();
	            }else if(line.equals("OUT")){
	                count.out();
	            }else if(line.equals("HOMERUN")){
	                count.homerun();
	            }
	        }
    		System.out.println(count.score);
	    }
	}
    public static class Count{
        public int[] runner;
        public int out;
        public int score;
        Count(){
            runner = new int[3];
            out = 0;
            score = 0;
        }
        public boolean isOver(){
            if(out>=3){
                return false;
            }
            return true;
        }
        public void hit(){
            if(runner[2] == 1){
                score++;
            }
            for(int i=2;i>=1;i--){
                runner[i] = runner[i-1];
            }
            runner[0] = 1;
        }
        public void homerun(){
            for(int i=0;i<3;i++){
                if(runner[i] == 1){
                    score++;
                    runner[i] = 0;
                }
            }
            score++;
        }
        public void out(){
            out++;
        }
    }
}
import java.io.*;
import java.util.*;

public class Main{
    class Dice{
        int top;
        int bottom;
        int S;
        int W;
        int E;
        int N;
        
        Dice(int a,int b, int c,int d,int e,int f){
            this.top = a;
            this.bottom = b;
            this.S = c;
            this.W = d;
            this.E = e;
            this.N = f;
        }

        public void RollS(){
            //W = W;
            //E = E; 
            int tmp = this.bottom;
            this.bottom = this.S;
            this.S = this.top;
            this.top = this.N;
            this.N = tmp;
        }

        public void RollW(){
            //this.S = S;
            //this.N = N;
            int tmp =this.top;
            this.top = this.E;
            this.E = this.bottom;
            this.bottom = this.W;
            this.W = tmp;
        }
       
        public void RollE(){
            int tmp = this.top;
            this.top = this.W;
            this.W = this.bottom;
            this.bottom = this.E;
            this.E = tmp;
       }

       public void RollN(){
            int tmp = this.top;
            this.top = this.S;
            this.S = this.bottom;
            this.bottom = this.N;
            this.N = tmp;
       }
    }

    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
                    
        str = br.readLine();
        String[] nums = str.split("\\s");
        int[] temp = new int[6];
        for(int i=0;i<6;i++){
            temp[i] = Integer.parseInt(nums[i]);
        }

        Dice D = new Dice(temp[0],temp[5],temp[1],temp[3],temp[2],temp[4]);
        str = br.readLine();
        String[] rolls = str.split("");                    
        for(int i=0;i<rolls.length;i++){
            if(rolls[i].equals("S")){
                D.RollS(); 
            }else if(rolls[i].equals("W")){
                D.RollW();
            }else if(rolls[i].equals("E")){
                D.RollE();
            }else{
                D.RollN();
            }
        }
        System.out.println(D.top);

        br.close();
    }
}

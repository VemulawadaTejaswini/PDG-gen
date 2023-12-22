import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
        final int tou = 4, kai = 3, number = 10;
        int[][][] x = new int[tou][kai][number];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String s;
        while((s=br.readLine())!=null){
            String[] str = s.split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int c = Integer.parseInt(str[2]);
            int d = Integer.parseInt(str[3]);
            if(!(a>tou || b>kai || c>number || d>9)){
                switch(a){
                    case 1: x[a-1][b-1][c-1] += d; break;
                    case 2: x[a-1][b-1][c-1] += d; break;
                    case 3: x[a-1][b-1][c-1] += d; break;
                    case 4: x[a-1][b-1][c-1] += d; break;
                }
            }
            else break;
        }
        for(int i=0; i<x.length; i++){
            for(int j=0; j<x[i].length; j++){
                for(int k=0; k<x[i][j].length; k++){
                    System.out.print(" "+x[i][j][k]);
                }
                System.out.println("");
            }
            if(i<tou-1){
                System.out.println("####################");
            }
        }
    }
}
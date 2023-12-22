import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String egara ="4";
        final String number = "13";
        int[][] num = new int[Integer.parseInt(egara)][Integer.parseInt(number)];
        String[] tp = {"S","H","C","D"};
        int n = Integer.parseInt(br.readLine());
        String s;
        int count = 0;
        while((s=br.readLine())!=null || count!=n){
            count++;
            String[] str = s.split(" ");
            int x = Integer.parseInt(str[1]);
            /*
            switch(str[0]){
                case "S": num[0][x-1] = x; break;
                case "H": num[1][x-1] = x; break;
                case "C": num[2][x-1] = x; break;
                case "D": num[3][x-1] = x; break;
            }
            */
            if("S".equals(str[0])){
                num[0][x-1] = x;
            }else if("H".equals(str[0])){
                num[1][x-1] = x;
            }else if("C".equals(str[0])){
                num[2][x-1] = x;
            }else if("D".equals(str[0])){
                num[3][x-1] = x;
            }
        }
        for (int i=0;i<Integer.parseInt(egara);i++){
            for (int j=0;j<Integer.parseInt(number);j++){
                if(num[i][j]==0) {
                    System.out.println(tp[i] +" "+ (j+1));
                }
            }
        }
    }
}
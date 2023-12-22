import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.lang.Math;

class Main{
    
    public static void main(String[] args){
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        
        String str;
        int[] num;
        boolean flag = false; // 提出時はfalse
        boolean first = true;
        boolean second = true;

        int[] lots = null;
        int w = 0;
        int n = 0;
        
        try {
            while(flag || reader.ready()){
                str = reader.readLine();
                num = getNum(str);

                if (first) {
                    w = num[0];
                    lots = new int[w];
                    for (int i = 0; i < w; i++) lots[i] = i+1;
                    first = false;
                    continue;
                } else if(second) {
                    n = num[0];
                    second = false;
                    continue;
                } 

                swap(lots, num[0]-1, num[1]-1);

                if (--n == 0) break;
            }
            for (int i = 0; i < w; i++) System.out.println(lots[i]);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[] getNum(String str){
    //private static double[] getNum(String str){
        String[] data = str.split(","); 

        
        int[] num = new int[data.length];
        for (int i = 0; i < data.length; i++){
            num[i] = Integer.parseInt(data[i]);
        }
        

        /*
        double[] num = new double[data.length];
        for (int i = 0; i < data.length; i++){
            num[i] = Double.parseDouble(data[i]);
        }
        */

        return num;
    }

    private static void swap(int[] box, int a, int b) {
        int[] temp = new int[box.length];
        temp[a] = box[a];
        box[a] = box[b];
        box[b] = temp[a];
    }
}

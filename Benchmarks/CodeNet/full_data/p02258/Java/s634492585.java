import java.io.*;
import java.util.*;



class Main{
    //読み込みのテンプレ(stringオブジェクトまで)
    
    static int number;
    static int[] rate;
    static int maximum;
    static int minimum;
    static int gap;
    
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Integer that shows the number of the lines
        String strnumber = reader.readLine();
        number = Integer.parseInt(strnumber);
        
        //System.out.println(number);
        
        int[] rate = new int[number];
        
        //配列に格納
        for(int i=0;i<number;i++){
            rate[i] = Integer.parseInt((String)reader.readLine());
        }

        //最大・最小の判定
        maximum = doMax(rate);
        minimum = doMin(rate);
        
        gap = maximum - minimum;
        
        System.out.println(gap);
    }
    
    
    
    public static int doMax(int[] rate){
        maximum = rate[0];
        
        for(int i=1;i<rate.length;i++){
        if(maximum <= rate[i]){
            maximum = rate[i];
        }
        }
        return maximum;
    }
    
    
    public static int doMin(int[] rate){
        minimum = rate[0];
        
        for(int i=1;i<rate.length;i++){
            if(minimum >= rate[i]){
                minimum = rate[i];
            }
        }
        return minimum;
    }
}
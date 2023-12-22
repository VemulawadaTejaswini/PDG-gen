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
        
        try {
            while(reader.ready()){
                str = reader.readLine();
                num = getNum(str);

                System.out.println(gcd(num[0], num[1]) + " " + lcm(num[0], num[1]));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // ----- 自作関数 ----- //

    private static int gcd(int a, int b){
        if (a < b) {
            int buff = a;
            a = b;
            b = buff;
        }

        if (b == 0) {
            return a;
        }
        else{
            return gcd(b, a%b);
        }
    }

    private static int lcm(int a, int b) {
        return (int) (((long)a * b) / gcd(a, b));
    }

    private static int[] getNum(String str){
        String[] data = str.split(" "); 
        int[] num = new int[data.length];

        for (int i = 0; i < data.length; i++){
            num[i] = Integer.parseInt(data[i]);
        }
        return num;
    }
}

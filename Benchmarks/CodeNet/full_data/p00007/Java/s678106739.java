import java.io.*;
   
class Main{
    public static void main(String[] args) throws Exception{
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double x = Double.parseDouble(br.readLine());
        double y = 100000;
        int    z = 0;
        for (int i=0; i<x; i++) {
            y = y + (y * x/100);
            y = y /1000;
            y = Math.ceil(y);
            y = y * 1000;
            z = (int)y;
        }
        System.out.println(z);
    }
}
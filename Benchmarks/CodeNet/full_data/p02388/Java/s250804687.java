import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader r =
         new BufferedReader(new InputStreamReader(System.in), 1);
         
        String s = r.readLine();    
        int i = Integer.parseInt(s);
          
        if((1 <= i )&(i<= 100)){
            System.out.println(i*i*i);
        }
        r.close();
    }
}
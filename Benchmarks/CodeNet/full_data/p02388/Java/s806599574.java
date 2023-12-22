import java.io.*;
 
class Main{
    public static void main (String[ ] args) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        String str = br.readLine();
        int x = Integer.parseInt(str);
        x = x^3;
        System.out.println(x);
    }
}
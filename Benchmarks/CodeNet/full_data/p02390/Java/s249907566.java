import java.io.*;
 
class Main{
    public static void main (String[ ] args) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        String str = br.readLine();

        int a = Integer.parseInt(str);
        
        System.out.println((a/3600) + ":" + (a%3600/60) + ":" +(a%3600%60));
    }
}
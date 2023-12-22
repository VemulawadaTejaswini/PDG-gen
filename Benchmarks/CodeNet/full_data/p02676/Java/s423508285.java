import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader k = new BufferedReader(isr);

        try{
            String buf = k.readLine();
            x = Integer.parseInt(buf);
        }catch(Exception e){
            x = 0;
        }

        String s = scan.nextLine();



        if(s.length() < x) {
        	System.out.println(s);
        } else {
        	String ss = s.substring(0, x);
        	System.out.println(ss + "...");
        }
        scan.close();
    }

}
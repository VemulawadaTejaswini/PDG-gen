import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.next());
        String b = scan.next();
//        int c = Integer.parseInt(scan.next());
        String answer = "No ";
        int count = 0;
        int count2 = 0;
        for(int i = 1;i<a;i++){
            if(String.valueOf(b.charAt(i-1)).equals("#")){
                if(String.valueOf(b.charAt(i)).equals(".")){
                    count += 1;
                }
            }
        }
        for(int i = 1;i<a;i++){
            if(String.valueOf(b.charAt(i)).equals(".")){
                if(String.valueOf(b.charAt(i-1)).equals("#")){
                    count2 += 1;
                }
            }
        }
        if(count>count2){
            count = count2;
        }
       PrintWriter out = new PrintWriter(System.out);
        out.println(count);
        out.flush();
        scan.close();
    }
}
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String answer = null;
        ArrayList <Integer> b = new ArrayList<Integer>();
        for(int i = 0;i<6;i++){
            b.add(scan.nextInt());
        }
        int c = b.get(5);
        Collections.sort(b);

        for(int i = 5;i>0;i--){
            for(int q = 1; i>=q ;q++){
                if((b.get(i) - b.get(i-q)) < c){
                    answer = "Yay!";
                }else {
                    answer = ":(";
            }
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(answer);
        out.flush();
        scan.close();
    }
}
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String answer = "a";
        ArrayList <Integer> b = new ArrayList<Integer>();
        for(int i = 0;i<6;i++){
            b.add(scan.nextInt());
        }
        int c = b.get(5);
        b.remove(   5);
        for(int i = 4;i>0;i--){
            while(!answer.equals(":(")){
                for(int q = 1; i+1>q ;q++){
                    if((b.get(i) - b.get(i-q)) < c){
                        answer = "Yay!";
                    }else {
                        answer = ":(";
                        break;
                    }
                }
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(answer);
        out.flush();
        scan.close();
    }
}
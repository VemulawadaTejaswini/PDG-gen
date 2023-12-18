import java.util.Scanner;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String S = sc.next();
        int price = 700;
        for (int i = 0; i < S.length(); i++){
            if (S.substring(i, i + 1).equals("o")){
                price += 100;
            }
        }
        
        out.println(price);

        //テンプレ
        sc.close();
        out.flush();
    }
}
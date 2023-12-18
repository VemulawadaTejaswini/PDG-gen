import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static private Scanner scan = new Scanner(System.in);
    public static void main(String args[]) {
        int int1 = Integer.parseInt(scan.next());
        int int2 = Integer.parseInt(scan.next());
//        int int3 = Integer.parseInt(scan.next());
        int ans_int = 0;
        String ans = "";
        int[] balls = new int [int1];
//        String temp_str1 = "";
//        String temp_str2 = "";
        int temp_int1 = 0;

        for(int i = 0;i<int1;i++){
            balls[i] =  Integer.parseInt(scan.next());
        }
        ans_int+=1;
        for(int i = 0;i<balls.length;i++){
            temp_int1 += balls[i];
            if(temp_int1 > int2){
                break;
            }else{
                ans_int+=1;
            }
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(ans_int);
        out.flush();
        scan.close();
    }
}
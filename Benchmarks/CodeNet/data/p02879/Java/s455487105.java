import java.util.*;
import java.io.*;

public class TaskABeg144 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        //PrintWriter pw = new PrintWriter("TaskABeg144.out");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a < 1 || a > 9 || b < 1 || b > 9)
            System.out.println(-1);
        else{
            System.out.println(a*b);
        }
    }
}
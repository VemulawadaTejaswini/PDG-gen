import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int v = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int t = sc.nextInt();

        String cat = new String("NO");

        int dis = Math.abs(a - b);
        if(w < v && (dis/Math.abs(v - w) <= t)){ cat = "YES"; }

        System.out.println(cat);
        sc.close();
    }
}
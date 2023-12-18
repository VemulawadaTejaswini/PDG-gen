import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        System.out.println((R < 1200)?"ABC":(R<2800)?"ARC":"AGC");
        sc.close();
    }
}
import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int i=Integer.parseInt(line);
        if(i<1200)
        System.out.println("ABC");
        else if(i<2800)
        System.out.println("ARC");
        else
        System.out.println("AGC");
    }
}
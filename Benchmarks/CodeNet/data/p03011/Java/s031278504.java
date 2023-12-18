import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();
        int r = in.nextInt();

        System.out.println(Integer.min(p+q, Integer.min(q+r, p+r)));
    }
}
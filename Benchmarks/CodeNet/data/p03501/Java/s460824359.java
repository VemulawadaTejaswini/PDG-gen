import java.util.*;
import java.util.ArrayList;

public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
        System.out.println(Math.min(N*A,B));
    }
}
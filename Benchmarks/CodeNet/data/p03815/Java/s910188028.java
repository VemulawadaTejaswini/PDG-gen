import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long kazu = (int)(x/11);
        long amari = (int)(x%11);
        long result = kazu * 2 + amari%6 + 1;
        System.out.println(result);
        sc.close();
    }
}
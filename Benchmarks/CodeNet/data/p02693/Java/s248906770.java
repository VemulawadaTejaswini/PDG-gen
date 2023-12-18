import java.util.*;
import java.io.*;
class Main {
    static boolean isMultiple(int a, int b, int k) {
        for(int i = a; i<=b; i++)
            if(i%k==0)
                return true;
            return false;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(isMultiple(a, b, k)?"OK":"NG");
    }
}
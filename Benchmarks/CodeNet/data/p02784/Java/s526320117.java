import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.next();
        int n = sc.next();

        for(int i = 0 ; i < n ; i++){
        	h -= sc.nextInt();
        }

        System.out.println(h <= 0 ? "Yes" : "No");
    }
}
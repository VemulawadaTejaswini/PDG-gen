import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int i,j;
        while(true) {
            i = sc.nextInt();
            j = sc.nextInt();
            
            if(i==0 && j==0) break;
            
            if(i>j) {
                System.out.printf("%d %d\n", j, i);
            } else {
                System.out.printf("%d %d\n", i, j);
            }
        }

    }
}


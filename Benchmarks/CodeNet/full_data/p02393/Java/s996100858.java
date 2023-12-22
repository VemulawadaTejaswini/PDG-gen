import java.io.*;
import java.util.*;
import java.lang.Math;
import java.util.Arrays;

public class Main {
    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[3];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();

        Arrays.sort(a);

        for(int i = 0; i < 3; i++){
            System.out.print(a[i]);
            if(i != 2)System.out.print(" ");
        }
        System.out.print("\n");
    }
  
}

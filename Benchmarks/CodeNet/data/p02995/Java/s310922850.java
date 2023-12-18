import java.util.*;

import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int count = 0;

        for(int i = A; i <= B; i++){
            if(i%C != 0 && i%D != 0){
                count++;
            }  
        }

        System.out.println(count);
        
    }
}
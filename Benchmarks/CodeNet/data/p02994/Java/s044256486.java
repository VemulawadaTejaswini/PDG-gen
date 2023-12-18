import java.util.*;

import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int apple[] = new int[N+1];
        int sub = 0;
        int min = 1000;
        int c = 0;
        int pie = 0;


        for (int i = 1; i<=N; i++){
            apple[i] = L + i - 1;
            
            if(apple[i] < 0){
                sub = -apple[i];
            }else{
                sub = apple[i];
            }

            if(sub <= min){
                min = sub;
                c = i;
                //System.out.println(c);
            }
            //System.out.println(min);
        }   

        for (int i = 0; i<=N; i++){
            if(i != c){
                pie += apple[i];
            }
            //System.out.println(pie);
        }

        System.out.println(pie);
        
    }
}
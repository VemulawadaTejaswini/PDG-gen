import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       ArrayList<Integer> l = new  ArrayList<>();
 
       int b = Integer.parseInt(sc.next());
       int c = Integer.parseInt(sc.next());
        l.add( b);
        l.add(c);

        int result = 0;

        for(int i = 2; i < n; i++){
              int a =Integer.parseInt(sc.next());
              l.add(a);

              for(int j = i-1 ; j >= 0; j--){
                   
              for(int k = j-1 ; k >= 0; k--){
                  b =l.get(j);
                  c = l.get(k);
                   if(a < b + c
                       && b < a + c 
                       && c <b + a ){
                          result ++;
                    }
              }

              }
        }

        System.out.println(result);
    }
}

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
 
        l.add( sc.nextInt());
        l.add(sc.nextInt());

        int result = 0;

        for(int i = 2; i < n; i++){
              l.add(sc.nextInt());

              for(int j = i-1 ; j >= 0; j--){
                   
              for(int k = j-1 ; k >= 0; k--){
                   if(l.get(i) < l.get(j) + l.get(k)
                       && l.get(j) < l.get(i) + l.get(k) 
                       && l.get(k) < l.get(j) + l.get(i) ){
                          result ++;
                    }
              }

              }
        }

        System.out.println(result);
    }
}

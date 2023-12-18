import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

       ArrayList<Integer> l = new  ArrayList<>();
 
      
        l.add(Integer.parseInt(sc.next()));
        l.add(Integer.parseInt(sc.next()));

        int result = 0;

        for(int i = 2; i < n; i++){
              l.add(Integer.parseInt(sc.next()));

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

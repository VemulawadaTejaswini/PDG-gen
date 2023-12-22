import java.security.SecureRandom;
import java.sql.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String s=sc.next();
       ArrayList<Integer> a= new ArrayList<>();
       int count=0;
       for (int i=0;i<s.length();i++){
           if (s.charAt(i)=='R')count++;
           else{
               a.add(count);
               count=0;

           }

       }
       Collections.sort(a,Collections.reverseOrder());
        System.out.println(a.get(0));

        }
    }





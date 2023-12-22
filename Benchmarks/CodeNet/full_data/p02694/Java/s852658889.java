import java.util.*;

public class Main {
    public static void main(String[] args) {
        long count =0;
        long kazu=0;
        long number=100;
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        long n=Long.parseLong(a);
        while (true){
          number=(long)(1.01*number);
          //System.out.println(number);
          count++;
          if(number>=n){
              break;
          }
        }
        System.out.println(count);
    }
}


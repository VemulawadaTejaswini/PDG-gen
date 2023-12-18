import java.util.*;

public class Main{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  long a = sc.nextLong();
  long b = sc.nextLong();
  long c = sc.nextLong();
  long count = 0;
   for(long l = a; a <= b; a++){
    if(a%c == 0){
     count += 1; 
    }
   }
  System.out.println(count);
 }
}
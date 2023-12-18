import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  long a = sc.nextLong();
  long b = sc.nextLong();
  long x = sc.nextLong();
  long first;
  long last;
  for(long i = a;;i++){
    if(i%x == 0){
      first = i;
      break;
    }
  }
  for(long i = b;;i--){
    if(i%x == 0){
      last = i;
      break;
    }
  }
  System.out.println(((last - first)/x)+1);
}}

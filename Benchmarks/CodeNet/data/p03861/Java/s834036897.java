import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  long a = sc.nextLong();
  long b = sc.nextLong();
  long x = sc.nextLong();
  long first;
  long last;
  for(long i = 0;;i++){
    if(i*x >= a){
      first = i;
      break;
    }
  }
  for(long i = a/x;;i++){
    if(i*x >= b){
      last = i-1;
      break;
    }
  }
  System.out.println(((last - first)/x)+1);
}}

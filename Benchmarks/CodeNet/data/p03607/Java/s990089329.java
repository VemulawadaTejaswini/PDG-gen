import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  long N = sc.nextLong();
  Set<Integer> s = new HashSet<Integer>();
  for(long i = 0;i < N;i++){
    long temp = sc.nextLong();
    if(s.contains(temp))s.remove(temp);
    else s.add(temp);
  }
  System.out.println(s.size());
}}
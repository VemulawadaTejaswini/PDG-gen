import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  List<String> l = new ArrayList<>();
  for(int i=0;i<N;i++){
    l.add(sc.next());
  }
  List<String> m = l.stream().distinct().collect(Collectors.tolist());
  System.out.println(m.size());
}}

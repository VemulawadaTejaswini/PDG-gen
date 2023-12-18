import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int[] d = new int[N];
  int counter = 0;
  for(int i=0;i<N;i++){
    d[i] = sc.nextInt();
  }
  for(int i = 0;i<N;i++){
    boolean b = true;
    for(int j = 0;j<=i;j++){
      if(d[i] == d[j])b = false;
    }
    if(b)counter += 1;
  }
  System.out.println(counter);
}}

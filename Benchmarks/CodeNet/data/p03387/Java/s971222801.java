import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int[] n = new int[3];
  n[0] = sc.nextInt();
  n[1] = sc.nextInt();
  n[2] = sc.nextInt();
  Arrays.sort(n);
  int count = 0;
  count += (n[1] - n[0])/2;
  if((n[1] - n[0])%2 == 0)count += n[2] - n[1];
  else{
    count += n[2] - n[1] + 2;
  }
  System.out.println(count);
}}
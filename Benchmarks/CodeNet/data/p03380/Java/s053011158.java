import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int a[] = new int[n];
  for(int i = 0;i < n;i++){
    a[i] = sc.nextInt();
  }
  Arrays.sort(a);
  int m = a[n-1];
    int min = 1000000000;;
    for(int i = 0;i < n-1;i++){
      if(Math.abs((double)m/2 - (double)a[i]) < Math.abs((double)m/2 - (double)min)){
        min = a[i];
      }
    }
    System.out.println(m + " " + min);
}}

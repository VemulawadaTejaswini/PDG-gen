import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int K = sc.nextInt();
  int[] a = new int[N];
  for(int i = 0;i < N;i++){
    a[i] = sc.nextInt();
  }
  Arrays.sort(a);
  int counter = 0;
  int del = a.length;
  for(int i = 1;i < N;i++){
    if(a[i] != a[i-1]){
      counter++;
    }
    if(counter == K){
      del = i;
      break;
    }
  }
  System.out.println(a.length - del);
}}
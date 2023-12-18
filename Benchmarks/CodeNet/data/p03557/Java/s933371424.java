import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
  int N = sc.nextInt();
  long[] a = new long[N];
  long[] b = new long[N];
  long[] c = new long[N];
  for(int i = 0;i < N;i++){
    a[i] = sc.nextLong();
  }
  for(int i = 0;i < N;i++){
    b[i] = sc.nextLong();
  }
  for(int i = 0;i < N;i++){
    c[i] = sc.nextLong();
  }
  int counter = 0; 
  for(int i = 0;i < N;i++){
    for(int j = 0;j < N;j++){
      for(int k = 0;k < N;k++){
        if(a[i] > b[j] && b[j] > c[k])counter++;
      }
    }
  }
  System.out.println(counter);
}}
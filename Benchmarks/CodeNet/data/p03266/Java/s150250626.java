import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int k = sc.nextInt();
  int count = 0;
  int min = k/3;
  for(int i = min;i <= n;i++){
    int a = i;
    for(int j = min;j <= n;j++){
      int b = j;
      if((a+b)%k == 0 && (Math.abs(a-b))%k == 0){
        for(int m = min;m <= n;m++){
          if((a+m)%k == 0 && (b+m)%k == 0){
            count++;
          }
        }
      }
    }
  }
  System.out.println(count);
}}
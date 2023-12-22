import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  int c[] = new int[30];
  Scanner sc = new Scanner(System.in);
  for(int i = 1; i <= 10; i++) {
  c[i] = sc.nextInt();
  }
  int tmp;
  int k;
  for(int j = 1; j <= 10; j++)
  {
     for( k = 1; k <= 9; k++)
     { 
     if(c[k]>c[k+1]) {
         tmp = c[k];
         c[k] = c[k+1];
         c[k+1] = tmp;
      }
      }
   }
  System.out.println(c[10]+" "+c[9]+" "+c[8]);
  }
}
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  int c[] = new int[10];
  Scanner sc = new Scanner(System.in);
  for(int i = 1; i <= 10; i++) {
  c[i] = sc.nextInt();
  }
  int tmp;
  for(int j = 1; j <= 10; j++)
  {
     for(int k = 1; k <= 10; k++)
     { 
     if(c[i]>c[i+1]) {
         tmp = c[i];
         c[i] = c[i+1];
         c[i+1] = tmp;
      }
      }
   }
  System.out.println(c[10]+" "+c[9]+" "+c[8]);
  }
}
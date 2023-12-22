import java.util.Scanner;
public class Main{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  while(true){
   int n = sc.nextInt();
   if(n == 0)
    break;
   int data[] = new int[n];
   for(int i = 0 ; i < n ; i++)
    data[i] = sc.nextInt();
   int sum = data[0];
   for(int i = 1 ; i < n ; i++)
    sum += data[i];
   double ave = (double)sum / n;
   double a2 = 0;
   for(int i = 0 ; i < n ; i++)
    a2 += Math.pow(data[i]-ave , 2.0);
   a2 /= (double)n;
   double a = Math.sqrt(a2);
   System.out.println(a);
  }
 }
}

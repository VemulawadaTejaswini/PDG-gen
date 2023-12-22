import java.util.Scanner;
public class Main{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int num[] = new int[3];
  int i=0,j=0;
  int tmp = 0;
  num[0] = sc.nextInt();
  num[1] = sc.nextInt();
  num[2] = sc.nextInt();
  for(i = 0 ; i < 2 ; i++)
  {
   for(j = 2 ; j > i ; j--)
   {
    if(num[j - 1] > num[j])
    {
     tmp = num[j - 1];
     num[j - 1] = num[j];
     num[j] = tmp;
    }
   }
  }
  System.out.printf("%d %d %d\n",num[0],num[1],num[2]);
 }
}

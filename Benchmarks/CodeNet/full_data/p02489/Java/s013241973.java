import java.util.Scanner;

 public class Main{
  public static void main(String[] args){ 
  int[] x= new int[100];
  int i=0;
   Scanner sc=new Scanner(System.in);
  x[0]=sc.nextInt();
  if(x[0]!=0)
  System.out.println("Case "+i+": "+x[0]);
   for(i=1;x[i-1]!=0&&i<100;i++){
    x[i]=sc.nextInt();
    if(x[i]!=0)
     System.out.println("Case "+i+": "+x[i]);
    }
  }
}
import java.util.Scanner;

 public class Main{
  public static void main(String[] args){ 
  int[] x= new int[100];
  int i=0;
  int j;
   Scanner sc=new Scanner(System.in);
  x[0]=sc.nextInt();
   for(i=1;x[i-1]!=0&&i<100;i++){
    x[i]=sc.nextInt();
    j=i+1;
    }
  int k;
   for(k=0;k<i-1;k++){
    System.out.println("Case "+(k+1)+": "+x[k]);
    }
  }
}
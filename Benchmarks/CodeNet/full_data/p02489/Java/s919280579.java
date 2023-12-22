import java.util.Scanner;

 public class Print{
  public static void main(String[] args){ 
  int x[100];
   Scanner sc=new Scanner(System.in);
   for(i=0;x[i]!=0;i++){
    x[i]=sc.nextInt();
    if(x[i]!=0)
     System.out.println("Case "+i+": "+x[i]);
    }
  }
}
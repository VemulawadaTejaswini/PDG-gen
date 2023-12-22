import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
      int m = sc.nextInt();
      int f = sc.nextInt();
      int r = sc.nextInt();
      if(m==-1 && f==-1 && r==-1)break;

      if(m==-1 || f==-1 || m+f<30)System.out.printf("F\n");
      else if(80<m+f)System.out.printf("A\n");
      else if(65<m+f<80)System.out.printf("B\n");
      else if(50<m+f<65)System.out.printf("C\n");
      else if(30<m+f<50 && 50<r)System.out.printf("C\n");
      else if(30<m+f<50)System.out.printf("D\n");
      //else if(50<r)System.out.printf("C\n");

    }
  }
}
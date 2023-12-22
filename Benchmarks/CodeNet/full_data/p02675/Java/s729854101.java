
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);

	long  n=sc.nextInt();
	int d= (int) (n%10);
	if(d==2||d==4||d==5||d==7||d==9)
      {
          System.out.println("hon");
      }
	else if(d==0||d==1||d==6||d==8)
      {
          System.out.println("pon");
      }
	else if(d==3)
      {
          System.out.println("bon");
      }


    }
}

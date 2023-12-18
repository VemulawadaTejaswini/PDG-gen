import java.util.*;

public class Main(){
  public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt():
    	int b = sc.nextInt();
    	int c = a+b;
    	int d;
    	if(a>b)
        {
          d=a-b;
        }
    	else
        {
          d=b-a;
        }
      	 int e = a*b;
            if(c > d && c > e)

        {

            System.out.println(c);

        }

        else if(d > e)

        {

            System.out.println(d);

        }

        else

        {

            System.out.println(e);

        }
  }
}

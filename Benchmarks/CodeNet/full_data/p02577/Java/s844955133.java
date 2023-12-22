import java.util.*;
public class Main{   
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
  		int b=0;
  		int sum =0;
  		while(a!=0)
        {
          a=a/10;
          b= a%10;
          sum+=b;
        }
        if(sum%9==0)
        {
            System.out.println("Yes");
        }else 
        {
            System.out.println("No");
        }
    }
}
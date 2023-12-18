import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong();
    if(4*a*b<Math.pow(c-a-b, 2)&&c-a-b>0) {
    	System.out.println("Yes");
    }else {
    	System.out.println("No");
    }
  }
}

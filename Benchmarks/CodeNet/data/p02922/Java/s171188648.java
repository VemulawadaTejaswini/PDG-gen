import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int total=0;
    int count=0;

    while (total<=b) {
      total+=a;
      count++;
      //System.out.println(total+" "+count);
    }

    System.out.println(count);
  }
}

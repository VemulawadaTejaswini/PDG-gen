import java.util.*;
public class AAtCoderCrackers{
  public static void Main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int k = sc.nextInt();

      if(n<k){
        System.out.println(0);
        System.exit(0);
      }
      if(n%k==0){
        System.out.println(0);
      }
      if(n%k!=0){
        System.out.println(n%k);
      }

      }

  }
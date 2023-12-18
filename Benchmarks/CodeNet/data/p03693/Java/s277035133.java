import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      String a=sc.nextLine();
      a=a.replace(" ","");
      int po=Integer.parseint(a);
      System.out.println((po%4==0)?"YES":"NO");
    }
}

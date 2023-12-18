import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
      int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      sc.nextLine();
      String s=sc.nextLine();
      int cntr=1;
      for(int i=1;i<s.length();i++)
      if(s.charAt(i)!=s.charAt(i-1))
      cntr++;
      System.out.println(cntr);
    }
}
import java.util.Scanner;
public class Main {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    String s1;
    String s2;
    String s3;
    int counter = 0;

    s1 = sc.next();
    s2 = sc.next();
    s3 = sc.next();

    if (s1.equals('R')){
      counter++;
    }
    if(s2.equals('R')){
      counter++;
    }
    if (s1.equals('R')){
      counter++;
    }

    System.out.println(counter);
  }
}

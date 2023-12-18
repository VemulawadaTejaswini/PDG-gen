import  java.util.Scanner;
//import jaava.util.InputMismatchException;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    String s2 = sc.next();
    int count=0,i;
    for(i=0;i<3;i++){
      if(s1.charAt(i)==s2.charAt(i))count++;
    }
    System.out.println(count);
  }
}

import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String w = sc.next();
    char s = w.charAt();
    if(s=='a' || s=='i' || s=='u' || s=='e' || s=='o'){
    System.out.println("vowel");
    }else{
    System.out.println("consonant");
    }
  }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
      String c = scan.next();
      if (c=="a"||c=="i"||c=="u"||c=="e"||c=="o"){
        System.out.println("vowel");
      }else{
        System.out.println("consonant");
      }
    }
}
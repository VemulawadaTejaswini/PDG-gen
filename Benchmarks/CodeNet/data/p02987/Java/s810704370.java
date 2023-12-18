import java.util.Scanner;

public class A_Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String source = sc.next();

    for (int i = 0; i < source.length(); i++) {
      boolean appear = false;

      for (int j = i + 1; j < source.length(); j++) {
        if(source.charAt(i)==source.charAt(j)){
          if(!appear) {
            appear = true;
          }else {
            System.out.println("No");
            return;
          }
        }
      }
      if(!appear){
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}



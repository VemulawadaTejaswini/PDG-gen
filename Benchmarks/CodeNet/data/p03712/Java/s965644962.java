import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    String S[] = new String[H];
    String sharp = "##";
    
    for(int j=0; j<W; j++) {
      sharp += "#";
    }
    System.out.println(sharp);
    
    for(int i=0; i<H; i++) { 
      S[i] ="#" + sc.next() + "#";
      System.out.println(S[i]);
    }
    System.out.println(sharp);
  }
}
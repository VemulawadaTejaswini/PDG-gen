import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String qa = sc.nextLine();
    int q = Integer.parseInt(qa);
    String[] t = new String[q];
    
    for(int i = 0; i < q; i++) {
      t[i] = sc.nextLine();
      if(t[i].toCharArray()[0] == '1') {
        StringBuilder rev = new StringBuilder(s).reverse().toString();
        s = rev;
      } else {
        char letter = t[i].toCharArray()[4];
        if(t[i].toCharArray()[2] == '1') {
          s = letter + s;
        } else {
          s = s + letter;
        }
      }
    }
    System.out.println(s);  
  }
}
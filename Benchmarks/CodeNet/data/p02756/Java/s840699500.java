
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
 
  public static void main(String[] args) throws FileNotFoundException {
//  Scanner cin = new Scanner(new FileReader("input.txt"));
     Scanner cin = new Scanner(System.in);
    String s = cin.nextLine();
    StringBuilder input = new StringBuilder(); 
    input.append(s);
    int n = cin.nextInt();
    Boolean mark = false;
    for (int i=0;i<n;i++) {
      int q = cin.nextInt();
      if (q==1) {
        mark = !mark;

      }
      else {
        int f = cin.nextInt();
        String c = cin.next();
        if (f==1&&!mark||f==2&&mark){
          input.insert(0,c);
        }
        else{
          input.append(c);
        }
      }
    }
    if (mark){
      input = input.reverse(); 
    }
 
    System.out.println(input.toString());
  }
 
}
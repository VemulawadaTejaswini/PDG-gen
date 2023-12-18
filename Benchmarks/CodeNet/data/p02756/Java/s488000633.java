
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {
//   Scanner cin = new Scanner(new FileReader("input.txt"));
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
      else if (q==2) {
        int f = cin.nextInt();
        String c = cin.next();
        if (f==1&&!mark||f==2&&mark){
          // s = c+s;
          input.insert(0,c);
        }
        else if (f==1&&mark||f==2&&!mark){
          // s = s+c;
          input.append(c);
        }
        // else if (f==2&&!mark){
        //   s = s+c;

        // }
        // else if (f==2&&mark){
        //   s = c+s;
        // }
      }
    }
    if (mark){
      input = input.reverse(); 
    }

    System.out.println(input.toString());
  }

}

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
 
  public static void main(String[] args) throws FileNotFoundException {
//  long tim1 = System.currentTimeMillis();
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
        char c = cin.next().charAt(0);
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
  //  long tim2 = System.currentTimeMillis();
    //System.out.println("time "+(tim2-tim1));
  }
 
}
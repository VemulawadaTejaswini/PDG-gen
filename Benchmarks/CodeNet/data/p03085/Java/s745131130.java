import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String x = sc.next();
      if(x == "A")System.out.println('C');
      if(x == "C")System.out.println('A');
      if(x == "G")System.out.println('T');
      if(x == "T")System.out.println('G');
      sc.close();
    }
}

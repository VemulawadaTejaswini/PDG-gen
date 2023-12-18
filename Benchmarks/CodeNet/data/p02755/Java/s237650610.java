
import java.util.*;

public class Main{
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int A = sc.nextInt();
  int B = sc.nextInt();


  double OriginalA = A/0.08;
  double OriginalB = B/0.10;


  if(OriginalA <= OriginalB){
  System.out.println((int)OriginalA);
}else if(OriginalA > OriginalB){
  System.out.println((int)OriginalB);
}  else {
  System.out.println("1");
}
}
}

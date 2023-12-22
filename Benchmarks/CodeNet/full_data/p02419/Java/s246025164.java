import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int count=0;
    String W;
    W=sc.next();
    while(true){
      int index=0;
      String T=sc.next();
      if(T.equals("END_OF_TEXT")) break;
      while(true){
        String w=W.toLowerCase();
        String t=T.toLowerCase();
        if(w.equals(t)){
          count+=1;
          break;
        }else{
          break;
        }
      }
    }
    System.out.println(count);
      sc.close();
  }
}

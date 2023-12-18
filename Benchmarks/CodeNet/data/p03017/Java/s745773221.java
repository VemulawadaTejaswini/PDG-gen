import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt()-1;
    int b = sc.nextInt()-1;
    int c = sc.nextInt()-1;
    int d = sc.nextInt()-1;
    String s = sc.next();
    sc.close();
    char[] ch = s.toCharArray();
    //boolean root = true;
    boolean change = false;
    for (int i=a+1;i<Math.max(c,d)-1;i++){
      if (ch[i] == '#'){
        i++;
        if (ch[i] == '#'){
          //root = false;
          System.out.println("No");
          System.exit(0);
        }
      }
    }
    if (c>d){
      int count = 0;
      for (int i=b-1;i<d+2;i++){
        if (ch[i] == '.'){
          count++;
          if (count ==3){
            System.out.println("Yes");
            System.exit(0);
          }
        }else{
          count = 0;
        }
      }
      System.out.println("No");
      System.exit(0);
    }else{
      System.out.println("Yes");
    }
  }
}
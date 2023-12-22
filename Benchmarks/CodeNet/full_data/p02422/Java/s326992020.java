import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String str = sc.next();
    int q = sc.nextInt();

    for(int i = 0; i < q; i++){
      String fanc = sc.next();
      int a = sc.nextInt();
      int b = sc.nextInt();

      if(fanc.equals("print")){
        System.out.println(str.substring(a, b + 1));
      } else if(fanc.equals("reverse")){
        String rev = "";
        for(int j = b; j >= a; j--){
          rev += str.substring(j, j + 1);
        }
        str = str.substring(0, a) + rev + str.substring(b + 1);
      } else if(fanc.equals("replace")){
        String p = sc.next();

        str = str.substring(0, a) + p + str.substring(b + 1);
      }
    }

  }
}


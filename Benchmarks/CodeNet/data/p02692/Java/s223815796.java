import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    boolean flg = true;
    String str;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++){
      str = sc.next();
      if ("AB".equals(str)) {
        if(a <= b){
          a++;
          b--;
          sb.append("A").append("\n");
        } else {
          a--;
          b++;
          sb.append("B").append("\n");
        }
      } else if ("AC".equals(str)){
        if(a <= c){
          a++;
          c--;
          sb.append("A").append("\n");
        } else {
          a--;
          c++;
          sb.append("C").append("\n");
        }
      } else {
        if(b <= c){
          b++;
          c--;
          sb.append("B").append("\n");
        } else {
          b--;
          c++;
          sb.append("C").append("\n");
        }
      }

      if (a < 0 || b < 0 || c < 0){
        flg = false;
        break;
      }
    }

    if(flg == true){
      System.out.println("Yes");
      System.out.println(sb.toString());
    }else{
      System.out.println("No");
    }
    }
}

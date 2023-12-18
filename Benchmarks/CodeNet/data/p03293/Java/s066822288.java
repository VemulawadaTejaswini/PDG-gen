import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String strS[] = sc.next().split("");
    String strT[] = sc.next().split("");
    for (int i=strS.length-1; i >= 0 ; i--){
        String tmp = strS[i];
        strS[i] = strS[strS.length-1-i];
        strS[strS.length-1-i] = tmp;
        if(Arrays.equals(strS,strT)){
            System.out.println("YES");
            return;
        }
    }
    System.out.println("No");
  }
}
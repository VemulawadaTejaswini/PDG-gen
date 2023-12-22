import java.util*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String[] aa = new String[a.length()];
    String[] bb = new String[b.length()];
    int ans = 0;
    for(int i = 0; i < a.length(); i++){
      if (aa[i] != bb[i]) ans++;
    }
    System.out.println(ans == 1 ? "No" : "Yes");
  }
}
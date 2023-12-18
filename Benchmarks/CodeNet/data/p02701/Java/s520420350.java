import java.util.Scanner;
import java.util.HashSet;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    HashSet<String> set = new HashSet<>();
    int t = scan.nextInt();
    int ans = 0;
    boolean b = true;
    for(int i = 0; i < t; i++){
        String s = scan.next();
        if(set.contains(s)){
            ans = i;
            b = false;
            break;
        }
        set.add(s);
    }
    if(b) ans = t;
    System.out.println(ans);
  }
}
import java.util.Scanner;
import java.util.HashSet;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    HashSet<String> set = new HashSet<>();
    int t = scan.nextInt();
    int ans = 0;
    for(int i = 0; i < t; i++){
        String s = scan.next();
        if(!set.contains(s)){
            set.add(s);
            ans++;
        }
    }
    System.out.println(ans);
  }
}
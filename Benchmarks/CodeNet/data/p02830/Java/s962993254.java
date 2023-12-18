import java.util.*;
public class Main {
    
    public static void main(String[] args){
        B();
    }

    public static void A(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(6 - (a + b));
    }

    public static void B(){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String[] s = sc.nextLine().split("\\s+");
    StringBuilder ans = new StringBuilder();
    for(int i = 0; i < n; i++){
        ans.append(s[0].charAt(i));
        ans.append(s[1].charAt(i));

    }

    System.out.print(ans.toString());

    }
}

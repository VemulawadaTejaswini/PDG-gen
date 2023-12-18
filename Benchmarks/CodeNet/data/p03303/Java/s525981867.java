import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String slist[] = s.split("");
        int w =sc.nextInt();
        for(int i = 0; i < s.length(); i+=w){
            System.out.print(slist[i]);
        }
    }
}

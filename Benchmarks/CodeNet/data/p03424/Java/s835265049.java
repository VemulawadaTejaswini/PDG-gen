import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] s = new String[n];
        for(int i = 0; i < n; i++) s[i] = scan.next();
        Arrays.sort(s);
        boolean out = false;
        for(int i = 1; i < n; i++){
            if(s[i].equals(s[i - 1])){
                out = true;
                break;
            }
        }
        System.out.println(out ? "Three" : "Four");
        scan.close();
    }
}
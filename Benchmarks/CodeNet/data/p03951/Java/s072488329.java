import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        int start = n;
        outside : for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                if(s.charAt(i + j) != t.charAt(j)){
                    break;
                }
                if(j == n - i - 1){
                    start = i;
                  	break outside;
                }
            }
        }
        System.out.println(n + start);
    }
}
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String L = scan.next();
        String M = scan.next();
        String N = scan.next();
        if(L.equals(M) && M.equals(N)){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}

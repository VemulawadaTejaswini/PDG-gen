import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        String S = stdIn.next();
        String T = stdIn.next();

        System.out.print(T.concat(S));
    }
}
import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();
        if(s.equals("AAA") || s.equals("BBB")){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if(a.charAt(0)=='H'){
            System.out.print(b);
        }
        else{
            String ans;
            if(b.charAt(0)=='H') ans = "D";
            else ans = "H";
            System.out.println(ans);
        }
    }
}

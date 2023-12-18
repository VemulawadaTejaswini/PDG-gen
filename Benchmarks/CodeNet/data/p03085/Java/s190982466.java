import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = null;

        if(str.equals("A")){
            ans = "T";
        }else if(str.equals("T")){
            ans = "A";
        }else if(str.equals("C")){
            ans = "G";
        }else if(str.equals("G")){
            ans = "C";
        }
        System.out.println(ans);
    }
}
import java.util.*;

class Main{
    static boolean hitachi(String hi){
        if(hi.equals("hi")){
            return true;
            
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int l = str.length();
        int i = 0;
        boolean ans = false;

        while(i+2 <= l){
            String hi = str.substring(i, i+2);
            ans = hitachi(hi);
            if(ans == false) break;
            i = i+2;
        }
        if(l%2!=0) ans = false;
        String answer = "a";
        if(ans == true){
            answer = "Yes";
        }
        else{
            answer = "No";
        }
        System.out.println(answer);
    }
}
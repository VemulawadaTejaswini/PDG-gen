import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        if("aiueo".indexOf(s) >= 0){
            System.out.println("vowel");
        }else{
            System.out.println("consonant");
        }
    }
}

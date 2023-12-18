import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t =sc.next();
        String t1 =t.substring(0,s.length());
        System.out.println(t1);
        if(s.equals(t1)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}





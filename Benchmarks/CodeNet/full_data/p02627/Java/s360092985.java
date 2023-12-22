import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();
        String ss = s.toUpperCase();
        //boolean flag = true;
        
        if(s.equals(ss)){
            System.out.println("A");
        }else{
            System.out.println("a");
        }
    }
}

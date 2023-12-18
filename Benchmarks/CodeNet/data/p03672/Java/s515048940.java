import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        if(s.length() % 2 != 0){
            s = s.substring(0, s.length() - 1);
        }else{
            s = s.substring(0, s.length() - 2);
        }

        while(true){
            if(s.substring(0, s.length() / 2).equals(s.substring(s.length() / 2))){
                System.out.println(s.length());
                return;
            }
            s = s.substring(0, s.length() - 2);
        }

    }
}

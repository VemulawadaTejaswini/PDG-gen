import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s;
        String t;

        do{
            s = sc.nextLine();
            t = sc.nextLine();
        }while((s.length() < 1 || s.length() > 10) && (t.length() < 2 || t.length() > 11));

        String ss = s.substring(0, s.length()-1);
        String ts = t.substring(0, s.length()-1);

        if(ss.equals(ts) && s.length()+1 == t.length()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

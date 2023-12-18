import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String o = scan.next();
        String e = scan.next();
        int min = o.length();
        char a = 'a';
        if(e.length() < min){
            min = e.length();
            a = 'o';
        }else if(e.length() > min){
            a = 'e';
        }
        for(int i = 0; i < min; i++){
            System.out.print(o.charAt(i));
            System.out.print(e.charAt(i));
        }
        if(a == 'o'){
            System.out.print(o.charAt(o.length() - 1));
        }else if(a == 'e'){
            System.out.print(e.charAt(e.length() - 1));
        }
    }
}
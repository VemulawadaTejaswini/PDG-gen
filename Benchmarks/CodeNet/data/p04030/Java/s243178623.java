import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        while(s.contains("B")){
            s = s.replaceAll("^B|[01]B", "");
        }
        System.out.print(s);
    }
}
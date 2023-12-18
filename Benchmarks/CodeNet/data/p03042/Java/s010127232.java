import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // System.out.print(s);
        int os = Integer.parseInt(s.substring(0,2));
        int tf = Integer.parseInt(s.substring(2,4));
        if ((os <= 12 && os > 0) && (tf <= 12 && tf > 0)){
            System.out.print("AMBIGUOUS");
        } else if (os > 12 && os > 0){
            System.out.print("MMYY");
        } else if (tf > 12 && tf > 0){
            System.out.print("AMBIGUOUS");
        } else {
            System.out.print("NA");
        }
    }
}

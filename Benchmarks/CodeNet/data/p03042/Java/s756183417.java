import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        String s = scan.next();
        int a = 0;
        int b = 0;
        int c = 0; // 1:YYMM, 2:MMYY, 3:AMBIGUOUS, 4:NA
        a = Character.getNumericValue(s.charAt(0)) * 10 + Character.getNumericValue(s.charAt(1));
        b = Character.getNumericValue(s.charAt(2)) * 10 + Character.getNumericValue(s.charAt(3));
        if(a == 0 || b == 0){
            c = 4;
        }else if(a > 12 && b > 12){
            c = 4;
        }else if(a > 12){
            c = 1;
        }else if(b > 12){
            c = 2;
        }else{
            c = 3;
        }
        if(c == 1){
            System.out.println("YYMM");
        }else if(c == 2){
            System.out.println("MMYY");
        }else if(c == 3){
            System.out.println("AMBIGUOUS");
        }else{
            System.out.println("NA");
        }
    }
}
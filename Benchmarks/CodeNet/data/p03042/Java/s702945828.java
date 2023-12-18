import java.util.Scanner;

public class Main {
    
    private static boolean isValidMonth (int elem) {
        if (elem >= 1 && elem <= 12) {
            return true;        
        }        
        return false;
    }    

    private static boolean isValidYear (int elem) {
        if (elem >= 0) {
            return true;        
        }        
        return false;
    }    
    
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            int first = Integer.parseInt(s.substring(0,2));
            int second = Integer.parseInt(s.substring(2));
            if ((isValidMonth(first) && isValidYear(second)) && (isValidMonth(second) && isValidYear(first))) {
                System.out.println("AMBIGUOUS");            
            }
            else if ((isValidMonth(first) && isValidYear(second)) && !(isValidMonth(second) && isValidYear(first))) {
                System.out.println("MMYY");            
            }
            else if (!(isValidMonth(first) && isValidYear(second)) && (isValidMonth(second) && isValidYear(first))) {
                System.out.println("YYMM");            
            }
            else {
                System.out.println("NA");    
            }
        }    
    }
}
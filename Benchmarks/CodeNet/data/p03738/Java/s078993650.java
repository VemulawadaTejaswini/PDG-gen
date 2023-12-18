import java.util.*;
import java.lang.*;

public class Main {
    static String addZeros(String number, int digits){
        while(number.length()<digits) number = "0"+number;
        return number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = addZeros(sc.next(),110);
        String B = addZeros(sc.next(),110);

        if(A.compareTo(B)>0)  System.out.println("GREATER");
        if(A.compareTo(B)==0) System.out.println("EQUAL");
        if(A.compareTo(B)<0)  System.out.println("LESS");

    }
}

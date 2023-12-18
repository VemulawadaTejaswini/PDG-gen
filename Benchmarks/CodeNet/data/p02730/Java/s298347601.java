import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder S = new StringBuilder(sc.next());
        StringBuilder R = new StringBuilder(S);
        int opt = 0;
        if(S.equals(R.reverse()))opt++;
        StringBuilder s = new StringBuilder(S.substring(0,(S.length()-1)/2));
        R = new StringBuilder(s);
        if(s.equals(R.reverse()))opt++;
        s = new StringBuilder(S.substring((S.length()+3)/2));
        R = new StringBuilder(s);
        if(s.equals(R.reverse()))opt++;
        if(opt==3) System.out.println("Yes");
        else System.out.println("No");
    }
}
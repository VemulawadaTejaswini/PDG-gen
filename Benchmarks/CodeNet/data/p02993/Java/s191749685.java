import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean b = true;
        for (int i=0;i<3;i++)if (s.charAt(i)==s.charAt(i+1))b=false;
        if (b)System.out.println("Good");
        else System.out.println("Bad");
    }
}

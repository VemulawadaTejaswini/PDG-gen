import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char[] c = line.toCharArray();
        boolean a =true ;
        for(int i = 0; i < line.length() - 1; i++){
            if(c[i] == c[i + 1])
            a = false;
        }
        if(a)
        System.out.println("Good");
        else
        System.out.println("Bad");
    }
}

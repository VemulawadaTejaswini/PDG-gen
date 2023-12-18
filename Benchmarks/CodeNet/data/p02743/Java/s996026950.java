import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean ebishu = true;
        sc.close();
        if(c >= a - b){
            if((c - a - b) * (c - a - b) - 4 * a * b > 0) ebishu = false;
        }
        if(ebishu){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
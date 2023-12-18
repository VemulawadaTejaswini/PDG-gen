import java.util.*;
public class Main {
    public static void main(final String[] args){
        final Scanner sc = new Scanner(System.in);
        
        final int n = sc.nextInt();
        boolean res = false;
        ArrayList<Integer> number = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            number.add(sc.nextInt());
        }
        for (int i = 0; i < n - 1; i++) {
            if(number.get(i) == number.get(i + 1)){
                System.out.println("YES");
                res = true;
                break;
            }

        }
        if(!res)
            System.out.println("YES");
        sc.close();
    }
}
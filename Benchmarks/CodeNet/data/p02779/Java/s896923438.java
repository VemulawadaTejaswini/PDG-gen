import java.util.*;
public class Main {
    public static void main(final String[] args){
        final Scanner sc = new Scanner(System.in);
        
        final int n = sc.nextInt();

        ArrayList<Integer> number = new ArrayList<Integer>();
        boolean res = false;
        int num;
        point:for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            if(number.indexOf(num) != -1){
                res = true;
                System.out.println("NO");
                break point;
            }
            number.add(num);
        }
        if(!res)
            System.out.println("YES");
        sc.close();
    }
}
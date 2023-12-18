import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        // int j = sc.nextInt();
        int num = 0;
        boolean is = false;
        while(i / 9 > 1) {
            i = i/9;
            is = true;
        }
        if(is)num += 1;
        
        is = false;
        while(i / 6 > 1) {
            i = i/6;
            is = true;
        }
        if(is)num += 1;
        num += i;

        System.out.print(num);
        // if ( i < 1000 ) {
        //     System.out.print("ABC");
        // } else {
        //     System.out.print("ABD");
        // }
    }
}

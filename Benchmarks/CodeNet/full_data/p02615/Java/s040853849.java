import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList a = new ArrayList();
        long ans = 0;
        for(int i = 0;i<n;i++){
            a.add(sc.nextLong());
        }
        Collections.sort(a);
        Collections.reverse(a);
        if(n ==2){
            System.out.println(a.get(0));
            System.exit(0);
        }
        if(n %2 ==0 ){
            ans += (long) a.get(0);
            for(int i = 0;i<(n-2)/2;i++){
                ans += (long) a.get(i+1)*2;
            }
            System.out.println(ans);
            System.exit(0);
        }else {
            ans += (long) a.get(0);
            for(int i = 0;i<(n-3)/2;i++){
                ans += (long) a.get(i+1) *2;
            }
            ans += (long)a.get((n-1)/2);
            System.out.println(ans);
            System.exit(0);
        }




    }


}

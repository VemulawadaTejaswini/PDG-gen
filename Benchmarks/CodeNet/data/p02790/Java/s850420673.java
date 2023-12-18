import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String ns = Integer.toString(n);
        String ms = Integer.toString(m);
        //int a[] = new int[n];
        //int b[] = new int[n];
        String str1 = "";
        String str2 = "";
        String ans = "";
        for(int i = 0; i < m; i++){
            str1 = str1 + ns;
        }
        for(int i = 0; i < n; i++){
            str2 = str2 + ms;
        }
        if((str2.compareTo(str1)) == 1){
            ans = str1;
        }else{
            ans = str2;
        }
        System.out.println(ans);
    }
}
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    private static void nCombination3(int c) {
        int count = c;
        int num = 0;
        for (int i = 0; i < count - 2; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                for (int k = j + 1; k < count; k++) {
                    num++;
                }
            }
        }
    }



    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int ans = 0;
        for(int i=0;i<S.length();i++){
            for(int j=i+1;j<=S.length();j++){
                String s= S.substring(i,j);
                if(Long.valueOf(s)%2019==0){
                    //System.out.println(s);
                    ans++;
                }
            }

        }
        System.out.println(ans);


    }
}

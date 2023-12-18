import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;

public class Main {

    static final int modnum = 1000000000 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String L = sc.nextLine();
        long ans = 1;
        for (int index = 0; index < L.length();index++) {
            if(L.charAt(index)=='1'){
                ans*=3;
                ans%=modnum;
            }else{
                ans+=modnum-1;
                ans%=modnum;
                ans*=2;
                ans+=1;
                ans%=modnum;
            }
        }
        System.out.println(ans);
    }
}
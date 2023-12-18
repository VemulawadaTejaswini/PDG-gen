
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        int cnt = 0;
        while(n>0){
            cnt++;
            n--;
            m-=2;
        }
        while(m>3){
            cnt++;
            m-=4;
        }
        System.out.println(cnt);
    }
}
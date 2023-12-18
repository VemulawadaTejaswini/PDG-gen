import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Integer[] a = new Integer[N];
        int alice = 0;
        int bob = 0;
        for(int i = 0; i < N; i++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a, Comparator.reverseOrder());
        for(int i = 0; i < N; i++){
            if(i%2==0){
                alice += a[i];
            }else{
                bob += a[i];
            }
        }
        System.out.println(alice-bob);
        in.close();
    }
}

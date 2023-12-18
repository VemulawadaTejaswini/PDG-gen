
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = 1;
        for (int i = 1;i <= n;++i){
            if(m % i == 0)s = i;
        }
        System.out.println(s);
    }




}



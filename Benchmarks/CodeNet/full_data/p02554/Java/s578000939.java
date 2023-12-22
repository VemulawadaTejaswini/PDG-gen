import java.io.*;
import java.util.*;

//包除原理

public class Main {
    static long div=1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        //長さnの配列の種類 10^ｎ通り
        //0と9両方が含まれない　8^n通り
        //0か9の一方が　〃　　　(9^n)*2-8^n通り
        System.out.println((pow(10, n)-pow(9, n)*2+pow(8, n))%div);
    }

    public static long pow(long a,long b) {
        long re=1;
        for (int i = 0; i < b; i++)  re=(re*a)%div;
        return re;
    }
}



import javax.management.StringValueExp;
import java.lang.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;

public class Codeforces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[6];
        for (int i=0;i<6;i++)
            n[i] = sc.nextInt();

        int k=n[5];
        boolean check = false;
        for (int i=4;i>0;i--)
        {
            for (int j=i-1;j>=0;j--)
                if (n[i]-n[j]>=k){
                    check=true;
                    break;
                }
            if (check)
                break;
        }
        if (check)
            System.out.println(":(");
        else System.out.println("Yay!");
    }
}



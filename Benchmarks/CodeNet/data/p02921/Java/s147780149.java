
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i  = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
         **/
        String s1 =sc.nextLine();
        String s2 =sc.nextLine();
        long res= 0;
        for(int i =  0;i< s2.length();i++)
        {
            if(s2.charAt(i) == s1.charAt(i))
                res++;
        }
        System.out.println(res);

    }
}
package AtCoder139;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i  = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
         **/
        String s1 =sc.nextLine();
        String s2 =sc.nextLine();
        long res= 0;
        for(int i =  0;i< s2.length();i++)
        {
            if(s2.charAt(i) == s1.charAt(i))
                res++;
        }
        System.out.println(res);

    }
}

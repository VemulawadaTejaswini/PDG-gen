
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.lang.*;

import static java.lang.Character.isUpperCase;

public class Main {
    public static Scanner key = new Scanner(System.in);
    public static void solveJuice()
    {
        int n = key.nextInt();
        int k = key.nextInt();
        int[] f = new int[n];
        for(int i = 0;i <= n-1;i++)
            f[i] = key.nextInt();
        Arrays.sort(f,0,n);
        int sum = 0;
        for(int j =0;j <= k-1;j++)
        {
            sum += f[j];
        }
        System.out.println(sum);
    }

    /*public static void redScarf()
    {

    }
    */
    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    public static void solveC()
    {
        long N = key.nextLong();
        String ans = "";
        while(N > 1)
        {
            if(N%26 == 0)
                ans += 'z';
            else
            {
                char c = (char)(96 + N%26);
                ans += c;
            }

            N /= 26;
        }
        ans = reverseString(ans);
        System.out.println(ans);
    }
    public static void replacing()
    {
        int N = key.nextInt();
        int[] A = new int[N];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        long sum = 0;
        for(int i = 0;i <= N - 1;i++) {
            A[i] = key.nextInt();
            map.put(A[i],map.getOrDefault(A[i],0) + 1);
            sum += A[i];
        }
        int q = key.nextInt();
        while(q > 0)
        {
            q--;
            int a = key.nextInt();
            int b = key.nextInt();
            if(map.containsKey(a))
            {
                sum += (b-a)*map.get(a);
                int c = map.get(a);
                map.remove(a);
                map.put(b,map.getOrDefault(b,0)+c);
                System.out.println(sum);
            }
            else
                System.out.println(sum);
        }
    }

    public static void main(String[] args)
    {
       /* solveJuice();*/
        //replacing();
        solveC();
    }
}

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] lucaNum = new long[N+1];
        lucaNum[0]=2;
        lucaNum[1]=1;
        for(int n=2;n<=N;n++){
        	lucaNum[n]=lucaNum[n-1]+lucaNum[n-2];
        }
        System.out.println(lucaNum[N]);
    }
}
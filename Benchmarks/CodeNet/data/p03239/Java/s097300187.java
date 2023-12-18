import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int cost = 1000000;
        for(int n=0;n<N;n++){
        	int c = sc.nextInt();
        	int t = sc.nextInt();
        	if(t<=T) cost = Math.min(cost,c);
        }
        if(cost>10000) System.out.println("TLE");
        else System.out.println(cost);
    }
}
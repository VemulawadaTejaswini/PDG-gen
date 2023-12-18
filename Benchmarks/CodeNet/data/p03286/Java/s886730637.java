import java.util.*;
import java.io.*;

public class Main {
    public static String baseM2(int N){
        if(N==0) return "";
        if(N%2==0) return baseM2(-N/2)+"0";
        else return baseM2(-(N-1)/2)+"1";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N==0) System.out.println("0");
        else System.out.println(baseM2(N));
    }
}
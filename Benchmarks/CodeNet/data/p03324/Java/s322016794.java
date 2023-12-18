import java.util.*;
import java.io.*;

public class Main {
	public static String repeat(String one, int num){
		if (num<=0) return "";
		else return one + repeat(one,num-1);
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        
        if(N==100) N++;
        System.out.println(N + repeat("00",D));
    }
}
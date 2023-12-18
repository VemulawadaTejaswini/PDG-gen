import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        for(int n=0;n<N;n++) array[n]=sc.nextInt();
        
        int total = 1;
        int odd  =  1;
        for(int n=0;n<N;n++){
        	total *= 3;
        	if(array[n]%2==0) odd*=2;
        }
        
        System.out.println(total-odd);
    }
}
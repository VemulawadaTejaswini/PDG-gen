import java.util.Scanner;
import java.lang.Math;
import java.lang.StringBuilder;
import java.util.regex.Pattern;
import java.util.Arrays;


    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] A=new int[n];
            
        
            for(int i=0; i<n; i++){
                A[i] = sc.nextInt();
            }
            
            Arrays.sort(A);
            
            
            int min = 100000000000;
            for(int h=0; h<n-k+1; h++){
            min = Math.min(min,A[h+k-1] - A[h]);
            }
            System.out.println(min);
        }
    }

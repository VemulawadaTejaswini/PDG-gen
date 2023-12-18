import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        int gcd = 1;
        for (int i = 0; i < N; i++) {
            int newGcd = gcd(removeElement(A, i));
            if (newGcd > gcd) {
                gcd = newGcd;
            }
        }
        System.out.print(gcd);
    }
    
    public static int[] removeElement(int[] arr, int index) {
        int l = arr.length - 1;
        int r[] = new int[l];
        for (int i = 0; i < l; i++) {
            if(i >= index) {
                r[i] = arr[i+1];
            } else {
                r[i] =  arr[i];
            }
        }
        return r;
    }
    
    public static int gcd(int arr[]) {
        int l = arr.length;
        int result = arr[0]; 
        for (int i = 1; i < l; i++) 
            result = getGCD(arr[i], result); 
  
        return result; 
    }
    
    public static int getGCD(int a, int b) {
     if (b == 0) { return a; }
     else { return getGCD(b, a%b); }
    }
}

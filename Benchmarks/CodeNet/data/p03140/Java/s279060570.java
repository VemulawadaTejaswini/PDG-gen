import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String A[] = scanner.next().split("");
        String B[] = scanner.next().split("");
        String C[] = scanner.next().split("");
        
        int l = 0;
        int m = 0;
        for(int i = 0;i<N;i++){
            if(A[i].equals(B[i]) && A[i].equals(C[i]) && C[i].equals(B[i])){
                
            }
            else if((A[i].equals(B[i])!= true) && (B[i].equals(C[i])!= true)&& (C[i].equals(A[i])!= true)){
                l = l+2;
            }
            else{
                l++;
            }
        }

        System.out.println(l);
        
        
        scanner.close();

    }
    public static int POWER(int a,int b){
        int p = 1;
        for(int i = 1;i<=b;i++){
            p = a*p;
        }
        return p;
    }
    public static int min(int a,int b){
        if(a>=b) return b;
        else return a;
      }
}
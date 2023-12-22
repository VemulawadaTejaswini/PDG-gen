import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
            int n =sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i] =sc.nextInt();
            }

            for(int i=0;i<n;i++){
                System.out.printf("%d", a[n-i-1]);
                if(i != n-1){
                    System.out.printf(" ");
                }else{
                    System.out.println();
                }
            }
        
    }
    
    
}

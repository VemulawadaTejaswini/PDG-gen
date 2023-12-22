import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int n = sc.nextInt();
        int a[] = new int[n];
        while(i<n){
        a[i] = sc.nextInt();
        i++;
        }
        while(i-1>=0){
             if (i==1){
        System.out.print(a[i-1]);
        break;
        }
        System.out.print(a[i-1]+" ");
         
        i--;
        }
        System.out.println();
}
}


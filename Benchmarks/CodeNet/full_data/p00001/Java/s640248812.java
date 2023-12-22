import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        
        for(int i = 0; i<10; i++)
            a[i] = s.nextInt();
        
        int max1 = a[0];
        int r1 = 0;
        int max2 = a[0];
        int r2 = 0;
        int max3 = a[0];

        
        for(int j = 1; j<10; j++){
            if(max1 < a[j]){
                max1 = a[j];
                r1 = j;
            }
        }
        
        a[r1] = 0;
        
        for(int j = 1; j<10; j++){
            if(max2 < a[j]){
                max2 = a[j];
                r2 = j;
            }
        }
        
        a[r2] = 0; 
        
        for(int j = 1; j<10; j++){
            if(max3 < a[j]){
                max3 = a[j];
            }
        }
        
        System.out.print(max1 + "\n" + max2 + "\n" + max3);
        
    }
}
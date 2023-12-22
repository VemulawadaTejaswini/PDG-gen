
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int a[] = new int[1000000];
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        shellSort(a, n);
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
    
    public static void shellSort(int a[], int n) {
        List<Integer> width = new ArrayList<>();
        
        int i = 0;
        
        //shellSort????????¨??????????????????????????????(A i+1 = 3A * i + 1)
        while(3 * i + 1 < n) {
            width.add(3 * i + 1);
            i++;
        }
        
        //count?????\???????????°???????????????
        int count = 0;
        int m = width.size();
        for(int j = 0; j < m; j++) {
         //width???????°?????????????????¢??????????????????§?????????????????¨???
         //ex. width = {1, 4, 13, ....} <- ???????????????
         count += insertionSort(a, n, width.get((m - 1) - j));   
        }
        
        System.out.println(m);
        for(int k = 0; k < m; k++) {
            if(k > 0) {
               System.out.print(" ");
            }
            System.out.print(width.get(k));
        }
        System.out.println();
        System.out.println(count);
    }
    
    public static int insertionSort(int a[], int n, int width) {
        int count = 0;
        for(int i = width; i < n; i++) {
            int v = a[i];
            int j = i - width;
            while(j >= 0 && a[j] > v) {
                int tmp = a[j + width];
                a[j + width]= a[j];
                a[j] = tmp;
                
                j -= width;
                count++;
            }
        }
        return count;
    }
    
}
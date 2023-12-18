import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        
        int max1 = max(a);
        int max2 = sec_max(a);
        for(int i = 0; i < n; i++){
            if(max1 == i)
                System.out.println(a[max2]);
            else
                System.out.println(a[max1]);
        }
        sc.close();  
    }

    static int max(int[] a){
        int max = a[0];
        int index = 0;
        for(int i = 1; i < a.length; i++){
            if(a[i] > max) {
                max = a[i];
                index = i;
            }
        }
        return index;
    }

    static int sec_max(int[] a){
        int max1 = a[0];
        int max2 = a[0];
        int index1 = 0;
        int index2 = 0;
        for(int i = 1; i < a.length; i++){
            if(a[i] > max1) {
                max2 = max1;
                index2 = index1;
                max1 = a[i];
                index1 = i;
            } else if(a[i] > max2){
                max2 = a[i];
                index2 = i;
            }
        }
        return index2;
    }
}
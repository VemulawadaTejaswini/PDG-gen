import java.util.*;
 
public class  Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int a[] = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        BubbleSort(a);
    }
    

    static void BubbleSort(int[] a){
    int count = 0;
    for (int i = 0; i <  a.length- 1; i++) {
        for (int j = a.length - 1; j > i; j--) {
            if (a[j - 1] > a[j]) {     
                int tmp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = tmp;
                count++;
            }
        }
    }
    System.out.println(Arrays.toString(a) .replaceAll("[\\[\\],]", ""));

        System.out.println(count);
}
    
}



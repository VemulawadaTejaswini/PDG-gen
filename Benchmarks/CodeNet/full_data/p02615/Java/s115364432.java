import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ia = new int[n];
        for(int i = 0; i < n; i++){
            ia[i] = sc.nextInt();
        }
        upheap(ia);
        heapsort(ia);
        int sum = 0;
        for(int i = 1; i < n; i++){
            sum += ia[i / 2];
        }
        System.out.println(sum);
        sc.close();
    }

    static void upheap(int[] a){
        for(int i = a.length / 2; i >= 0; i--){
            heapfy(a, i, a.length - 1);
        }
    }

    static void heapsort(int[] a){
        int len = a.length;
        for(int i = len - 1; i >= 0; i--){
            int tmp;
            tmp = a[0];
            a[0] = a[i];
            a[i] = tmp;
            heapfy(a, 0, i-1);
        }
    }

    static void heapfy(int[] a, int n, int l){
        int tmp;
        if(2 * n + 2 <= l){
            if(a[2*n+1] <= a[2*n+2]){
                if(a[n] <= a[2*n+1]){
                    return;
                } else {
                    tmp = a[2*n+1];
                    a[2*n+1] = a[n];
                    a[n] = tmp;
                    heapfy(a, 2*n+1, l);
                }
            } else {
                if(a[n] <= a[2*n+2]){
                    return;
                } else {
                    tmp = a[2*n+2];
                    a[2*n+2] = a[n];
                    a[n] = tmp;
                    heapfy(a, 2*n+2, l);
                }
            }
        } else if(2 * n + 1 <= l){
            if(a[n] <= a[2*n+1]){
                return;
            } else {
                tmp = a[2*n+1];
                a[2*n+1] = a[n];
                a[n] = tmp;
                heapfy(a, 2*n+1, l);
            }
        } else {
            return;
        }
    }
}
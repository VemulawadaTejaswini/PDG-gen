import java.util.Scanner;

public class Main {
    public static void sort(int array[], int array2[], int left, int right){
        if(left <= right){
            int p = array[(left + right) >>> 1];
            int l = left;
            int r = right;
            while(l <= r){
                while (array[l] < p){
                    l++;
                }
                while (array[r] > p){
                    r--;
                }
                if (l <= r){
                    int tmp = array[l];
                    array[l] = array[r];
                    array[r] = tmp;
                    
                    int tmp2 = array2[l];
                    array2[l] = array2[r];
                    array2[r] = tmp2;
                    l++;
                    r--;
                }
            }
            Main.sort(array, array2, left, r);
            Main.sort(array, array2, l, right);
        }
    }
    
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        
        for(int i = 0; i < n; i++){
            a[i] = stdIn.nextInt();
            b[i] = stdIn.nextInt();
        }
        
        Main.sort(b, a, 0, b.length - 1);
        
        int sagyo = 0;
        int sime = 0;
        boolean flag = true;
        
        for(int i = 0; i < n; i++) {
            sagyo += a[i];
            sime = b[i];
            
            if(sagyo > sime){
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int index = 0 ;
        int[] arry = new int[100];
        while (sc.hasNextInt()){
            if(n == 0){
                n = sc.nextInt();
            }else{
                arry[index] = sc.nextInt();
                index ++;
            }
            if(index == (n - 1)){
                break;
            }
        }
        trace(arry,n);
        sort(arry,n);
    }


    private static void sort(int[] arry,int n){
        for(int i = 1; i < n; i++){
            /**
             * 每个数与前面的值比较 大的交换
             * 每个值都要与前n-1个值比较
             * 算法复杂度O(N) = N^2/2 - N/2 ----> O(n^2)
             */

            int temp = arry[i];
            int j = i - 1;
            while(j >= 0 && arry[j] > temp){
                arry[j+1] = arry[j];
                j-- ;
            }
            arry[j + 1] = temp;
            trace(arry,n);
        }
    }

    private static void trace(int[] arry,int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < n; i++){
            sb.append(arry[i]);
            if(i < n - 1){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}


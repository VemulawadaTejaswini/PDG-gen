import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void nibutan(int array[], int length, int num){
        int pos = -1;
        int lower = 0; //最小index番号
        int upper = length - 1; // 最大index番号
        while (lower <= upper) {
            int mid = (lower + upper) / 2;
            if (array[mid] == num) {
                pos = mid;
                break;
            } else if (array[mid] < num) {
                lower = mid + 1;
            } else {
                upper = mid - 1;
            }
        }
        
        if(pos != -1){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
    
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        //int x = stdIn.nextInt();
        int a[] = new int[n];
        //String s = stdIn.next();
        //String t = stdIn.next();
        //char c[] = s.toCharArray();
        //int sum = 0;
        //boolean flag = true;
        int count = 1;
        a[0] = stdIn.nextInt();
        for(int i = 1; i < n; i++){ //重複しているところは配列に入れない
            int num = stdIn.nextInt();
            if(a[count - 1] != num){
                a[count++] = num;
            }
        }
        
        int q = stdIn.nextInt();
        
        for(int i = 0; i < q; i++){
            int k = stdIn.nextInt();
            nibutan(a, count, k); //左から配列、配列の長さ、探索する数字
        }
        
        //System.out.println();
        //System.out.print();
        stdIn.close();
    }
}




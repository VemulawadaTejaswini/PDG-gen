import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        for(int i = 0; i < N;i++ ){
            a[i] = Integer.parseInt(sc.next());
        }
        int count = 0;
        int max = 0;
        for(int i = 0; i < N-1;i++ ){
            if(a[i+1] <= a[i]){
                count+=1;
            }else{
                count=0;
            }
            if(max < count){
                max = count;
            }
        }
        System.out.println(max);
    }
}
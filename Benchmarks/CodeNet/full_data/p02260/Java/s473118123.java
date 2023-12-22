import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        String[] t = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(t[i]);
        }

        selectionSort(a, n);
    }

    public static void selectionSort(int[] a, int n){
        int minj, temp = 0, count = 0;
        for(int i = 0; i < n; i++){
            minj = i;
            for(int j = i; j < n; j++){
                if(a[j] < a[minj]){
                    minj = j;
                }
            }
            if(i != minj)count++;
            temp = a[i];
            a[i] = a[minj];
            a[minj] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(i != 0)sb.append(" ");
            sb.append(a[i]);
        }
        sb.append("\n").append(count);
        System.out.println(sb);
    }

}
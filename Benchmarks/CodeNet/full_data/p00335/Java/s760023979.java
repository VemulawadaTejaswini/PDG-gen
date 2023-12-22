import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int panc[] = new int[n];
        for (int i = 0;i < n;++i){
            panc[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0;i < n;++i){
            while (panc[i] > 0){
                if(i == 0&&panc[i + 1] <= 0){
                    --panc[i];
                    ++c;
                }
                else if(i + 1 == n){
                    --panc[i];
                    ++c;
                }
                else{
                    --panc[i];
                    --panc[i + 1];
                    c += 2;
                }
            }
        }
        System.out.println(c);
    }



}


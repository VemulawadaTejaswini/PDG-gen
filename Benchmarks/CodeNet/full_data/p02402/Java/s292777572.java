import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws IOException{
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int num[] = new int[n];
         int total = 0;
       for(int i = 0; i < n; i++){
           int a = sc.nextInt();
           num[i] = a;
           total += num[i];
     }
 Arrays.sort(num);
 int min = num[0];
 int max = num[n - 1];
        System.out.println(min+" "+max+" "+total);
}
}
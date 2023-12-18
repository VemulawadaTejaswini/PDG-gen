import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer n = sc.nextInt();
        Integer[] a = new Integer[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int count = 0;
        for(int i = 0; i < n; i++){
            if(a[0] >= a[i]){
                count++;
            }
        }

        System.out.println(count);
    }
}
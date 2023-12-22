import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int j = sc.nextInt();//当前数
            if (i == 0) {
                min = j;
            }else{
                max=Math.max(max,j-min);
                min=Math.min(min,j);
            }
        }
        System.out.println(max);
    }}

import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 1000;
        int[] s = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(a % 10 != 0){
                min = Math.min(min, a);
            }
            sum += a;
        }
        if(sum % 10 == 0){
            if(min < 1000){
                System.out.println(sum-min);
            }else {
                System.out.println(0);
            }
        }else {
            System.out.println(sum);
        }
    }
}
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int ans;

        if(num1 == num2){
            ans = num1 * 2;
        }else if(num1 > num2){
            ans = num1 + (num1 - 1);
        }else{
            ans = num2 + (num2 - 1);
        }

        System.out.println(ans);
    }
}
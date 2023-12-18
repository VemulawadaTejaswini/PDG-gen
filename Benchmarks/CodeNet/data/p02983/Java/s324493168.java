import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();

        int ans = 2020;
        for(int i = left; i < Math.min(left+2019, right); i++){
            for(int j = right; j > Math.max(right-2019, left); j--){
                int num = i * j % 2019;
                ans = Math.min(ans, num);
            }
        }
        System.out.println(ans);

    }

}
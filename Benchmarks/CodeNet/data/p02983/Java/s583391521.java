import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        right -= left;
        left = left % 2019;
        right += left;

        int ans = 2020;
        int rightLimit = Math.min(left+2018, right);
        for(int i = left; i <= rightLimit; i++){
            for(int j = i+1; j <= rightLimit; j++){
                int num = (i * j) % 2019;
                ans = Math.min(ans, num);
            }
        }
        System.out.println(ans);
    }
}
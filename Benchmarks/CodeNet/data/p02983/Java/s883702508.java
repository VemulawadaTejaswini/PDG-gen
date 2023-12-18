import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();

        if(left / 2019 != right / 2019){
            System.out.println(0);
            return;
        }
        int ans = 2020;
        for(int i = 0; i <= left % 2019; i++){
            for(int j = i; j <= right % 2019; j++){
                int num = i * j % 2019;
                if(num < ans)ans = num;
            }
        }
        System.out.println(ans);

    }

}
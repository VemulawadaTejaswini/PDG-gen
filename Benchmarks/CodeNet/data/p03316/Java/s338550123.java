import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();//S(N)
        int lon = 0;
        int sum = 0;  //numの各位の和

        while(num > 0){
            sum += num%10;
            num /= 10;
        }

        if(num%sum == 0){
            System.out.println("Yes");
        }else System.out.println("No");
    }
}
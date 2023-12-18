import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();

    //     int[] number = new int[n];
    //     for(int i = 1;i<=n;i++){
    //         if(d == 0){
    //             number[i-1] = i;
    //         }else{
    //             number[i-1] =i*(int)Math.pow(100,d);
    //         }
    //     }
    //     System.out.println(number[n-1]);
        int answer = 0;
        for(int i = 1;i<=n;i++){
                answer = i*(int)Math.pow(100,d);
        }
        System.out.println(answer);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();

        int num = 7;
        int cnt = 1;


        if(k % 2 == 0 ) {System.out.println(-1); return;}
        else{
            for (int i = 0; i< k; i++){
                
                if(num % k == 0){
                    System.out.println(cnt);
                    return;
                }else{
                    num = (num*10 + 7 ) % k; //这一步很关键，判断余数是不是所给数倍数即可
                    cnt++;
                }
            }
            System.out.println(-1);
            

        }
    }
    
}
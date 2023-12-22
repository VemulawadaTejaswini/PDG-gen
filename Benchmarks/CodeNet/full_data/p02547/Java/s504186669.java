import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        boolean flg = false;
        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == b){
                count++;
                if(count >= 3){
                    flg = true;
                    break;
                }
            }else{
                count = 0;
            } 
        } 
        if(flg == true){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}


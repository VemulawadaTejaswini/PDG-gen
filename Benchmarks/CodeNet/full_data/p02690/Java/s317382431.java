import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int ansA = 0;
        int ansB = 0;

        int breakPointCheck = 0;

        boolean isBreak = false;
        for(int a = -118;a <= 119;a++){//aを-118から119まで回す
            for(int b = -119;b < 118;b++){//bを-119から118まで回す
                if((a^5 - b^5) == x){//答えが見つかれば代入
                    ansA = a;
                    ansB = b;
                    isBreak = true;//a側のfor文を抜けるためのチェック
                    break;
                }
            }
            if(isBreak){
            break;
            }
        }
        System.out.println(ansA + " " + ansB);
    }
}

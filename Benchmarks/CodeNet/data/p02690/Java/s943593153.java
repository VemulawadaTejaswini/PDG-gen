import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int ansA = 0;
        int ansB = 0;

        boolean isBreak = false;

        for(int a = 0;a <= 100000;a++){
            for(int b = 0;b < 100000;b++){
                if(fifthExponentiation(a) - fifthExponentiation(b) == x){
                    ansA = a;
                    ansB = b;
                    isBreak = true;
                    break;
                }
            }
            if(isBreak){
                break;
            }
        }
        System.out.println(ansA + " " + ansB);
    }

    static int fifthExponentiation(int num){
        int answer = 1;
        for(int i = 1; i <= 5; i++){
            answer *= num;
        }
        return answer;
    }
}

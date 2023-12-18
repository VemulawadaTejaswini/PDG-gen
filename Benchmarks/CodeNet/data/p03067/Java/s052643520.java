import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = null;
        int a = 0;
        int b = 0;
        int c = 0;

        System.out.println("三つの異なる整数を入力してください");

        do{
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if(a == b || a == c || b == c){
                System.out.println("同じ数字があります");
                System.out.println("異なる数字を入力してください");
            }
        }while(a == b || a == c || b == c);


        if(a < b) {
            for(int i = a; i <= b; i++){
                if(i == c) { result = "Yes"; break; }
                else if(i != c){ result = "No"; }
            }
        }

        if(a > b){
            for(int i = a; i >= b; i--){
                if(i == c) { result = "Yes"; break; }
                else{ result = "No"; }
            }
        }

        System.out.println(result);
    }
}
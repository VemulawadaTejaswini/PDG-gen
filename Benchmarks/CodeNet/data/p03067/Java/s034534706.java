import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = null;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

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
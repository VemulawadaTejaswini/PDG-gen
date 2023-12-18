import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int answer;
        
        if(n <= 9){
            answer = n;
        }else if(n <= 99){
            answer = 9;
        }else if(n <= 999){
            answer = 9 + (n - 99);
        }else if(n <= 9999){
            answer = 909;
        }else if(n <= 99999){
            answer = 909 + (n - 9999);
        }else{
            answer = 90909;
        }
        System.out.println(answer);
    }
}
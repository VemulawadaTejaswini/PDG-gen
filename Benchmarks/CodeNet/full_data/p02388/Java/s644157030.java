import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(power(x,3));
     }
     public static int power(int x,int y) {
            if(y == 1){
                return x;
            }
            int answer = power(x,y-1) * x;
            return answer;
        }
    }


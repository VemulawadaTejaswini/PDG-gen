import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int count = 0;
        for (int i = 2; i < 10; i++) {
            if (N%i == 0) {
                count++;
            }
        }
        
        if (count > 0 || N == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
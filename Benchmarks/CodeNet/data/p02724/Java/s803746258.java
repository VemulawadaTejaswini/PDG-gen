import java.util.Scanner;

class Main{

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        int resultA = x/500 * 1000;
        int resultB = (x%500)/5 * 5;
        int result = resultA + resultB;
        System.out.println(result);
        
    }
}
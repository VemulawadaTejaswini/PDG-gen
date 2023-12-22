import java.util.Scanner;


public class Main {
    static Scanner scanner;
    static int getInt(){
        return Integer.parseInt(scanner.next());
    }
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int a = getInt();
        int b = getInt();
        int c = getInt();
        if(a < b && b < c){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}


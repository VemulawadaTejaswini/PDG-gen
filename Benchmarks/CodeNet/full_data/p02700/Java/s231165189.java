import java.util.Scanner;
 
class Main{
 
    public static void main(String[] args){
 
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();
        while(true){
            c = c - b;
            if(c<=0){
                System.out.println("Yes");
                return;
            }
            a = a -d;
            if(a<=0){
                System.out.println("No");
                return;
            }
        }
    }
 
}
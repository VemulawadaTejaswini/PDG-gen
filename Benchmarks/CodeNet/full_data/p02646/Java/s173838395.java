import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long A = scan.nextInt();
        long V = scan.nextInt();
        long B = scan.nextInt();
        long W = scan.nextInt();
        long T = scan.nextInt();
            if(Math.abs(A-B) <= ((V-W)*T)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
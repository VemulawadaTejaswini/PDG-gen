import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int W = sc.nextInt();
        if(W >= S) {
            System.out.println("unsafe");
        }else if(W < S){
            System.out.println("safe");
        }
    }
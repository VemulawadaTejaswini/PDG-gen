import java.util.Scanner;
class Main {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int x;
       for(int i = 0; i < 10000; i++){
         x = scan.nextInt();
         if(x == 0) {
            break;
         }else{
            System.out.println("Case " + i + ": " + x);
         }
       }
    }
}
import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println(N % 1000 == 0 ? 0:1000-N%1000);
    }
}

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A=scan.nextInt(),B=scan.nextInt();
        if(24 < A+B){
            System.out.println(A+B - 24);
        }else if((A+B) == 24){
        System.out.println(A+B);
        }else{
          System.out.println(A+B);
        }
    }
}
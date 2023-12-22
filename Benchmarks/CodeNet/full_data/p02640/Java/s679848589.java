import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int X = in.nextInt();   // 庭の動物の総数
        int Y = in.nextInt();   // それらの足の総数
        
        if( Y%2 == 1 || 2*X > Y || (Y-(X*2))/2 > X ){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
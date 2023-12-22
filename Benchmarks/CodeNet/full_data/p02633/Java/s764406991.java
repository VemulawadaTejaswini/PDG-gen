import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        sc.close();
        int ans =(360/X);
        if(360%X !=0){
            ans ++;
        }
        System.out.println(ans);
    }
}

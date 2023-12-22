import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int healthA = sc.nextInt();
        int attackB = sc.nextInt();
        int healthC = sc.nextInt();
        int attackD = sc.nextInt();
        
        boolean isTakahashiWin;
        while(true){
            healthC -= attackB;
            if(healthC <= 0){
                isTakahashiWin = true;
                break;
            }
            healthA -= attackD;
            if(healthA <= 0){
                isTakahashiWin = false;
                break;
            }
        }
        System.out.println(isTakahashiWin == true ? "Yes" : "No");
    }
}
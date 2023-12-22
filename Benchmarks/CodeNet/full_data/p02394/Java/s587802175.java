import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner InData = new Scanner(System.in);
    int W = InData.nextInt();
    int H = InData.nextInt();
    int x = InData.nextInt();
    int y = InData.nextInt();
    int r = InData.nextInt();

    int L_X, L_Y, R_W, R_H;
   L_X = r;
   L_Y = r;
   R_W = W - r;
   R_H = H- r;
   
    if(x=L_X || x=R_W || y> L_Y || y< R_H)
       System.out.println("No");
    
   

    if(x>L_X && x<R_W && y> L_Y && y< R_H){
        System.out.println("Yes");
    }
    else
        System.out.println("No");


    }

}
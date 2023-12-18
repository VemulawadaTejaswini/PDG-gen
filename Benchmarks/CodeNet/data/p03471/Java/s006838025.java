import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        int z = Y/1000;
        for(int x = 0;z-5*x >= 0;x++){
            for(int y = 0;z-5*x-10*y >= 0;y++){
                if(z-4*x-9*y == N){
                    System.out.println(y+" "+x+" "+(z-5*x-10*y));
                    return;
                }
            }
        }
        System.out.println(-1+" "+-1+" "+-1);
    }
}
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x != 0 || y != 0){
            for(int i=0;i<x;i++){
                for(int j=0;j<y;j++){
                    System.out.print("#");
                }
                System.out.println();
            }
        }
        System.out.println();
        sc.close();
    }
}

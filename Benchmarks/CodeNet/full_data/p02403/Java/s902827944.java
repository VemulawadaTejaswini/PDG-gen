import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x == 0 && y ==0){
                break;
            }
            for(int k=0;k<x;k++){
               for(int j=0;j<y;j++){
                    System.out.print("#");
                }
               System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}

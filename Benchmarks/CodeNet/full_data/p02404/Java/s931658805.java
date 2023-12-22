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
                if(k == 0 || k == x-1){
               for(int j=0;j<y;j++){
                    System.out.print("#");
                }
               System.out.println();
            }else{
                System.out.print("#");
                for(int l=0;l<y-2;l++){
                    System.out.print(".");
                }
                System.out.print("#\n");
                }
            }
            System.out.println();
        }
            sc.close();
    }
}

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();

        int i, j;

        for(i=1;i<=H;i++){
            for(j=1;j<=W;j++){
                if(i % 2 == j % 2){
                    System.out.print("#");
                }
                else{
                    System.out.print(".");
                }
            }
            System.out.println();
            
        }

        sc.close();

    }
}


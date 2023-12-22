import java.util.Scanner;
public class Main{

    static void PRINT(int x,int y){
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
            	if((i+j)%2==0)System.out.print("#");
            	else System.out.print(".");
            }
            System.out.println("");
        }
        System.out.println("");
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int H = sc.nextInt();
            int W = sc.nextInt();
            if(H==0&&W==0)break;
            else PRINT(H,W);
        }
        sc.close();
    }


}

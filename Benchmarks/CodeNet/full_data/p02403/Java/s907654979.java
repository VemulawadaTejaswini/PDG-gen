import java.util.Scanner;

public class Main{
    
    
    static void PRINT(int x,int y){
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print("#");
            }
            system.out.println("");
        }
    }
    
    
    public static void main(String[] args){
        Scanner sc = new Scnner(System.in);
        while(true){
            int H = sc.nextInt();
            int w = sc.nextInt();
            if(H==0&&W==0)break;
            else PRINT(H,W);
        }
        sc.close();
    }
    
}

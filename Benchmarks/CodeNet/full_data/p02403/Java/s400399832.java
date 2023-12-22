import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int H;
        int W;
        int x;
        int y;
        
        while(true){
            H = sc.nextInt();
            W = sc.nextInt();
            
            if(H==0 && W ==0)break;
            for(x = 0; x < H; x++){
            for(y = 0; y < W; y++){
                System.out.print("#");
            }
            System.out.println("");
                
            }
            System.out.println("");
        }
    }
}


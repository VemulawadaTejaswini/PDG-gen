import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int i, j;
        Scanner sc = new Scanner(System.in);
        
        while(true){
            
            int H = sc.nextInt();        
            int W = sc.nextInt();
            if(H == 0 && W == 0)  break;
            for(i=0; i<H; i++){
                for(j=0; j<W; j++){
                    if(i % 2 == 0){
                        if(j % 2 == 0){
                            System.out.print("#");
                        }else if(j % 2 == 1){
                            System.out.print(".");
                        }
                    }else if(i % 2 == 1){
                        if(j % 2 == 0){
                            System.out.print(".");
                        }else if(j % 2 == 1){
                            System.out.print("#");
                        }
                    }
                }   
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}

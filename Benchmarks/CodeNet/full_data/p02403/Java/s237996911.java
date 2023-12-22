import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);            
        
        for(int i = 0; i < 3000; i ++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            
            if(printJudge(H,W)) {
                for(int height = 0; height < H ; height++) {
                    printRect(W);
                }                
            }else {
                break;
            }
            System.out.print("\n");
        }
    }    

    public static void printRect(int W) {        
	for(int i = 0; i < W; i++) {
		System.out.print("#");                
	}
        System.out.print("\n");    
    }
    
    public static boolean printJudge(int H, int W) {
        if((H == 0 && W == 0) || H < 0 || H > 300 || W < 0 || W > 300) {
            return false;
        }else {
            return true;
        }
    }
    
}
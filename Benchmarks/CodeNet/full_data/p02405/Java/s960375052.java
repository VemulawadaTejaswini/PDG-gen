import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        
        
        for(int x = 1; x < 10000; x++) {
            
            int H = sc.nextInt();
            int W = sc.nextInt();
            
            if(printJudge(H, W)) {
            
                for(int i = 1; i < H + 1; i++) {
                    if((double)i % 2 != 0) {
                        printLine1(W);
                    }else {
                        printLine2(W);
                    }
                }
            }else {
                break;
            }         
        }        
    }
    
    
//    public static void printChessboard(int H, int W) {
//        if(printJudge(H, W)) {
//            if(op.equals("+")) {
//                System.out.println(a + b);
//            }else if(op.equals("-")) {
//                System.out.println(a - b);
//            }else if(op.equals("*")) {
//                System.out.println(a * b);
//            }else if(op.equals("/") && b != 0) {
//                System.out.println(a / b);
//            }else if(op.equals("/") && b == 0) {
//                System.out.println("0??????????????????????????\????????????");
//            }else {
//                System.out.println("??£??????????????\????????????????????????");
//            } 
//        }
//    }

    public static void printLine1(int W) {
        for(int i = 1; i < W + 1; i ++) {
            if((double)i % 2 != 0) {
                System.out.print("#");
            }else {
                System.out.print(".");
            }
        }
        System.out.print("\n");
    }
    
    public static void printLine2(int W) {
        for(int i = 1; i < W + 1; i ++) {
            if((double)i % 2 != 0) {
                System.out.print(".");
            }else {
                System.out.print("#");
            }
        }
        System.out.print("\n");
    }
    
    public static boolean printJudge(int H, int W) {
        if(H < 1 || W < 1 || H > 300 || W > 300) {
            return false;
	}else if(H == 0 && W == 0) {
            return false;
            
        }else return true;
    }
}
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        while(H != 0 || W != 0){
            for(int i = 0; i < H; i++){
            	if(i % 2 == 0){
            		for(int j = 0; j < W-1; j++){
            			if(j % 2 == 0){
            				System.out.print("#");
            			}else{
            				System.out.print(".");
            			}
            		}
            		if(W % 2 == 0){
                    	System.out.println(".");
                	}else{
                		System.out.println("#");
                	}
            	}else{
            		for(int j = 0; j < W-1; j++){
            			if(j % 2 == 0){
            				System.out.print(".");
            			}else{
            				System.out.print("#");
            			}
            		}
            		if(W % 2 == 0){
                    	System.out.println("#");
                	}else{
                		System.out.println(".");
                	}
            	}
            }
            System.out.println();
            H = sc.nextInt();
            W = sc.nextInt();
        }
    }
}
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);        
        while(true){            
            int H = sc.nextInt();
            int L = sc.nextInt();
            if(H == 0 && L == 0) break;
            for(int i=0; i < H; i++){
                for(int j=0; j < L; j++){
                    if(i == 0 || i == H-1){
                        System.out.print("#");
                    }else{
                        if(j == 0 || j == L-1){System.out.print("#");
                        }else if(j <= L-1 && 0 <= j){
                            System.out.print(".");
                        }
                    }                    
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}

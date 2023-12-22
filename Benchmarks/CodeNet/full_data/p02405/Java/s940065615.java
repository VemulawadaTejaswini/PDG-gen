import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N;
        int[] H,W;
        H = new int[300];
        W = new int[300];
        for(int i=0;;i++){
           
            H[i] = sc.nextInt();
            W[i] = sc.nextInt();
            if(H[i]==0 && W[i]==0){
                break;
            }
        }
        for(int i=0;;i++){
            if(H[i]==0 && W[i]==0){
                break;
            }
            for(int j=0;j<H[i]/2;j++){
                for(int l=0;l<W[i]/2;l++){
                    System.out.print("#.");
                }
                if(W[i]%2==1)   System.out.print("#");
                System.out.println();
                for(int l=0;l<W[i]/2;l++){
                    System.out.print(".#");
                }
                if(W[i]%2==1)   System.out.print(".");
                System.out.println();
            }
            if(H[i]%2==1){
                for(int l=0;l<W[i]/2;l++){
                    System.out.print("#.");
                    
                }
                if(W[i]%2==1)   System.out.print("#");
                System.out.println();
            }  
            System.out.println();

        }
        sc.close();
    }
}

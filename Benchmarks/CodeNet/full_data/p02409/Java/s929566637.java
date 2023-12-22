import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int info = sc.nextInt();
        
        int b,f,r,v=0;
        
        int[][][] house=new int[4][3][10];
        
        for(int i=0;i<info; i++){
            b = sc.nextInt();
            f = sc.nextInt();
            r = sc.nextInt();
            v = sc.nextInt();
            
            house[b-1][f-1][r-1] += v;
        }
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 10; k++){
                    if(k != 9){
                        System.out.print(" " + house[i][j][k]);
                    }else{
                        System.out.println(" " + house[i][j][k]);
                    }
                }
            }
            if(i!=3){
                System.out.println("####################");
            }
        }
        
    }
}


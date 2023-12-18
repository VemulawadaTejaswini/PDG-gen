import java.util.*;
 

public class Main {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String S[][] = new String[H][W];

        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                S[i][j] = sc.next();
                if(S[i][j]==".")
                  S[i][j] = "0";
            }
        }

        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
        if(S[i][j]=="#")
        if(i-1>0){
        S[i-1][j]+=(int) 1;
        if(j-1>0)
        S[i-1][j-1]+=(int) 1 ;
        if(j+1<W)
        S[i-1][j+1]+=(int) 1 ;
        }
        if(j-1>0){
        S[i][j-1] +=(int) 1 ;
        if(i+1<H)
        S[i+1][j-1]+=(int) 1 ;
        }
        if(i+1<H){
        S[i+1][j]+=(int) 1 ;
        if(j+1<W)
        S[i+1][j+1]+=(int) 1 ;
        }
        if(j+1<W)      
        S[i][j+1]+=(int) 1 ;
        
        
            }
        }

        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
        System.out.println(S[i][j]);
            }
        }
    }
    
}    




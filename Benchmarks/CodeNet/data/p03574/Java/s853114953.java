import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] S = new char[H][W];
        for(int i=0; i<H; i++){
            S[i] = sc.next().toCharArray();
        }
        //String S = sc.next();

        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                if(S[i][j]=='#'){
                    continue;
                }
                int count=0;
                if(i>0){
                    if(S[i-1][j]=='#'){
                        count++;
                    } 
                    if(j>0 && S[i-1][j-1]=='#'){
                        count++;
                    }
                    if(j<W-1 && S[i-1][j+1]=='#'){
                        count++;
                    }
                }

                if(j>0 && S[i][j-1]=='#'){
                    count++;
                }
                if(j<W-1 && S[i][j+1]=='#'){
                    count++;
                }

                if(i<H-1){
                    if(S[i+1][j]=='#'){
                        count++;
                    } 
                    if(j>0 && S[i+1][j-1]=='#'){
                        count++;
                    }
                    if(j<W-1 && S[i+1][j+1]=='#'){
                        count++;
                    }
                }
                
                System.out.print(count);
            }
            System.out.println();
        }
        
        
        
        
        
                
            

        }
        
        

        
        
        }
    
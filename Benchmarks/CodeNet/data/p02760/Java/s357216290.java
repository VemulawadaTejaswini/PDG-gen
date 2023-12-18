import java.util.*;

public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int A[][] = new int[3][3];
        boolean hantei = false;
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
               
               A[i][j] = scanner.nextInt(); 
                
            }
        }
        
        int N = scanner.nextInt();
        int B[] = new int[N];
        
        for(int i=0; i<N; i++){
            
            B[i] = scanner.nextInt();
            
            for(int j=0; j<3; j++){
                for(int k=0; k<3; k++){
                    if(A[j][k]==B[i]){
                        
                        A[j][k] = 0;   
                        
                    }
                }
            }    
            
        }
        
        for(int i=0; i<3; i++){
            if(A[i][0]==A[i][1] && A[i][0]==A[i][2]){
                hantei = true;
            }
        }
        
        for(int i=0; i<3; i++){
            if(A[0][i]==A[1][i] && A[0][i]==A[2][i]){
                hantei = true;
            }
        }
        
        if((A[0][0]==A[1][1] && A[0][0]==A[2][2]) ||(A[0][2]==A[1][1] && A[0][2]==A[2][0]) ){
            hantei = true;
        }
        
        if(hantei){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}

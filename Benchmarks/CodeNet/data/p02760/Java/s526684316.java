import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[3][3];
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                A[i][j] = sc.nextInt();
            }
        }
        int N = sc.nextInt();
        int[] b = new int[N];
        int[][] x = new int[3][3];
        int[][] y = new int[3][3];
        int s = 0;

        for(int i=0; i<N; i++){
            b[i] = sc.nextInt();
            for(int j=0; j<3; j++){
                for(int k=0; k<3; k++){
                    if(b[i]==A[j][k]){
                        x[j][k] = j;
                        y[j][k] = k;
                    }
                }
            }
        }
        loop:for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(x[i][j]==i && y[i][j]==j){
                    s = 0;
                    for(int k=0; k<3; k++){
                        if(j!=k && x[i][k]==i && y[i][k]==k){
                            s +=1;
                        }
                        if(s==2){
                            System.out.println("Yes");
                            break loop;
                        }
                    }
                    s = 0;
                    for(int k=0; k<3; k++){
                        if(i!=k && x[k][j]==k && y[k][j]==j){
                            s +=1;
                        }
                        if(s==2){
                            System.out.println("Yes");
                            break loop;
                        }
                    }
                    s = 0;
                    for(int k=0; k<3; k++){
                        if(i!=k && j!=k && x[k][k]==k && y[k][k]==k){
                            s +=1;
                        }
                        if(s==2){
                            System.out.println("Yes");
                            break loop;
                        }
                    }
                    s = 0;
                }
            }
        }
        if(s==0){
            loop1:for(int i=0; i<3; i++){
                for(int j=2; j>0; j--){
                    if(x[i][j]==i && y[i][j]==j && s!=i+1){
                        s += 1;
                    }
                    if(s==3){
                        System.out.println("Yes");
                        break loop1;
                    }
                }
            }
            if(s<3){
                System.out.println("No");
            }
        }

    } 
}
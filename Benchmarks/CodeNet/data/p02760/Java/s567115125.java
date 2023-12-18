import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        
        
        int [][]a=new int[3][3];
        
        int sum=0;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                a[i][j]=stdIn.nextInt();
            }
        }
        int N=stdIn.nextInt();
        int []b=new int[N];
        for(int i=0; i<N; i++){
            b[i]=stdIn.nextInt();
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                for(int k=0; k<N; k++){
                    if(a[i][j]==b[k]){
                        a[i][j]=0;
                    }
                }
            }
        }
        
        for(int i=0; i<3; i++){
            if(a[i][0]==a[i][1]&&a[i][1]==a[i][2]&&a[i][2]==0){
                sum++;
            }
        }
        for(int i=0; i<3; i++){
            if(a[0][i]==a[1][i]&&a[1][i]==a[2][i]&&a[2][i]==0){
                sum++;
            }
        }
        if(a[0][0]==a[1][1]&&a[1][1]==a[2][2]&&a[2][2]==0){
            sum++;
        }
        if(a[2][0]==a[1][1]&&a[1][1]==a[0][2]&&a[0][2]==0){
            sum++;
        }

        if(sum>=1){
            System.out.println("Yes");
            
        }
        else{
            System.out.println("No");
            
        }
        
    }

}
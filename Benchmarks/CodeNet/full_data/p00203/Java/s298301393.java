import java.util.Scanner;

public class Main {
 
    static int X,Y,ans;
    static int[][] field;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(true){
            X=cin.nextInt();
            Y=cin.nextInt();
            ans=0;
            if(X+Y==0){
                break;
            }
            field = new int[Y+2][X+2];
            for(int i = 0;i<Y+2;i++){
                for(int j = 0;j<X+2;j++){
                    field[i][j]=-1;
                }
            }
            for(int i = 0;i<Y;i++){
                for(int j = 1;j<X+1;j++){
                    field[i][j]=cin.nextInt();
                }
            }
            for(int i = 0;i<X+2;i++){
                if(field[0][i]==0){
                    ski(0,i);
                }
            }
            System.out.println(ans);
        }
    }
    static void ski(int y,int x){
        //System.out.println((y+1)+" " + x);
        if(y>=Y-1){
            //System.out.println("aaaaaaaa"+(y+1)+" " + x);
            ans++;
            return;
        }
        if(field[y][x]==2){
        	if(field[y+2][x]!=1){
        		ski(y+2,x);
        	}
            return;
        }
        if(field[y+1][x]==0){
            ski(y+1,x);
        }
        else if(field[y+1][x]==2){
            ski(y+1,x);
        }
         
        if(field[y+1][x-1]==0){
            ski(y+1,x-1);
        }
        if(field[y+1][x+1]==0){
            ski(y+1,x+1);
        }
    }
}
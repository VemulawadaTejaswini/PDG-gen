import java.io.FilePermission;
import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Bingo bingo = new Bingo();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                bingo.setData(i, j, sc.nextInt());
            }
            sc.nextLine();
        }
        int N = sc.nextInt();
        boolean FLG = false;
        for(int i=0;i<N;i++){
            int b =  sc.nextInt();
            sc.nextLine();

            for(int j=0 ; j<3 ; j++){
                for(int k=0 ; k<3 ; k++){
                    if(bingo.getData(j, k) == b){
                        bingo.setHit(j, k);
                    }
                }
            }
            for(int j=0; j<3; j++){
                if(bingo.checkVertical(j) || bingo.checkCross(j)){
                    FLG = true;
                    break;
                }
            }
            if(bingo.checkDiagonal()) FLG = true;
            if(FLG) break;
        }
        if(FLG){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
class Bingo{
    private int data[][];
    private boolean hit[][];
    Bingo(){
        this.data = new int[3][3];
        hit = new boolean[3][3];
        for(boolean[] row: hit) Arrays.fill(row, false);
    }
    void setData(int i, int j, int value){
        data[i][j] = value;
    }
    int getData(int i, int j){
        return data[i][j];
    }
    void setHit(int i, int j){
        hit[i][j] = true;
    }   
    boolean getHit(int i, int j){
        return hit[i][j];
    }
    boolean checkVertical(int index){
        if(hit[index][0] && hit[index][1] && hit[index][2]) return true;
        return false;
    }
    boolean checkCross(int index){
        if(hit[0][index] && hit[1][index] && hit[2][index])return true;
        return false;
    }
    boolean checkDiagonal(){
        if(hit[0][0] && hit[1][1] && hit[2][2])return true;
        if(hit[0][2] && hit[1][1] && hit[2][0])return true;
        return false;
    }
}
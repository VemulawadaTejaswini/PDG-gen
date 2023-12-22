import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[][][] room = new int[5][4][11];
        
        //初期化
        for(int b1=0; b1<5; b1++){
            for(int f1=0; f1<4; f1++){
                for(int r1=0; r1<11; r1++){
                    room[b1][f1][r1] = 0;
                }
            }
        }
        
        //b f r v
        //b棟f階のr番目の部屋にv人が追加で入居
        for(int i = 0; i < n; i++){
            int b = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();
            
            room[b][f][r] += v;
        }
        
        for(int b1=1; b1<5; b1++){
            for(int f1=1; f1<4; f1++){
                for(int r1=1; r1<11; r1++){
                    System.out.printf(" " + room[b1][f1][r1]);
                }
                System.out.printf("\n");
            }
            if(b1 != 4){
        		System.out.println("####################");
        	}
        }
    }
}

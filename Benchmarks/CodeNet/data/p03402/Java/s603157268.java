import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt();
        char[][] c = new char[100][100];
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 50; j++){
                c[i][j] = '#';
            }
            for(int j = 50; j < 100; j++){
                c[i][j] = '.';
            }
        }
        
        int cntA = 1, cntB = 1;
        boolean flag1 =false, flag2 = false;
        if(A == 1) flag1 = true;
        if(B == 1) flag2 = true;
        for(int i = 0; i < 100; i += 2){
            if(flag1 == true) break;
            for(int j = 0; j < 49; j++){
                if((i + j) % 2 == 0){
                    c[i][j] = '.';
                    cntA++;
                    if(cntA == A){
                        flag1 = true;
                        break;
                    }
                }
            }
        }
        for(int i = 0; i < 100; i += 2){
            if(flag2 == true) break;
            for(int j = 51; j < 100; j++){
                if((i + j) % 2 == 0){
                    c[i][j] = '#';
                    cntB++;
                    if(cntB == B){
                        flag2 = true;
                        break;
                    }
                }
            }
        }
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                System.out.print(c[i][j]);
            }
            System.out.print("\n");
        }
    }
}
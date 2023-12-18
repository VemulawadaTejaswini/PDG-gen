import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String N = scan.next();
        String M[]=new String [6];

        for(int i=0;i<6;i++)
        { M[i]=N.substring(i,i+1);}
        if(M[2].equals(M[3])&&M[4].equals(M[5])){System.out.println("Yes");}
       else{System.out.println("No");}
//入力完了


/*
        for (int iii = 0; iii < (1 << N); iii++) {
                int PP=0;
                int S[] = new int[M];
                for (int j = 0; j < N; j++) {

                    if ((1 & iii >> j) == 1) {
                        for(int y=0;y<M;y++){S[y]=S[y]+A[j][y];}
                        PP=PP+C[j];
                    }

                }
                int K=0;
             for(int p=0;p<M;p++) {if(S[p]>=X){K=K+1;}  }
             if (K==M&&(P==-1||P>=PP)){P=PP;}
            }
*/

    }

}


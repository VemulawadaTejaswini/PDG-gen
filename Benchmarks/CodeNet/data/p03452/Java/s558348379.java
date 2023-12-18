import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int L[] = new int[M];
            int R[] = new int[M];
            int D[] = new int[M];
            for (int i=0; i<M; i++){
                L[i]= scanner.nextInt();
                R[i]= scanner.nextInt();
                D[i]= scanner.nextInt();
            }
            if(M>1){
                int LL = L[M-1];
                int RR= R[M-1];
                int DD = D[M-1];
          
                Boolean findR=false;
                int Lt=LL;
                int dist=0;
                while (!findR){
                    Boolean findL=false;
                    int li=0;
                    while ((li<M-1)&&(!findL)){
                        if (L[li] == Lt){
                            findL=true;
                            Lt=R[li];
                            dist+=D[li];
                        }
                        li++;
                    }
                    if (!findL){
                        System.out.println("Yes");
                        break;
                    }
                    if (Lt == RR) {
                        findR=true;
                        if (dist == DD) System.out.println("Yes");
                        else System.out.println("No");
                    }
                }
            }
            else System.out.println("Yes");
        }
}
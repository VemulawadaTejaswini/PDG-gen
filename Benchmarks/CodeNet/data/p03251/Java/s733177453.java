import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        Integer[] aryX = new Integer[N];
        Integer[] aryY = new Integer[M];

        for(int i=0 ; i < N ; i++){
            aryX[i] = sc.nextInt();
            //System.out.println("aryx="+ aryX[i]);
        }

        for(int j=0 ; j < M ; j++){
            aryY[j] = sc.nextInt();
           // System.out.println("aryy="+ aryY[j]);
        }

        int xmax = aryX[0];
        int ymin = aryY[0];


        for(int k=0 ; k < N ; k++){
            if(aryX[k] > xmax){
                xmax = aryX[k];
               // System.out.println("xmax="+xmax);
            }
        }

        for(int m=0 ; m < M ; m++){
            if(aryY[m] < ymin){
                ymin = aryY[m];
               // System.out.println("ymin="+ymin);
            }
        }

        if(xmax >= ymin){
            System.out.println("War");
        }else if(X <= xmax && Y <= xmax){
            System.out.println("War");
        }else if(ymin <= X){
            System.out.println("War");
        }else{
            System.out.println("No War");
        }
    }
}
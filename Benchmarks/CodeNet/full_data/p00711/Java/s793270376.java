import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by macbookpro on 2017/07/10.
 */
public class Main {
    static int[][] array;
    static int counter=1;
    static int w;
    static int h;
    static boolean[][] confirm;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(true){
            String[] firstLine=sc.nextLine().split(" ");


            w=Integer.parseInt(firstLine[0]);
            if(w==0){
                break;
            }

            h=Integer.parseInt(firstLine[1]);
            array=new int[h][w];
            confirm=new boolean[h][w];


            for(boolean[] tmp:confirm){
                Arrays.fill(tmp,false);
            }



            int sh=0;
            int sw=0;


            for(int i=0; i<h; i++){
                String tiles=sc.nextLine();

                for(int j=0; j<w; j++){
                    char cell= tiles.charAt(j);

                    if(cell=='.') {
                        array[i][j]=1;//??????1??§??¨???
                    }else if(cell=='#'){
                        array[i][j]=0;//??????0??§??¨???
                    }else{
                        array[i][j]=1;
                        sh=i;
                        sw=j;
                    }
                }
            }



            counter=1;

            confirm[sh][sw]=true;

            if(sw!=w-1 && array[sh][sw+1]==1) {
                rightmove(sh,sw+1);
            }

            if(sh!=0&&array[sh-1][sw]==1){
                upmove(sh-1,sw);
            }

            if(sh!=h-1 && array[sh+1][sw]==1){
                downmove(sh+1,sw);
            }

            if (sw != 0 && array[sh][sw - 1] == 1) {
                leftmove(sh,sw-1);
            }



            System.out.println(counter);
        }
    }



    static void rightmove(int m, int n){

       if(confirm[m][n]!=true){
           counter++;
           confirm[m][n]=true;

           if(n!=w-1 && array[m][n+1]==1) {
               rightmove(m, n + 1);
           }if(m!=h-1 && array[m+1][n]==1){
               downmove(m+1,n);
           }if(m!=0&&array[m-1][n]==1){
               upmove(m-1,n);
           }
       }



    }


    static void leftmove(int m, int n){

        if(confirm[m][n]!=true){

            counter++;
            confirm[m][n] = true;

            if (n != 0 && array[m][n - 1] == 1) {
                leftmove(m,n-1);
            }
            if (m != h - 1 && array[m + 1][n] == 1) {
                downmove(m + 1, n);
            }
            if (m != 0 && array[m - 1][n] == 1) {
                upmove(m - 1, n);
            }
        }
    }


    static void upmove(int m, int n){

        if(confirm[m][n]!=true){

            counter++;
            confirm[m][n] = true;
            if (n != w - 1 && array[m][n + 1] == 1) {
                rightmove(m, n + 1);
            }
            if (n != 0 && array[m][n - 1] == 1) {
                leftmove(m, n - 1);
            }
            if (m != 0 && array[m - 1][n] == 1) {
                upmove(m - 1, n);
            }
        }
    }


    static void downmove(int m, int n){
        if(confirm[m][n]!=true){

            counter++;
            confirm[m][n] = true;
            if (n != w - 1 && array[m][n + 1] == 1) {
                rightmove(m, n + 1);
            }
            if (n != 0 && array[m][n - 1] == 1) {
                leftmove(m, n - 1);
            }
            if (m != h-1 && array[m + 1][n] == 1) {
                downmove(m + 1, n);
            }

        }
    }
}
import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);

        int dmtr[][][]= new int[4][3][10]; //b f r

        for(int i = 0;i < 4;i++){
            for(int j = 0;j<3;j++){
                for(int k = 0; k < 10;k++){
                    dmtr[i][j][k]=0;
                }
            }
        }
        int n = 100;
        for(int i = 0;i < n;i++){
            if(i ==0){
                String line = new String();
                line = scanner.next();
                n = Integer.parseInt(line);

            }
            String x = scanner.next();
            int b = Integer.parseInt(x);
            String y = scanner.next();
            int f = Integer.parseInt(y);
            String z = scanner.next();
            int r = Integer.parseInt(z);
            String w = scanner.next();
            int v = Integer.parseInt(w); 

            dmtr[b-1][f-1][r-1] += v;
        }
        

        for(int i = 0;i < 4;i++){
            for(int j = 0;j<3;j++){
                for(int k = 0; k < 10;k++){
                    System.out.print(" "+dmtr[i][j][k]);
                    if(k == 9){
                        System.out.print("\n");
                    }
                }
            }
            if(i != 3){
            System.out.println("####################");
            }
        }

        }
    }


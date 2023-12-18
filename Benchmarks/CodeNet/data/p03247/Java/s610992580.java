import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] x = new int[n][2];
        for(int i=0; i<n; i++){
            x[i][0] = sc.nextInt();
            x[i][1] = sc.nextInt();
        }
        sc.close();

        int mod = Math.abs(x[0][0] + x[0][1]) % 2;
        for(int i=1; i<n; i++){
            if(Math.abs(x[i][0] + x[i][1]) % 2 != mod){
                System.out.println("-1");
                return;
            }
        }

        System.out.println(40);
        int gxpos, gypos = 1, count = 1;
        if(mod == 0){
            gxpos = 1;
            System.out.print("1 ");
        }else{
            gxpos = 2;
            System.out.print("2 ");
        }
        for(int i=0; i<19; i++){
            System.out.print("1 ");
        }
        for(int i=0; i<19; i++){
            System.out.print("1 ");
        }
        System.out.println("1");
        
        for(int i = 0; i<n; i++){
            int xpos = gxpos;
            int ypos = gypos;
            count = 1;
            System.out.print("R");
            while(count < 20){
                if(x[i][0] >= xpos){
                    System.out.print("R");
                    xpos++;
                }else{
                    System.out.print("L");
                    xpos--;
                }
                count++;
            }
            if(x[i][0] > xpos){
                System.out.print("R");
                xpos++;
                count++;
            }else if(x[i][0] < xpos){
                System.out.print("L");
                xpos--;
                count++;
            }
            System.out.print("U");
            count++;
            while(count < 40){
                if(x[i][1] >= ypos){
                    System.out.print("U");
                    ypos++;
                }else{
                    System.out.print("D");
                    ypos--;
                }
                count++;
            }
            System.out.println("");
        }

        //System.out.println(20);
        // for(int i=0; i<19; i++){
        //     System.out.print("1 ");
        // }
        // System.out.println("1");
        
        // for(int i=0; i<n; i++){
        //     int count = 0;
        //     if(x[i][0] > 0){
        //         for(int j=0; j<x[i][0]; j++){
        //             System.out.print("R");
        //             count++;
        //         }
        //     }else{
        //         for(int j=0; j<-x[i][0]; j++){
        //             System.out.print("L");
        //             count++;
        //         }
        //     }
        //     if(x[i][1] > 0){
        //         for(int j=0; j<x[i][1]; j++){
        //             System.out.print("U");
        //             count++;
        //         }
        //     }else{
        //         for(int j=0; j<-x[i][1]; j++){
        //             System.out.print("D");
        //             count++;
        //         }
        //     }
        //     while(count < 20){
        //         System.out.print("U");
        //         count++;
        //     }
        //     System.out.println("");
        // }
    }
}
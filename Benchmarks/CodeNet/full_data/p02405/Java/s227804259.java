import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)throws Exception{
        Scanner scan = new Scanner(System.in);
        int H = 0;
        int W = 0;
        String w = "";
        String h = "";
        int judge = 0;
        while(judge == 0){
            H = scan.nextInt();
            W = scan.nextInt();
            //w,hは繰り返し使うので、その都度初期化する
            if(judge == 0){
                w = "";
                h = "";
            }
            if(H == 0 && W == 0){
                judge = 1;
            }else{
                for(int i = 0;i <= W - 1;i++){    
                   switch(i % 2){
                       case 0:
                           w = w + "#";
                           h = h + ".";
                           break;
                       case 1:
                           w = w + ".";
                           h = h + "#";
                           break;
                       }
                   }
                }
                for(int I = 0;I <= H - 1;I++){
                    switch(I % 2){
                      case 0:
                          System.out.println(w);
                          break;
                      case 1:
                          System.out.println(h);
                          break;
                    }
                    if(I == H - 1){
                        System.out.println("");
                    }
            } 
        }
    }
}

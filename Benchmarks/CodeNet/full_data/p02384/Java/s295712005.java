import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)  {
         Scanner sc = new Scanner(System.in);
    int dice[] = new int[6];
   
    
    for(int i=0; i<6; i++){
        dice[i] = sc.nextInt();
        }
        
    int q  = sc.nextInt();
    
    for(i =0; i<q*2; i++){
        int men [i] = sc.nextInt();    
    }

    for(int j=0; j<mei.length(); j++){
        int tmp     =0 ;
        if(rei[j] =='N'){
            tmp = dice[0];
            dice[0] = dice[1];
            dice[1] = dice[5];
            dice[5] = dice[4];
            dice[4] = tmp;
        }
        else if(rei[j]=='S'){
            tmp = dice[0];
            dice[0] = dice[4];
            dice[4] = dice[5];
            dice[5] = dice[1];
            dice[1] = tmp;
        }
        else if(rei[j]=='E'){
            tmp = dice[0];
            dice[0] = dice[3];
            dice[3] = dice[5];
            dice[5] = dice[2];
            dice[2] = tmp;
        }
        else if(rei[j] =='W'){
            tmp =dice[0];
            dice[0] = dice[2];
            dice[2] = dice[5];
            dice[5] = dice[3];
            dice[3] = tmp;
        }
    }
        System.out.println(dice[0]);

    }

   }
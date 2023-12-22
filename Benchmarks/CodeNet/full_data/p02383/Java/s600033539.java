import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
    int dice[] = new int[6];
   
    
    for(int i=0; i<6; i++){
        dice[i] = sc.nextInt();
        }
        
    String mei  = sc.next(); 
    char[] rei = mei.toCharArray();
    int tmp =0;
    
    for(int j=0; j<mei.length(); j++){
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
        else{
            tmp = 0;
            dice[0] = dice[2];
            dice[2] = dice[5];
            dice[5] = dice[3];
            dice[3] = tmp;
        }
        }
            System.out.println(dice[0]);

    }

   }
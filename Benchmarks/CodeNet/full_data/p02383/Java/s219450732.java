import java.util.Scanner;
import java.io.*;
 
class Main {
    public static void main(String[] args)throws IOException{ 
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(in);
 
       String number = read.readLine();
       Stirng[] spli1 = number.split(" ");
       int [] dice = new int [spli1[].length];

       for(int num = 0; num < spli1[].length; num++){
        dice[num] = Integer.parseInt(spli1[num]);
       }


       String com = read.readLine();
       Stirng[] spli2 = com.split(" ");
       char [] command = new char [spli2[].length];

       for(int num = 0; num < spli2[].length; num++){
        command[num] = Integer.parseInt(spli2[num]);
       }

       int count;

       for(count = 0; count < spli2[].length; count++){

            if(count == 0){
                if(command[count].equals(N)){
                    dice[0] = dice[1];
                }
                else if(command[count].equals(E)){
                    dice[0] = dice[3];
                }
                else if(command[count].equals(S)){
                    dice[0] = dice[4];
                }
                else if(command[count].equals(W)){
                    dice[0] = dice[2];
                }
            }
            else{
                if(command[count].equals(N)){
                    if(dice[count-1] == dice[0]){
                     dice[count-1] = dice[1];
                    }
                    else if(dice[count-1] == dice[1] || dice[count-1] == dice[2] || dice[count-1] == dice[3] ){
                     dice[count-1] = dice[5];
                    }
                    else if(dice[count-1] == dice[4]){
                     dice[count-1] = dice[0];
                    }
                    else if(dice[count-1] == dice[4]){
                     dice[count-1] = dice[0];
                    }
                    else if(dice[count-1] == dice[5]){
                     dice[count-1] = dice[4];
                    }                   
                }
                else if(command[count].equals(E)){
                    if(dice[count-1] == dice[0] || dice[count-1] == dice[1] || dice[count-1] == dice[4] || dice[count-1] == dice[5]){
                     dice[count-1] = dice[3];
                    }
                     else if(dice[count-1] == dice[2]){
                      dice[count-1] = dice[1];
                     }
                     else if(dice[count-1] == dice[3]){
                      dice[count-1] = dice[4];
                     }
                }
                else if(command[count].equals(S)){
                    if(dice[count-1] == dice[0]){
                     dice[count-1] = dice[4];
                    }
                     else if(dice[count-1] == dice[1] || dice[count-1] == dice[2] || dice[count-1] == dice[3]){
                     dice[count-1] = dice[0];
                    }
                     else if(dice[count-1] == dice[4] || dice[count-1] == dice[5]){
                     dice[count-1] = dice[2];
                    }
                }
                else if(command[count].equals(W)){
                    if(dice[count-1] == dice[0] || dice[count-1] == dice[1]){
                     dice[count-1] = dice[2];
                    }
                     else if(dice[count-1] == dice[2]){
                      dice[count-1] = dice[4];
                    }
                     else if(dice[count-1] == dice[3] || dice[count-1] == dice[5]){
                     dice[count-1] = dice[1];
                    }
                    else if(dice[count-1] == dice[4]){
                      dice[count-1] = dice[5];
                    }
                }
            }
       }
       System.out.println(dice[count-1]);
    }
}
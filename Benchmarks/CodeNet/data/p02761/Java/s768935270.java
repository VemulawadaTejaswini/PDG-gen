import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        //input
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        //3
        //int[] table = new int[1000];
        //Arrays.fill(table, 0);

        //Algorithm
        //int result = 0;
        int A = -1;
        int B = -1;
        int C = -1;
        String str = "";

        for(int i = 0; i < M; i++){
          String[] digit = br.readLine().split(" ");

          if(Integer.parseInt(digit[0]) == 1){
            if(A == -1){
              A = Integer.parseInt(digit[1]);
            }else if(A != -1 && A > 0){
              if(Integer.parseInt(digit[0]) == A){
                continue;
              }else{
                if(Integer.parseInt(digit[1]) > A){
                  A = Integer.parseInt(digit[1]);
                }else{
                  continue;
                }
              }
            }
          }
            
          if(Integer.parseInt(digit[0]) == 2){
            if(B == -1){
              B = Integer.parseInt(digit[1]);
            }else if(B != -1 && B > 0){
              if(Integer.parseInt(digit[1]) == B){
                continue;
              }else{
                if(Integer.parseInt(digit[1]) > B){
                  B = Integer.parseInt(digit[1]);
                }else{
                  continue;
                }
              }
            }
          }

          if(Integer.parseInt(digit[0]) == 3){
            if(C == -1){
              C = Integer.parseInt(digit[1]);
            }else if(C != -1 && C > 0){
              if(Integer.parseInt(digit[1]) == C){
                continue;
              }else{
                if(Integer.parseInt(digit[1]) > C){
                  C = Integer.parseInt(digit[1]);
                }else{
                  continue;
                }
              }
            }
          }
        }

        if(A == -1 || A == 0){
          System.out.println(-1);
        }else{
          if(B == -1){
            B = 0;
          }
          if(C == -1){
            C = 0;
          }

          str = String.valueOf(A) + String.valueOf(B) + String.valueOf(C);
          System.out.println(Integer.parseInt(str));
        }

      }
    }
}
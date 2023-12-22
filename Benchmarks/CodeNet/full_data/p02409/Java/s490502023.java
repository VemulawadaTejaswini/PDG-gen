import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        

//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();//　n個ある

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        String [] info = new String[4];//管理する数字の箱
        int b;
        int f;
        int r;
        int v;
        int num = 0;//元々の部屋の人数
        String aida = ("####################");
        

        int [][][] house = new int [4][3][10];
        
            for(int i = 0; i < n; i++){
        
            info = reader.readLine().split(" ");
       
            b =  Integer.parseInt(info[0]);
            f =  Integer.parseInt(info[1]);
            r =  Integer.parseInt(info[2]);
            v =  Integer.parseInt(info[3]);

            house[b-1][f-1][r-1] +=v;
            }
        
            
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 3; j++){
                   for(int k = 0; k < 10; k++){
                    
                       System.out.print(" " + house[i][j][k]);
                   }System.out.println();
                }
                if(i<=2){
                       System.out.println(aida);
                }
//                System.out.println(); 
            }
    }
}



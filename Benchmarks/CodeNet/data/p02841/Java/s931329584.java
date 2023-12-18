import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [][] date = new int [2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                date[i][j] = scan.nextInt();
            }
        }
        if(date[0][1]>date[1][1]){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
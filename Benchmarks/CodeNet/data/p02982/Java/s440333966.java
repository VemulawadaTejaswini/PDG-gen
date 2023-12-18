import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class Main {
	public static void main(final String[] args){
    
    final Scanner sc = new Scanner(System.in);
    final int n = sc.nextInt();
    //final List<Integer> list = new ArrayList<>();
    int d = sc.nextInt();
    int sum = 0;
    int count = 0;

    int[][] list = new int[n][d];

    for(int i = 0; i < n ; i++){
        for(int j = 0; j < d ; j++){
            list[i][j] = sc.nextInt();
        }
    }

    for(int i = 0; i < n ; i++){
        for(int j = i + 1; j < n ; j++){
            for(int a = 0 ; a < d ; a++){
                sum += (list[i][a] - list[j][a])*(list[i][a] - list[j][a]);
            }
            if(Math.sqrt(sum) == (int)Math.sqrt(sum)){
                count++;
            }
            sum = 0;
        }
    }

    System.out.println(count);
    




    

    



    
  

    


    


    

    
    
    



    





}
}
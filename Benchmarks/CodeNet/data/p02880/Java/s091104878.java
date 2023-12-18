import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.io.Serializable;

public class Main {
	public static void main(final String[] args){
    
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int count = 0;

        for(int i = 1 ; i < 10 ; i++){
            for(int j = 1 ; j < 10 ; j++){
                if(i * j == x){
                    count++;
                }
            }
        }

        if(count == 0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        

        


    }
}
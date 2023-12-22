import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(final String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int check = 0;
        for(int a = 0; a < 1000 ; a++){
            for(int b = -1000 ; b < a ; b++){
                if(check == 0){
                    if(a*a*a*a*a - b*b*b*b*b == x){
                        check++;
                        System.out.println(a + " " + b);
                    }
                }
            }
        }



        


    }
}
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

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int score = 0;

        while(k > 0){
            if(a != 0){
                score += 1;
                a--;
            }else if(b != 0){
                b--;
            }else{
                score -= 1;
                c--;
            }

            k--;
        }
        System.out.println(score);

        


    }
}
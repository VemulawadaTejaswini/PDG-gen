import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ab[] = new int[2];
        ab[0] = sc.nextInt();
        ab[1] = sc.nextInt();

        for(int i=0;i<ab.length;i++){
            if(ab[i] == 1){
                ab[i] = ab[i] + 13;
            }
        }

        if(ab[0] > ab[1]){
            System.out.println("Alice");
        }else if(b[0] < ab[1]){
            System.out.println("Bob");
        }else{
            System.out.println("Drow");

        }

        }        
    }


import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args)throws Exception{
        Scanner scan = new Scanner(System.in);
        int m;
        int f;
        int r;
        int sum;
        int i = 0;
        char grade;
        while(i == 0){
            grade = ' ';
            m = scan.nextInt();
            f = scan.nextInt();
            r = scan.nextInt();
            sum = m + f;
            if(m == -1 && f == -1 && r == -1){
                i = 1;
            }else{ 
                if(m == -1 || f == -1){
                        grade = 'F';
                }else{
                    sum = m + f;
                    if(sum >= 80){
                        grade = 'A';
                    }else if(sum >= 65){
                        grade = 'B';
                    }else if(sum >= 50){
                        grade = 'C';
                    }else if(sum < 30){
                        grade = 'F';
                    }else{
                        if(r >= 50){
                            grade = 'C';
                        }else{
                            grade = 'D';
                        }
                    }
                }
                System.out.println(grade);  
            }
        }
    }
}

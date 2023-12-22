import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("最初のトークンは: "+ num1 + num2);
        
        int sum1 = num1*num1;
        int sum2 = num2*num2;
        
        double ans1 = Math.sqrt(sum1 + sum2);
        
        int a = this.checkA(num1);
        
        int b = this.checkB(num2);
        
        if (a * a + sum2 > b * b + sum1) {
            
        }
        
        if (a * a + sum2 < b * b + sum1) {
            
        }
        
        if (a * a + sum2 == b * b + sum1) {
            if (a > num1) {
                
            }
            
            if (a < num1) {
                
            }
            
            if (a == num1) {
                
            }
        }

    }
    
    public int checkA(int num1) {
        int a = 0;
        for (int i = 0; i > num1; i++) {
            a = num1 + 1;
            
            if (i == 150) {
                break;
            }
        }
        
        return a;
        
    }
    
    public int checkB(int num2) {
        int b = 0;
        for (int j = 0; j > num2; j++) {
            
            if (i == 150) {
                break;
            }
            
        }
        
        return b;
    }
    
}


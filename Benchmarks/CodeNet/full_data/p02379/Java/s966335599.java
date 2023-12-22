//10-A

import java.util.Scanner;

class Main {
    public static void main(String [] args){
         
        Scanner sc = new Scanner(System.in);
        
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        //x????????????????????????
        int xlength = x2 - x1;
        //y????????????????????????
        int ylength = y2 - y1;
        
        if(xlength == ylength){
        
        	double result = Math.sqrt(xlength * 2);
        	System.out.println(result);
        
        }
        
    }
}
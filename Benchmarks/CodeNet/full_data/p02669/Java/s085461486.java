package practice02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int T = 0;
        int piece = 0;
        int sum = 0;
        int sc[] = new int[5];
        ArrayList<Integer> array = new ArrayList<Integer>();

        Scanner scanT = new Scanner(System.in);
        Scanner scanLine = new Scanner(System.in);
        T = scanT.nextInt();

        for(int i = 0; i < T; i++){
        	sc[0] = scanLine.nextInt();
        	sc[1] = scanLine.nextInt();
        	sc[2] = scanLine.nextInt();
        	sc[3] = scanLine.nextInt();
        	sc[4] = scanLine.nextInt();

        	sum = sum + 1;
        	piece = piece + sc[4];

        	while(sum != sc[0]){
	        	if(sc[0] > sum * 5){
	            	sum = sum * 5;
	            	piece = piece + sc[3];
	        	}
	        	else if(sc[0] > sum * 3){
	            	sum = sum * 3;
	            	piece = piece + sc[2];
	        	}
	        	else if(sc[0] > sum * 2){
	            	sum = sum * 2;
	            	piece = piece + sc[1];
	        	}
	        	else if(sc[0] > sum){
	            	for(int j = sum; j < sc[0]; j++){
	                	sum = sum + 1;
	                	piece = piece + sc[4];
	            	}
	        	}
	        	else{
	            	for(int k = sum; k < sc[0]; k++){
	                	sum = sum - 1;
	                	piece = piece + sc[4];
	            	}
	        	}
        	}
        	array.add(piece);
        }
        for (int result : array) {
            System.out.println(result);
        }
    }
}
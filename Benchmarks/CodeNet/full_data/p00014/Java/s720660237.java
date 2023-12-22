import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Main{
    public static void main(String[] a){
    	int d = 0;
    	int sum = 0;
    	Scanner scan = new Scanner(System.in);
    	while (scan.hasNext()){
    	d = scan.nextInt();
    	for(int i = d;i < 600;i =i+d){
    		sum += d*i*i;
    	}
    	System.out.println(sum);
    	}
    }
 }
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Main{
    public static void main(String[] a) throws Exception{
    	int x = 0;
    	double S = 0;
    	int h = 0;
    	int shikaku = 0;
    	double sankaku = 0;
    	Scanner scan = new Scanner(System.in);
    	while (true){ 
    	x = scan.nextInt();
    	h = scan.nextInt();
    	if (x == 0 && h == 0){
    		break;
    	}
    	shikaku = x*x;
    	int hanbun = x/2;
    	double takasa =  Math.sqrt((h*h)+(hanbun*hanbun));
    	sankaku =  (takasa*x/2*4);
    	S = shikaku + sankaku;
    	System.out.println(S);
    	}
    }
}
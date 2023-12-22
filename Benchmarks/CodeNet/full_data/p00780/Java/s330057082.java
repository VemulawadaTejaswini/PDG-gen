import java.io.*;
import java.util.*;

public class Main{
    static boolean n[] = new boolean[32769];
    static int output;
    public static void main(String arg[]){
	Scanner in = new Scanner(System.in);

	n[0] = false;
	n[1] = false;
	for(int i = 2;i<32769;i++){
	    n[i] = true;
	}
	for(int i = 2;i<32769;i++){
	    if(n[i]){
		era(i);
	    }
	}
	while(true) { 
	    output = 0;
	    int input = in.nextInt();
	    if( input == 0 ) break;
	    exec(input);
	    System.out.println(output);
      	}
    }

    public static void era(int input){
	for(int i = input*2;i<32769;i += input){
	    n[i] = false;
	}
    }

    public static void exec(int input){
	for(int i = 2;i<=input/2;i++){
	    if(n[i]){
		if(n[input - i]){
		    output++;
		}
	    }
	}
    }

}
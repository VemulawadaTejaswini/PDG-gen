import java.util.*;
import java.io.*;

public class Main{
public static void main(String[] args){
 int[][][] room = new int[4][3][10]; 
 
 for(int a = 0; a < 4; a++){
	for(int b = 0; b < 3; b++){
		for(int c = 0; c < 10; c++){
			room[a][b][c] = 0;
		}
	}
 }

 try{
 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 	int n = Integer.parseInt(br.readLine());
 
 	for(int i = 0; i < n; i++){
  	 String[] str = br.readLine().split(" ");
	 int b = Integer.parseInt(str[0])-1;
	 int f = Integer.parseInt(str[1])-1;
	 int r = Integer.parseInt(str[2])-1;
	 int v = Integer.parseInt(str[0]);

	 room[b][f][r] += v;
	}
 }catch(IOException e){
System.out.println(e);
}

 for(int a = 0; a < 4; a++){
  if ( a != 0){
     System.out.println("#####################");
  }	
	for(int b = 0; b < 3; b++){
		for(int c = 0; c < 10; c++){
			System.out.print(" " + room[a][b][c]);
		}
	System.out.println();
	}
 }
}
} 
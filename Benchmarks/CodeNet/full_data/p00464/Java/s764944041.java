import java.io.*;
import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args){
    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
    try {
	while(true){
	String[] st = sc.readLine().split(" ");
	int h = Integer.valueOf(st[0]);
	int w = Integer.valueOf(st[1]);
	int n = Integer.valueOf(st[2]);
	if(h==0 && w==0 && h==0) break;
	int[][] map = new int[h][w];
	for(int i=0; i<h; i++){
	String[] sp = sc.readLine().split(" ");
	for(int j=0; j<w; j++){
	if(sp[j].equals("0")) map[i][j] = 0;
	else map[i][j] = 1;
	}
	}
	int i=0, j=0;
	for(int p=0; p<n; p++){
		i = 0; j = 0;
		while(i!=h && j!=w){
		if(map[i][j]==0){ map[i][j] = 1; i++;}
		else{ map[i][j] = 0; j++;}
		}
	}
	System.out.println((i+1)+" "+(j+1));
	}
    }catch(Exception e){
        System.out.println("Error");
    }
    }
}
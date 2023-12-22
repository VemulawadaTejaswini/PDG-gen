package sample;

import java.io.*;
import java.util.*;
public class Main {
	int output[][] = new int[100][100];
	int dataset = 0;//????????°
	int touch = 0;//??£??\??°
	int number = 0;//?????¨?????\?????´???
	String input = null;
	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String []args){
		Main run = new Main();
		run.Run();
	}
	public void Run(){
		for(int z = 0;z < 100;z++){
			for(int y = 0;y < 100;y++){
				output[z][y] = -1;
			}
		}
		while(true){
			try{
				input = read.readLine();
				if(dataset == 0){
					dataset = Integer.parseInt(input);
				}for(int z = 0;z < dataset;z++){
					input = read.readLine();
					String get[] = input.split(" ");
					for(int n = 0; n < get.length;n++){
						if(n == 0)number = Integer.parseInt(get[n]);
						if(n >= 2){
							touch = Integer.parseInt(get[n]);
							output[number-1][touch-1] = 1;
						}
					}
				}for(int z = 0;z < dataset;z++){
					for(int y = 0;y < dataset;y++){
						if(output[z][y] == -1)output[z][y] = 0;
					}
				}break;
			}catch(Exception e){
				
			}
		}
		for(int z = 0;z < dataset;z++){
			for(int y = 0;y < dataset;y++){
				if(y != dataset-1)System.out.print(output[z][y]+" ");
				else System.out.println(output[z][y]);
			}
		}
	}
}
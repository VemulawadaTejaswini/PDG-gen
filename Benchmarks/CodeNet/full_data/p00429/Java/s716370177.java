import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		int count = 0;
		String mojiretu = null;
		String temp = "";

		Scanner stdIn = new Scanner(System.in);
		count = stdIn.nextInt();
			mojiretu = stdIn.next();

		for(int i =0;i<count;i++){
			int cnt = 0;
			char chk;
			for(int j=0;j<mojiretu.length();j++){
				chk = mojiretu.charAt(j);
				if(chk == mojiretu.charAt(j)){
					cnt++;
				}
				if((j+1) >= mojiretu.length()){
					temp = temp.concat(Integer.toString(cnt));
					cnt = 0;
					temp = temp.concat(Character.toString(chk));
					break;
				}
				if(chk != mojiretu.charAt(j+1)){
					temp = temp.concat(Integer.toString(cnt));
					cnt = 0;
					temp = temp.concat(Character.toString(chk));
				}
			}
			mojiretu = temp;
			temp = "";
		}
		System.out.println(mojiretu);
	}
}
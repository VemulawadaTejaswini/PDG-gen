import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int opNum = Integer.parseInt(scan.nextLine());
		int cnt = 0;
		while(cnt < opNum){
			String tmp = scan.nextLine();
			String[] ops = tmp.split(" ");
			if(ops[0].equals("print")){
				print(Integer.parseInt(ops[1]),Integer.parseInt(ops[2]),str);
			}else if(ops[0].equals("replace")){
				str = replace(Integer.parseInt(ops[1]),Integer.parseInt(ops[2]), str, ops[3]);
			} else if(ops[0].equals("reverse")){
				str = reverse(Integer.parseInt(ops[1]),Integer.parseInt(ops[2]),str);
			}
			cnt++;
		}
	}

	public static void print(int i,int j,String str){
		String tmp = str.substring(i,j + 1);
		System.out.println(tmp);
	}

	public static String replace(int i,int j,String str,String rep){
		String first;
		String second;
		if(j == str.length() - 1){
			second = "";
		}else{
			second = str.substring(j + 1, str.length());
		}
		if(i == 0){
			first = "";
		}
		else{
			first = str.substring(0, i);
		}
		return str = first + rep + second;
	}

	public static String reverse(int i,int j,String str){
		String first;
		String second;
		if(j == str.length() - 1){
			second = "";
		}else{
			second = str.substring(j + 1, str.length());
		}
		if(i == 0){
			first = "";
		}
		else{
			first = str.substring(0, i);
		}
		String inside = str.substring(i ,j + 1);
		String n = "";
		for(int s = inside.length() - 1;s >= 0;s--){
			n += inside.charAt(s);
		}
		return first + n + second;
	}
}


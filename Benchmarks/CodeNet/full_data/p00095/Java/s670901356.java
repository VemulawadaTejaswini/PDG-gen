import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int temp[] = new int[21];
		for(int i = 0; i < n; i++){
			int num = sc.nextInt();
			temp[num] = Math.max(sc.nextInt(),temp[num]);
			max = Math.max(max, temp[num]);
		}
		for(int i = 1; i < temp.length; i++){
			if(max == temp[i]){
				System.out.println(i + " " +  temp[i]);
				break;
			}
		}
		
	}
}
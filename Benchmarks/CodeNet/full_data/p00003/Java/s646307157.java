import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		IsitATriangle();
	}
	
	public static void IsitATriangle(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[]triangle = new int[3];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++)triangle[j]=scan.nextInt();
			Arrays.sort(triangle);
			if(triangle[0]*triangle[0]+triangle[1]*triangle[1]==triangle[2]*triangle[2])
				System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
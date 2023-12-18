import java.util.Arrays;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static int[] first = splitInt(sc.nextLine(), " ");
	public static int[][] array2 = new int[first[0]][1];
	public static int result;
	
	public static void main(String[] args) {
		for(int i=0; i<first[1]; i++) {
			array2[i]  = splitInt(sc.nextLine(), " ");
		}
		
		int min = 0;
		int max = first[0];
		
		for(int i=0; i<first[1]; i++) {
			if(min<array2[i][0]) {
				min = array2[i][0];
			}
			if(max>array2[i][1]) {
				max = array2[i][1];
			}
		}
		result = max-min+1;
		if(result<0) {
			System.out.println(0);
		}else {
			System.out.println(result);	
		}
		
	}
	public static String[] array4 = new String[2];
	public static int[] array5 = new int[2];
	public static int[] splitInt(String str, String split) {
		array4 = str.split(split);
		array5 = new int[array4.length];
	
		for(int i=0; i<array4.length; i++) {
				array5[i] = Integer.parseInt(array4[i]);
		}
		return array5;
	}
}
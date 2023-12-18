import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		if(D==25){
			System.out.print("Christmas");
		}else if(D==24){
			System.out.print("Christmas Eve");
		}else if(D==23){
			System.out.print("Christmas Eve Eve");
		}else if(D==22){
			System.out.print("Christmas Eve Eve Eve");
		}
	}	
}
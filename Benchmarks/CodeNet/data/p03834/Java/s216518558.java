import java.util.*;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] aa = line.split(",");
		System.out.print(aa[0]);
		for(int i =1;i< aa.length;i++){
			System.out.print(" "+aa[i]);
		}
		System.out.println();
	}
}
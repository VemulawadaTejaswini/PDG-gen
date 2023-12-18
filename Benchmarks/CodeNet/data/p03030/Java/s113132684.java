import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Col{
	int id;
	String name;
	int num;
	Col(String name,String num, int id){
		this.name = name;
		this.num = Integer.parseInt(num);
		this.id = id;
	}
}
class Com implements Comparator<Col> {
	@Override
	public int compare(Col c1, Col c2) {
		int swi = c1.name.compareTo(c2.name);
		if(swi<=-1) {
			return -1;
		}else if(swi>=1) {
			return 1;
		}else if(c1.num < c2.num) {
			return 1;
		}else {
			return -1;
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] first = splitInt(sc.nextLine(), " ");
		
		String[] a = new String[2];
		Col[] cArray = new Col[first[0]];
		for(int i=0; i<first[0]; i++) {
			a = sc.nextLine().split(" ");
			cArray[i] = new Col(a[0], a[1], i+1);
		}
		Arrays.sort(cArray,new Com());
		for(Col c:cArray) {
			 System.out.println(c.id);
		}
		
	}
	public static int[] splitInt(String str, String split) {
		String[] array = str.split(split);
		int[] array2 = new int[array.length];
	
		for(int i=0; i<array.length; i++) {
				array2[i] = Integer.parseInt(array[i]);
		}
		return array2;
	}
}
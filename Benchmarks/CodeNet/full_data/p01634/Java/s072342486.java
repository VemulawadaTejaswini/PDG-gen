import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] c = sc.next().toCharArray();
		int[] a = new int[3];
		
		if(c.length>=6){	
			for(int i=0;i<c.length;i++){
				if(Character.isUpperCase(c[i])) a[0]++;
				else if(Character.isLowerCase(c[i])) a[1]++;
				else a[2]++;
			}
		}
		
		if(c.length>=6 && a[0]>0 && a[1]>0 && a[2]>0) System.out.println("VALID");
		else System.out.println("INVALID");
	}	
}
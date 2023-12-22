import java.util.*;

class Int implements Comparable<Int>{
	public int i;
	Int(int i){this.i = i;}
	public int compareTo (Int I){return I.i - this.i;}
}

public class Main {
	
	public static void main(String[] args) {

		//input
		Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
		String[] s = sc.next().split("\\s");
		Int[] ar = new Int[5];
		for(int i=0;i<5;i++){ar[i] = new Int(Integer.parseInt(s[i]));}
		
		//calculation
		Arrays.sort(ar);
		
		//output
		for(int i=0;i<5;i++){
			System.out.print(ar[i].i);
			if(i < 4){System.out.print(" ");}
		}
		System.out.println();
	}
}
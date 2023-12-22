import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
		String str = sc.next();
		String[] a = str.split(",",0);
		double[] b = new double[3];
		for(int i = 0; i < 3; i++)
			b[i] = Double.parseDouble(a[i]);
		
		if(b[1]/(b[2]*b[2]) >= 25)System.out.println((int)b[0]);
	}
}
}
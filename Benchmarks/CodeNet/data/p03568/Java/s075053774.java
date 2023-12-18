import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++){
			a[i] = scn.nextInt();
		}
      	int check = 0;
      	for(int i=0; i<a.length; i++){
			if(a[i]%2==0) check=1;
		}
      	if(check==0) System.out.println("0");
      	else System.out.println(Math.pow(2,n));
	}
}

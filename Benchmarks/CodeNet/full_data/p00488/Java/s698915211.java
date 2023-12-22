import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    int p = sc.nextInt();
		int p1 = sc.nextInt();
		int p2 = sc.nextInt();
		int j = sc.nextInt();
		int j1 = sc.nextInt();
		int pmin = p,jmin = j;
		if(p1 < pmin){
			pmin = p1;
		}else if(p2 < pmin){
			pmin = p2;
		}
		if(j1 < jmin){
			jmin = j1;
		}
		System.out.println((pmin+jmin)-50);
	}

}
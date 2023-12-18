import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long tab[] = new long[n];
		for(int i = 0 ; i < n;i++) {
			tab[i] = sc.nextLong();
		}
		int i = 0;
		long somme1 =0;
		long somme2 =0;
		long somme3 =0;
		long somme4 =0;
		while(i < n) {
			somme1+=tab[tab.length-1-i];
			somme2+=tab[i];
			somme3+=tab[i+1];
			somme4+=tab[tab.length-2-i];
			System.out.println("Somme avec i = "+i+" / et somme = "+somme1);
			i+=2;
		}
		System.out.println(Math.max(Math.max(somme1, somme2), Math.max(somme3, somme4)));
	}

}

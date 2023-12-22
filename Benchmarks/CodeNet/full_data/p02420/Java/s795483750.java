import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args) {
		sc= new Scanner(System.in);
		int i=0,j=0;
		int count=0;
		int m[]=new int[300];
		int h[][]=new int[10][300];
		String card[] =new String[300];
		for(;;) {
			card[i]=sc.next();
			if(card[i].equals("-")) {
				break;
			}
			m[i]=sc.nextInt();
			for(j=0;j<m[i];j++) {
				h[i][j]=sc.nextInt();
			}
			i++;
			count++;
		}
		
		
		for(i=0;i<count;i++) {
			for(j=0;j<m[i];j++) {
			String s1 = card[i].substring(0,h[i][j]);
			String s2 = card[i].substring(h[i][j]);
			card[i]=s2+s1;
			}
			System.out.println(card[i]);
		}	
	}
}


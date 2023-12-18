import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int l =sc.nextInt();
		String temp="";
		
		String [] s = new String[n];
		s[0]=sc.nextLine();
		for(int i=0 ; i<n ; i++) {
			s[i]=sc.nextLine();
		}
		
		for(int i = 0; i<n ; i++ ) {
			for(int j=0 ; j<n ; j++) { 
				if(s[i].charAt(0)<s[j].charAt(0)) {
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
				for(int k =1 ; k<l ; k++) {
					if(s[i].charAt(k)<s[j].charAt(k) && s[i].charAt(k-1)<s[j].charAt(k-1)) {
						temp=s[i];
						s[i]=s[j];
						s[j]=temp;
					}
				}
			}
		}
		for(int i = 0 ; i<n ; i++)
			System.out.print(s[i]);
		
		sc.close();

	}

}
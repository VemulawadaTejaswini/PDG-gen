import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		
		int same=0;
		int i;
		if(s.equals(t)){
			System.out.println(s);
		} else{
			for(i=0;i<N-1;i++){
				if(s.substring(N-1-i).equals(t.substring(0,i+1))) same=i+1;
			}
			
			System.out.println(s+t.substring(same));
		}

	}

}
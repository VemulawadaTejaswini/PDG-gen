import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		sc.close();
		
		for(int i=0; i<n; i++){
			switch(s.charAt(i)){
			case 'a':
				if(a>0){
					System.out.println("Yes");
					a--;
				}else if(b>0){
					System.out.println("Yes");
					b--;
				}else{
					System.out.println("No");
				}
				break;
			case 'b':
				if(b>0){
					System.out.println("Yes");
					b--;
				}else{
					System.out.println("No");
				}
				break;
			case 'c':
				System.out.println("No");
				break;
			}
		}
	}

}
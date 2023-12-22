import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int m,n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		String[] ids = new String[n];
		int[] doors = new int[n];
		for(int i=0;i<n;i++){
			ids[i] = sc.next();
			doors[i] = 1;
		}
		m = sc.nextInt();
		for(int i=0;i<m;i++){
			String pass = sc.next();
			for(int j=0;j<n;j++){
				if(ids[j].equals(pass)){
					switch(doors[j]){
					case 1:
						doors[j] = 0;
						System.out.println("Opened by " + pass);
						break;
					default:
						doors[j] = 1;
						System.out.println("Closed by " + pass);
						break;
					}
					break;
				}
				else if(j == n-1){
					System.out.println("Unknown " + pass);
				}
			}
		}
	}
}
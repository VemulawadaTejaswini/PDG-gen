import java.util.Scanner;
public class Main {
	static int count = 0;
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		
		boolean[] check = new boolean[10000000];
		for(int i=0;i<check.length;i++) check[i] = false;
		
		int n = Integer.parseInt(sc2.nextLine());
		String[] s = sc2.nextLine().split("[\\s]+");
		for(int i=0;i<n;i++) check[Integer.parseInt(s[i])] = true;
		
		
		int n2 = Integer.parseInt(sc2.nextLine());
		String[] s2 = sc2.nextLine().trim().split("[\\s]+");
		
		for(int i=0;i<n2;i++){
			if(check[Integer.parseInt(s2[i])]){
				count++;
				check[Integer.parseInt(s2[i])] = false;
			}
			
		}
		System.out.println(count);
	}
}
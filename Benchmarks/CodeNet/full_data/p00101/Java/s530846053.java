import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = 0;
		
		
		while(sc.hasNext()){
			String str = (sc.nextLine()).replace("Hoshino", "Hoshina");
			System.out.print(str);
			if(f != 0){
				System.out.println();
			} else {
				f = 1;
			}
		}
	}
	
	public static void main(String[] args){
		Main test = new Main();
	}
}
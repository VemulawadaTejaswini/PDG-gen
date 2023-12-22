import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		while(true){
			String str = sc.nextLine();
			if(str.equals("END OF INPUT")){
				break;
			}
			
			System.out.println(str);
			String[] s = str.split(" ");
			
			for(String st: s){
				System.out.print(st.length());
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		Main test = new Main();
	}
}
import java.util.Scanner;

public class p1042{
	public p1042(){
		Scanner sc = new Scanner(System.in);
		while(true){
			String str = sc.nextLine();
			if(str.equals("END OF INPUT")){
				break;
			}
			
			str.replaceAll("  ", " sasami ");
			System.out.println(str);
			String[] s = str.split(" ");
			
			for(String st: s){
				if(st.equals("sasami")){
					System.out.print("0");
				} else {
					System.out.print(st.length());
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		p1042 test = new p1042();
	}
}
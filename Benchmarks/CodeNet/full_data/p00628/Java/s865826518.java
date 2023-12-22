import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			String[] s = sc.nextLine().split(" ");
			if(s[0].compareTo("END")==0 && s[1].compareTo("OF")==0 && s[2].compareTo("INPUT")==0)break;
			for(int i=0;i<s.length;i++){
				System.out.print(s[i].length());
			}
			System.out.println();
		}
	}	
}
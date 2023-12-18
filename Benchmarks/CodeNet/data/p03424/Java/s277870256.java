import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> s=new ArrayList<String>();
		for (int i=0;i<(n+1);i++){
			s.add(sc.nextLine());
		}
		
		String answer="Three";
		for (String arare:s){
			if(arare.equals("Y")){
				answer="Four";
			}
		}
		System.out.println(answer);
	}
}		
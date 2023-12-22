import java.util.*;
public class MainD{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String stone = sc.next();
		
		int sta = 0;
		int count = 0;
		
		for(int i = 0; i < stone.length(); i++){
			if(stone.charAt(i) == W){
				count++;
			}
		}
		
		if((stone.charAt(i)).equals("R") && (stone.charAt(stone.length() -1)).equals("W")){
				count--;
		}
		
		System.out.println(count);
	}
}
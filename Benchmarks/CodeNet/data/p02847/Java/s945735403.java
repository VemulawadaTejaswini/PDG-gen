import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String[] days = {"", "SAT", "FRI", "THU", "WED", "TUE", "MON", "SUN"};
		for(int i=1; i<days.length; i++){
			if(days[i].equals(s)){
				System.out.println(i);
				break;
			}
		}
	}
}

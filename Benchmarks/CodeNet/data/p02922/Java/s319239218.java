import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		for(int i=0; ; i++){
			if(i * (a - 1) + 1 >= b){
				System.out.println(i);
				break;
			}
		}
	}
}

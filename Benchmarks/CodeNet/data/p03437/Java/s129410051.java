import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result = -1;
		if(x % y != 0){
			for(int i=x; ; i+=8){
				if(i % y != 0){
					result = i;
					break;
				}
			}
		}
		
		System.out.println(result);
	}
}

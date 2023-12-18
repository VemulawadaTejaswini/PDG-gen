import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next()) - 1;
		int b = Integer.parseInt(sc.next());
		if(a + 1 >= b){
			System.out.println(1);
		}else{
			for(int i=2; ; i++){
				if(a * i + 1 >= b){
					System.out.println(i);
					break;
				}
			}
		}
	}
}

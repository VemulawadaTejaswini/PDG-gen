import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next()) - 1;
		int b = Integer.parseInt(sc.next());
		int result = a + 1;
		if(result >= b){
			System.out.println(1);
		}else{
			for(int i=1; ; i++){
				if(result + a * i >= b){
					System.out.println(i + 1);
					break;
				}
			}
		}
	}
}

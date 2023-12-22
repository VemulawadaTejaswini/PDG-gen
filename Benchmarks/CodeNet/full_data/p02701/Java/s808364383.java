import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
	int N;
 String st[];    
 Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    int i=0;
    ArrayList<String> strList = new ArrayList<String>();
    do {
    strList.add(sc.next());
}while(i<N);
    System.out.println(strList.stream().collect(
            Collectors.groupingBy(x -> x, Collectors.counting())));
    
	}
	
	
	
	
	
	}
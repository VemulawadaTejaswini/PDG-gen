import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
      	for(int cnt = 0;cnt < 5;cnt++){
        	list.add(sc.nextInt());
        }
      	System.out.println(list.indexOf(0) + 1);
	}
}
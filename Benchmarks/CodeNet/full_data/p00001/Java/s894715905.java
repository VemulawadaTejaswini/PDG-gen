import java.util.*;
public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	List<Integer> list = new ArrayList<Integer>();
	for(int i = 0; i < 10; i++){
	    list.add(scan.nextInt());
	}

	Collections.sort(list);
	System.out.println(list.get(list.size()-1));
	System.out.println(list.get(list.size()-2));
	System.out.println(list.get(list.size()-3));
    }
}
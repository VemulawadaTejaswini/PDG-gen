import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
	    List<Integer> list = new ArrayList<>();
	    list.add(a);
	    list.add(b);
	    list.add(c);
	    
	    if(list.contains(5)) {
	    	list.remove(list.indexOf(5));
	    	if(list.contains(5)) {
	    		list.remove(list.indexOf(5));
	    		if(list.contains(7)) {
	    			list.remove(list.indexOf(7));
	    			System.out.println("YES");
	    		} else {
	    			System.out.println("NO");
	    		}
	    	}else {
	    		System.out.println("NO");
	    	}
	    } else {
	    	System.out.println("NO");
	    }
		
	}

}
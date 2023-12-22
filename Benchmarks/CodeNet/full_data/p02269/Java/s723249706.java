import java.util.*;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);
	String s1, s2;
	int n;
	ArrayList<String> a;

	while(sc.hasNext()){
	    n = sc.nextInt();
	    a = new ArrayList<String>();
	    for(int cs = 0; cs < n; ++cs){
		s1 = sc.next(); s2 = sc.next();
		if(s1.equals("insert")) a.add(s2);
		else if(a.contains(s2)) System.out.println("yes");
		else System.out.println("no");
	    }
	}
    }

    public static void main(String[] args){
        new Main();
    }
}
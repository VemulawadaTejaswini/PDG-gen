import java.util.*;
//import 

class Main{

    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	String s,s2;
	int n,de=0;
	s = in.next();
	n = in.nextInt();
	for(int i=0;i<n;i++)
	    {
		s2 = in.next();
		s2 = s2 + s2.charAt(0);
		if(s2.contains(s))de++;

	    }
	System.out.println(de);

    }

}
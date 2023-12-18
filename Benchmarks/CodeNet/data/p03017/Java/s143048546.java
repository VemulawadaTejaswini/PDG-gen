import java.util.*;
public class Main {
    static int n;
    static int a;
    static int b;
    static int c;
    static int d;
    static int p;
    static int q;
    static String s;
    static boolean k = false;
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	d = sc.nextInt();

	System.out.println(n+" " + a + "  " + b + " " + c + " " + d );

	s = sc.next();

	p = a;
	q = b;

	if(c>d) {
	    while(true) {
		boolean t = false;
		
		while(a != c ) {
		    if(checkA()!=0){
			moveA(checkA());
			t = true;
		    }else {		
			break;		
		    }
		}
				
		if( b != d && checkB()!=0){
		    moveB(checkB());
		    t = true;		    
		}
		
		 
		if(!t) {
		    System.out.println("No");
		    break;
		}
		if(a == c && b == d ){
		    System.out.println("Yes");
		    break;
		}
	    
	    }

	}else {
	     while(true) {
		boolean t = false;
		
		while(b != d ) {
		    if(checkB()!=0){			
			moveB(checkB());
			t = true;
		    }else {			
			break;		
		    }
		}
		
		if( a != c && checkA()!=0){
		    moveA(checkA());
		    t = true;
		}
		
		 
		if(!t) {
		    System.out.println("No");
		    break;
		}
		if(a == c && b == d ){
		    System.out.println("Yes");
		    break;
		}
	    
	    }
	}
    }


    static int  checkA() {
	int r = 0;
	p = a+1;
	if (p<=n) {
	  
	    //System.out.println(p + "p=a+1:"+s.charAt(p-1));
	    if (p != b && s.charAt(p-1) != '#') {
		r = 1;
		return r;
	    }	else {
		p = a + 2;
		if(p<=(n-1)) {
		    
		    //System.out.println(p + "p=a+2:"+s.charAt(p-1));
		    if (p != b && s.charAt(p-1) != '#') {
			r = 2;
			return r;	       
		    }
		}
	    }
	}
	return r;
    }

    static void moveA(int r) {
	
	a = a + r;
	//System.out.println("int r:" + r + " moved a :" + a);
    }

    
    static int  checkB() {
	int r = 0;
	q = b+1;
	if (q<=n) {
	    q = b+1;
	    //System.out.println(q + "q=b+1:"+s.charAt(q-1));
	    if (q != a && s.charAt(q-1) != '#') {
		r = 1;
		
		return r;
	    }else {
		q = b + 2;
		if(q<=n-1) {
		    
		    //System.out.println(q + "q=b+2:"+s.charAt(q-1));
		    if (q != a && s.charAt(q-1) != '#') {
			r = 2;			
			return r;
		    }
		}
	    }
	}
	return r;
    }

    static void moveB(int r) {
	b = b + r;
	//System.out.println("int r:" + r + " moved b :" + b);
    }
    
}	   

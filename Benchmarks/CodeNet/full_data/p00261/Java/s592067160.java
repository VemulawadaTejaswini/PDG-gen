import java.util.*;
class Main{
    public static void main(String[] args){
	new Main().run();
    }

    void run(){
	Scanner sc = new Scanner(System.in);
	setCities();
	while(sc.hasNext())
	    solve(sc.next().toCharArray());
    }

    void solve(char[] c){
	if(c[0]=='#') return;
	City now = A;
	for(int i=0; i<c.length; i++){
	    now = now.getCity(c[i]);
	    if(now==null){
		System.out.println("No");
		return;
	    }
	}
	System.out.println(now.getName()=='B' ? "Yes":"No");
    }

    City A, X, Y, Z, W, B;

    void setCities(){
	A = new City('A');
	X = new City('X');
	Y = new City('Y');
	Z = new City('Z');
	W = new City('W');
	B = new City('B');

	A.setCity('0', X);
	A.setCity('1', Y);

	X.setCity('1', Z);

	Y.setCity('0', X);

	Z.setCity('0', W);
	Z.setCity('1', B);

	W.setCity('0', B);
	W.setCity('1', Y);
	
	B.setCity('0', Y);
	B.setCity('1', X);
	
    }

    class City{
	private char name;
	private City zero, one;
	City(char n){
	    name = n;
	    zero = null;
	    one = null;
	}

	void setCity(char num, City c){
	    if(num=='0') zero = c;
	    else one = c;
	}
	char getName(){ return name; }
	City getCity(char i){
	    if(i=='0') return zero; 
	    else return one;
	}
    }
}
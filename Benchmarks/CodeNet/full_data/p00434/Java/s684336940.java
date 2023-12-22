import java.util.*;

class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		Vector<Integer> attend = new Vector<Integer>();
		for(int i=1; i<=30; i++)
			attend.add(new Integer(i));
		for(int i=0; i<28; i++){
			Integer e = new Integer(in.nextInt());
			attend.remove(e);
		}
		System.out.printf("%d\n%d\n", attend.elementAt(0), attend.elementAt(1));
	}
}
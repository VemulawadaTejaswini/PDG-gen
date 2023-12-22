import java.io.*;
import java.util.*;

public class Main {
	static public void main(String[] argv) {
		try{
//			FileReader file_in = new FileReader("test.txt");
//			BufferedReader d = new BufferedReader( file_in );
			BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
	
			while(true) {
				String buf = d.readLine();
				
				int num = Integer.valueOf(buf);
				if( num == 0 ) break;
				
				Dice dice = new Dice();
				int res = 1;
				
				for(int i = 0; i < num; i++) {
					buf = d.readLine();
					res += dice.operation(buf);
				}
				
				System.out.println(res);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class Dice {
	private int _top;
	private int _north;
	private int _east;
	
	public Dice() {
		_top = 1;
		_north = 5;
		_east = 3;
	}
	
	public int operation(String order) {
		if( order.equals("North") ) {
			return north();
		} else if( order.equals("South") ) {
			return south();
		} else if( order.equals("East") ) {
			return east();
		} else if( order.equals("West") ) {
			return west();
		} else if( order.equals("Left") ) {
			return left();
		} else if( order.equals("Right") ) {
			return right();
		}
		
		System.out.println("error: invalid order.");
		return 65535;
	}
	
	private int north() {
		int tmp = _north;
		_north = _top;
		_top = 7-tmp;
		return _top;
	}
	
	private int south() {
		int tmp = _north;
		_north = 7-_top;
		_top = tmp;
		return _top;
	}
	
	private int east() {
		int tmp = _east;
		_east = _top;
		_top = 7-tmp;
		return _top;
	}
	
	private int west() {
		int tmp = _east;
		_east = 7-_top;
		_top = tmp;
		return _top;
	}
	
	private int left() {
		int tmp = _north;
		_north = _east;
		_east = 7-tmp;
		return _top;
	}
	
	private int right() {
		int tmp = _north;
		_north = 7-_east;
		_east = tmp;
		return _top;
	}
}
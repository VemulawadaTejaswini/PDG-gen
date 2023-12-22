
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String...args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int[]a = new int[6];

		for(int i = 0; i < s.length; i++) {
			a[i] = Integer.parseInt(s[i]);
		}

		String order = br.readLine();

		for(int i = 0; i < Integer.valueOf(order); i++) {
		   String[] topFront = br.readLine().split(" ");
		   int top = Integer.valueOf(topFront[0]);
		   int front = Integer.valueOf(topFront[1]);
		   System.out.println(new Dice(top , front ,a).RIGHT); 
		}
	}
}
class Dice{
	int TOP,BOTTOM,LEFT,RIGHT,FRONT,BACK;

	Dice(int[] a) {
		this.TOP = a[0];
		this.FRONT = a[1];
		this.RIGHT = a[2];
		this.LEFT = a[3];
		this.BACK = a[4];
		this.BOTTOM = a[5];
	}
	Dice(int top , int front ,int[]a){
			if(top == a[0]) {
					this.TOP = a[0];
					this.BOTTOM = a[5];
			} else if(top == a[1]) {
					this.TOP = a[1];
					this.BOTTOM = a[4];
			} else if(top == a[2]) {
					this.TOP = a[2];
					this.BOTTOM = a[3];
			} else if(top == a[3]) {
					this.TOP = a[3];
					this.BOTTOM = a[2];
			} else if(top == a[4]) {
					this.TOP = a[4];
					this.BOTTOM = a[1];
			} else if(top == a[5]) {
					this.TOP = a[5];
					this.BOTTOM = a[0];
			}
			if(front == a[0]) {
					this.FRONT = a[0];
					this.BACK = a[5];
			} else if(front == a[1]) {
					this.FRONT = a[1];
					this.BACK = a[4];
			} else if(front == a[2]) {
					this.FRONT = a[2];
					this.BACK = a[3];
			} else if(front == a[3]) {
					this.FRONT = a[3];
					this.BACK = a[2];
			} else if(front == a[4]) {
					this.FRONT = a[4];
					this.BACK = a[1];
			} else if(front == a[5]) {
					this.FRONT = a[5];
					this.BACK = a[0];
			}
			if(this.TOP == a[0]) {
				if(this.FRONT == a[1]) {
							this.RIGHT = a[2];
							this.LEFT  = a[3];
				}else if(this.FRONT == a[2]) {
							this.RIGHT = a[4];
							this.LEFT  = a[1];
				}else if(this.FRONT == a[3]) {
							this.RIGHT = a[1];
							this.LEFT  = a[4];
				}else if(this.FRONT == a[4]) {
							this.RIGHT = a[3];
							this.LEFT  = a[2];
				}
			} else if(this.TOP ==a[1]) {
				if(this.FRONT == a[0]) {
							this.RIGHT = a[3];
							this.LEFT  = a[2];
				} else if(this.FRONT == a[2]) {
							this.RIGHT = a[0];
							this.LEFT  = a[5];
				} else if(this.FRONT == a[3]) {
							this.RIGHT = a[5];
							this.LEFT  = a[0];
				} else if(this.FRONT == a[5]) {
							this.RIGHT = a[2];
							this.LEFT  = a[3];
				}
			} else if(this.TOP ==a[2]) {
				if(this.FRONT == a[0]) {
							this.RIGHT = a[1];
							this.LEFT  = a[4];
				} else if(this.FRONT == a[1]) {
							this.RIGHT = a[5];
							this.LEFT  = a[0];
				} else if(this.FRONT == a[4]) {
							this.RIGHT = a[0];
							this.LEFT  = a[5];
				} else if(this.FRONT == a[5]) {
							this.RIGHT = a[4];
							this.LEFT  = a[1];
				}
			} else if(this.TOP ==a[3]) {
				if(this.FRONT == a[0]) {
							this.RIGHT = a[4];
							this.LEFT  = a[1];
				} else if(this.FRONT == a[1]) {
							this.RIGHT = a[0];
							this.LEFT  = a[5];
				} else if(this.FRONT == a[4]) {
							this.RIGHT = a[5];
							this.LEFT  = a[0];
				} else if(this.FRONT == a[5]) {
							this.RIGHT = a[1];
							this.LEFT  = a[4];
				}
			} else if(this.TOP ==a[4]) {
				if(this.FRONT == a[0]) {
							this.RIGHT = a[2];
							this.LEFT  = a[3];
				} else if(this.FRONT == a[2]) {
							this.RIGHT = a[5];
							this.LEFT  = a[0];
				} else if(this.FRONT == a[3]) {
							this.RIGHT = a[0];
							this.LEFT  = a[5];
				} else if(this.FRONT == a[5]) {
							this.RIGHT = a[3];
							this.LEFT  = a[2];
				}
			} else if(this.TOP ==a[5]) {
				if(this.FRONT == a[1]) {
							this.RIGHT = a[3];
							this.LEFT  = a[2];
				} else if(this.FRONT == a[2]) {
							this.RIGHT = a[1];
							this.LEFT  = a[4];
				} else if(this.FRONT == a[3]) {
							this.RIGHT = a[4];
							this.LEFT  = a[1];
				} else if(this.FRONT == a[4]) {
							this.RIGHT = a[2];
							this.LEFT  = a[3];
				}
			}
		}
		

	void turnS() {
		int tmp = this.TOP;
		this.TOP = this.BACK;
		this.BACK = this.BOTTOM;
		this.BOTTOM = this.FRONT;
		this.FRONT = tmp;
	}
	void turnN() {
		int tmp = this.TOP;
		this.TOP = this.FRONT;
		this.FRONT = this.BOTTOM;
		this.BOTTOM = this.BACK;
		this.BACK = tmp;
	}
	void turnW() {
		int tmp = this.TOP;
		this.TOP = this.RIGHT;
		this.RIGHT = this.BOTTOM;
		this.BOTTOM = this.LEFT;
		this.LEFT = tmp;
	}
	void turnE() {
		int tmp = this.TOP;
		this.TOP = this.LEFT;
		this.LEFT = this.BOTTOM;
		this.BOTTOM = this.RIGHT;
		this.RIGHT = tmp;
	}
}

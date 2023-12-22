import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	void run() {

		int h,o,n = Integer.valueOf(sc.next());

		for (; n>0; n--,System.out.println(h>>2)) {

			for (h = 0, o = 0; o < 3;) {

				switch (sc.next().charAt(1)) {

				case 'I':

					h++;

					if((h&3)==0) h |= 3;

					break;

				case 'O':

					h += (((h&3)+1)<<2);

					h&=~3;

					break;

				default:

					o++;

					break;

				}

			}

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}
import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	void run() {

		String buffer = sc.nextLine();

		Scanner in = new Scanner(buffer.replace(',', ' ').replace('.', ' '));

		String ans = "";

		for (; in.hasNext();) {

			String tango = in.next();

			if (tango.length() < 3)

				continue;

			if (tango.length() > 6)

				continue;

			ans+=tango+" ";

		}

		System.out.println(ans.trim());

		

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}
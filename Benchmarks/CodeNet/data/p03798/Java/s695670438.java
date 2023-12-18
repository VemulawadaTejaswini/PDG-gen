import java.util.*;

public class Main { // Menagerie
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		String[] sR = new String[n];
		if (String.valueOf(s.charAt(0)).equals("o")) {
			for (int x = 0; x < n; x++) { // assuming first is sheep & both sheep
				if (x == 0) {
					sR[0] = "S";
					sR[n - 1] = "S";
					sR[1] = "S";
				} else if (x == n - 1) { // last animal, determining factor of validity
					if (sR[x] == "S") { // if sheep
						if (String.valueOf(s.charAt(x)).equals("o")) {
							if (sR[x - 1] == sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						} else { // if not same
							if (sR[x - 1] != sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						}
					} else { // if wolf
						if (String.valueOf(s.charAt(x)).equals("o")) { // just a flip of the sheep function
							if (sR[x - 1] != sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						} else {
							if (sR[x - 1]  == sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						}
					}
				} else {
					if (sR[x] == "S") { // if sheep
						if (String.valueOf(s.charAt(x)).equals("o")) { //if same
							sR[x + 1] = sR[x - 1];
						} else { // if not same
							if (sR[x - 1] == "S") {
								sR[x + 1] = "W";
							} else {
								sR[x + 1] = "S";
							}
						}
					} else { // if wolf
						if (String.valueOf(s.charAt(x)).equals("o")) { //if not same
							if (sR[x - 1] == "S") {
								sR[x + 1] = "W";
							} else {
								sR[x + 1] = "S";
							}
						} else { // if same
							sR[x + 1] = sR[x - 1];
						}
					}
				}
			}
			
			for (int x = 0; x < n; x++) { // assuming first is sheep & both wolf
				if (x == 0) {
					sR[0] = "S";
					sR[n - 1] = "W";
					sR[1] = "W";
				} else if (x == n - 1) { // last animal, determining factor of validity
					if (sR[x] == "S") { // if sheep
						if (String.valueOf(s.charAt(x)).equals("o")) {
							if (sR[x - 1] == sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						} else { // if not same
							if (sR[x - 1] != sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						}
					} else { // if wolf
						if (String.valueOf(s.charAt(x)).equals("o")) { // just a flip of the sheep function
							if (sR[x - 1] != sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						} else {
							if (sR[x - 1]  == sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						}
					}
				} else {
					if (sR[x] == "S") { // if sheep
						if (String.valueOf(s.charAt(x)).equals("o")) { //if same
							sR[x + 1] = sR[x - 1];
						} else { // if not same
							if (sR[x - 1] == "S") {
								sR[x + 1] = "W";
							} else {
								sR[x + 1] = "S";
							}
						}
					} else { // if wolf
						if (String.valueOf(s.charAt(x)).equals("o")) { //if not same
							if (sR[x - 1] == "S") {
								sR[x + 1] = "W";
							} else {
								sR[x + 1] = "S";
							}
						} else { // if same
							sR[x + 1] = sR[x - 1];
						}
					}
				}
			}
			
			for (int x = 0; x < n; x++) { // assuming first is wolf & right sheep
				if (x == 0) {
					sR[0] = "W";
					sR[n - 1] = "W";
					sR[1] = "S";
				} else if (x == n - 1) { // last animal, determining factor of validity
					if (sR[x] == "S") { // if sheep
						if (String.valueOf(s.charAt(x)).equals("o")) {
							if (sR[x - 1] == sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						} else { // if not same
							if (sR[x - 1] != sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						}
					} else { // if wolf
						if (String.valueOf(s.charAt(x)).equals("o")) { // just a flip of the sheep function
							if (sR[x - 1] != sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						} else {
							if (sR[x - 1]  == sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						}
					}
				} else {
					if (sR[x] == "S") { // if sheep
						if (String.valueOf(s.charAt(x)).equals("o")) { //if same
							sR[x + 1] = sR[x - 1];
						} else { // if not same
							if (sR[x - 1] == "S") {
								sR[x + 1] = "W";
							} else {
								sR[x + 1] = "S";
							}
						}
					} else { // if wolf
						if (String.valueOf(s.charAt(x)).equals("o")) { //if not same
							if (sR[x - 1] == "S") {
								sR[x + 1] = "W";
							} else {
								sR[x + 1] = "S";
							}
						} else { // if same
							sR[x + 1] = sR[x - 1];
						}
					}
				}
			}
			
			for (int x = 0; x < n; x++) { // assuming first is sheep & right wolf
				if (x == 0) {
					sR[0] = "W";
					sR[n - 1] = "S";
					sR[1] = "W";
				} else if (x == n - 1) { // last animal, determining factor of validity
					if (sR[x] == "S") { // if sheep
						if (String.valueOf(s.charAt(x)).equals("o")) {
							if (sR[x - 1] == sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						} else { // if not same
							if (sR[x - 1] != sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						}
					} else { // if wolf
						if (String.valueOf(s.charAt(x)).equals("o")) { // just a flip of the sheep function
							if (sR[x - 1] != sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						} else {
							if (sR[x - 1]  == sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						}
					}
				} else {
					if (sR[x] == "S") { // if sheep
						if (String.valueOf(s.charAt(x)).equals("o")) { //if same
							sR[x + 1] = sR[x - 1];
						} else { // if not same
							if (sR[x - 1] == "S") {
								sR[x + 1] = "W";
							} else {
								sR[x + 1] = "S";
							}
						}
					} else { // if wolf
						if (String.valueOf(s.charAt(x)).equals("o")) { //if not same
							if (sR[x - 1] == "S") {
								sR[x + 1] = "W";
							} else {
								sR[x + 1] = "S";
							}
						} else { // if same
							sR[x + 1] = sR[x - 1];
						}
					}
				}
			}
		} else { // if first is x
			for (int x = 0; x < n; x++) { // assuming first is sheep & right sheep
				if (x == 0) {
					sR[0] = "S";
					sR[n - 1] = "W";
					sR[1] = "S";
				} else if (x == n - 1) { // last animal, determining factor of validity
					if (sR[x] == "S") { // if sheep
						if (String.valueOf(s.charAt(x)).equals("o")) {
							if (sR[x - 1] == sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						} else { // if not same
							if (sR[x - 1] != sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						}
					} else { // if wolf
						if (String.valueOf(s.charAt(x)).equals("o")) { // just a flip of the sheep function
							if (sR[x - 1] != sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						} else {
							if (sR[x - 1]  == sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						}
					}
				} else {
					if (sR[x] == "S") { // if sheep
						if (String.valueOf(s.charAt(x)).equals("o")) { //if same
							sR[x + 1] = sR[x - 1];
						} else { // if not same
							if (sR[x - 1] == "S") {
								sR[x + 1] = "W";
							} else {
								sR[x + 1] = "S";
							}
						}
					} else { // if wolf
						if (String.valueOf(s.charAt(x)).equals("o")) { //if not same
							if (sR[x - 1] == "S") {
								sR[x + 1] = "W";
							} else {
								sR[x + 1] = "S";
							}
						} else { // if same
							sR[x + 1] = sR[x - 1];
						}
					}
				}
			}
			
			for (int x = 0; x < n; x++) { // assuming first is sheep & right wolf
				if (x == 0) {
					sR[0] = "S";
					sR[n - 1] = "S";
					sR[1] = "W";
				} else if (x == n - 1) { // last animal, determining factor of validity
					if (sR[x] == "S") { // if sheep
						if (String.valueOf(s.charAt(x)).equals("o")) {
							if (sR[x - 1] == sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						} else { // if not same
							if (sR[x - 1] != sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						}
					} else { // if wolf
						if (String.valueOf(s.charAt(x)).equals("o")) { // just a flip of the sheep function
							if (sR[x - 1] != sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						} else {
							if (sR[x - 1]  == sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						}
					}
				} else {
					if (sR[x] == "S") { // if sheep
						if (String.valueOf(s.charAt(x)).equals("o")) { //if same
							sR[x + 1] = sR[x - 1];
						} else { // if not same
							if (sR[x - 1] == "S") {
								sR[x + 1] = "W";
							} else {
								sR[x + 1] = "S";
							}
						}
					} else { // if wolf
						if (String.valueOf(s.charAt(x)).equals("o")) { //if not same
							if (sR[x - 1] == "S") {
								sR[x + 1] = "W";
							} else {
								sR[x + 1] = "S";
							}
						} else { // if same
							sR[x + 1] = sR[x - 1];
						}
					}
				}
			}
			
			for (int x = 0; x < n; x++) { // assuming first is wolf & both sheep
				if (x == 0) {
					sR[0] = "W";
					sR[n - 1] = "S";
					sR[1] = "S";
				} else if (x == n - 1) { // last animal, determining factor of validity
					if (sR[x] == "S") { // if sheep
						if (String.valueOf(s.charAt(x)).equals("o")) {
							if (sR[x - 1] == sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						} else { // if not same
							if (sR[x - 1] != sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						}
					} else { // if wolf
						if (String.valueOf(s.charAt(x)).equals("o")) { // just a flip of the sheep function
							if (sR[x - 1] != sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						} else {
							if (sR[x - 1]  == sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						}
					}
				} else {
					if (sR[x] == "S") { // if sheep
						if (String.valueOf(s.charAt(x)).equals("o")) { //if same
							sR[x + 1] = sR[x - 1];
						} else { // if not same
							if (sR[x - 1] == "S") {
								sR[x + 1] = "W";
							} else {
								sR[x + 1] = "S";
							}
						}
					} else { // if wolf
						if (String.valueOf(s.charAt(x)).equals("o")) { //if not same
							if (sR[x - 1] == "S") {
								sR[x + 1] = "W";
							} else {
								sR[x + 1] = "S";
							}
						} else { // if same
							sR[x + 1] = sR[x - 1];
						}
					}
				}
			}
			
			for (int x = 0; x < n; x++) { // assuming first is sheep & both wolf
				if (x == 0) {
					sR[0] = "W";
					sR[n - 1] = "W";
					sR[1] = "W";
				} else if (x == n - 1) { // last animal, determining factor of validity
					if (sR[x] == "S") { // if sheep
						if (String.valueOf(s.charAt(x)).equals("o")) {
							if (sR[x - 1] == sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						} else { // if not same
							if (sR[x - 1] != sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						}
					} else { // if wolf
						if (String.valueOf(s.charAt(x)).equals("o")) { // just a flip of the sheep function
							if (sR[x - 1] != sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						} else {
							if (sR[x - 1]  == sR[0]) {
								System.out.println(printArray(sR));
								return;
							}
						}
					}
				} else {
					if (sR[x] == "S") { // if sheep
						if (String.valueOf(s.charAt(x)).equals("o")) { //if same
							sR[x + 1] = sR[x - 1];
						} else { // if not same
							if (sR[x - 1] == "S") {
								sR[x + 1] = "W";
							} else {
								sR[x + 1] = "S";
							}
						}
					} else { // if wolf
						if (String.valueOf(s.charAt(x)).equals("o")) { //if not same
							if (sR[x - 1] == "S") {
								sR[x + 1] = "W";
							} else {
								sR[x + 1] = "S";
							}
						} else { // if same
							sR[x + 1] = sR[x - 1];
						}
					}
				}
			}
		}
		System.out.println("-1");
	}
	
	private static String printArray(String[] array) {
		String s = "";
		for (int x = 0; x < array.length; x++) {
			s += array[x];
		}
		return s;
	}
}
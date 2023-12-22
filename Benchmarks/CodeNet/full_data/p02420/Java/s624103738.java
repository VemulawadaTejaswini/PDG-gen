import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
class ToiN implements Toi{
	public void exec(String[] args){ solve(); }
	public void solve(){
		Tool tool = new Tool();

	}
}
  */

interface Toi {
	public void exec(String[] args);
}

public class Main {
	public static void main(String[] args) {
		Toi toi = new Toi34();
		toi.exec(args);
	}
}

class Tool {
	Scanner sc;
	
	public Tool() {
		sc = new Scanner(System.in);
	}
	
	public void inputArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.nextInt();
			} catch (Exception e) {
				break;
			}
		}
	}
	
	public void inputArray(long[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.nextLong();
			} catch (Exception e) {
				break;
			}
		}
	}
	
	public void inputArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.next();
			} catch (Exception e) {
				break;
			}
		}
	}
	
	public void inputArray(byte[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.nextByte();
			} catch (Exception e) {
				break;
			}
		}
	}
	
	public void inputArray(short[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.nextShort();
			} catch (Exception e) {
				break;
			}
		}
	}
	
	public void inputArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				try {
					array[i][j] = sc.nextInt();
				} catch (Exception e) {
					break;
				}
			}
		}
	}
	
	public void zeroArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				try {
					array[i][j] = 0;
				} catch (Exception e) {
					break;
				}
			}
		}
	}
	
	public void zeroArray(byte[][][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				for (int k = 0; k < array[0][0].length; k++) {
					try {
						array[i][j][k] = 0;
					} catch (Exception e) {
						break;
					}
				}
			}
		}
	}
	
	public void zeroArray(boolean[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				try {
					array[i][j] = false;
				} catch (Exception e) {
					break;
				}
			}
		}
	}
	
	public void zeroArray(boolean[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = false;
			} catch (Exception e) {
				break;
			}
		}
	}
}

class Tool17 extends Tool {
	Scanner sc;
	
	public Tool17() {
		sc = new Scanner(System.in);
	}
	
	public void inputArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.nextInt();
				if (i % 2 == 1 && array[i] == 0 && array[i - 1] == 0) {
					break;
				}
			} catch (Exception e) {
				break;
			}
		}
	}
	
	public void inputArray(long[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.nextInt();
				if (i % 2 == 1 && array[i] == 0 && array[i - 1] == 0) {
					break;
				}
			} catch (Exception e) {
				break;
			}
		}
	}
}

class testTool22 extends Tool {
	Scanner sc;
	String path;
	
	public testTool22(String path) throws FileNotFoundException {
		try {
			sc = new Scanner(new File(path));
		} catch (FileNotFoundException e) {
			return;
		}
	}
	
	public void inputArray(int[][] array) {
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				try {
					String tmp = sc.next();
					if (tmp == null || tmp.equals("") || tmp.equals("\n")) {
						return;
					} else {
						if (j % 2 != 0) {
							array[j][i] = Integer.parseInt(tmp);
						} else {
							array[j][i] = (int) (tmp.charAt(0));
						}
						tmp = "";
					}
				} catch (Exception e) {
					break;
				}
			}
		}
	}
	
	public void inputArray(byte[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.nextByte();
			} catch (Exception e) {
				break;
			}
		}
	}
}

class Tool22 extends Tool {
	Scanner sc;
	String path;
	
	public Tool22() {
		sc = new Scanner(System.in);
	}
	
	public void inputArray(int[][] array) {
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				try {
					String tmp = sc.next();
					if (tmp == null || tmp.equals("") || tmp.equals("\n")) {
						return;
					} else {
						if (j % 2 != 0) {
							array[j][i] = Integer.parseInt(tmp);
						} else {
							array[j][i] = (int) (tmp.charAt(0));
						}
						tmp = "";
					}
				} catch (Exception e) {
					break;
				}
			}
		}
	}
	
	public void inputArray(byte[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.nextByte();
			} catch (Exception e) {
				break;
			}
		}
	}
}

class Tool23 extends Tool {
	public void inputArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				try {
					array[i][j] = sc.nextInt();
				} catch (Exception e) {
					break;
				}
			}
		}
	}
}

class Tool25 extends Tool {
	Scanner sc;
	
	public Tool25() {
		sc = new Scanner(System.in);
	}
	
	public void inputArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				try {
					array[i][j] = sc.nextInt();
					if (j == array[0].length - 1) {
						if (array[i][j] == -1 && array[i][j - 1] == -1 && array[i][j - 2] == -1) {
							return;
						}
					}
				} catch (Exception e) {
					break;
				}
			}
		}
	}
}

class Tool26 extends Tool25 {
	Scanner sc;
	
	public Tool26() {
		sc = new Scanner(System.in);
	}
	
	public void inputArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				try {
					array[i][j] = sc.nextInt();
					if (j == array[0].length - 1) {
						if (array[i][j] == 0 && array[i][j - 1] == 0) {
							return;
						}
					}
				} catch (Exception e) {
					break;
				}
			}
		}
	}
	
	public void initArray(int[][][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				for (int k = 0; k < array[0][0].length; k++) {
					try {
						array[i][j][k] = -1;
					} catch (Exception e) {
						break;
					}
				}
			}
		}
	}
	
	public void sort(int[] sortedArray, int a, int b, int c) {
		sortedArray[0] = a;
		sortedArray[1] = b;
		sortedArray[2] = c;
		int tmp;
		for (int i = 0; i < sortedArray.length - 1; i++) {
			for (int j = i + 1; j <= sortedArray.length - 1; j++) {
				if (sortedArray[i] > sortedArray[j]) {
					tmp = sortedArray[i];
					sortedArray[i] = sortedArray[j];
					sortedArray[j] = tmp;
				}
			}
		}
	}
	
	public void sort(int[] sortedArray) {
		int tmp;
		for (int i = 0; i < sortedArray.length - 1; i++) {
			for (int j = i + 1; j <= sortedArray.length - 1; j++) {
				if (sortedArray[i] > sortedArray[j]) {
					tmp = sortedArray[i];
					sortedArray[i] = sortedArray[j];
					sortedArray[j] = tmp;
				}
			}
		}
	}
}

class Tool27 extends Tool {
	public Tool27() {
		sc = new Scanner(System.in);
	}
	
	public void inputArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = sc.nextInt();
			}
		}
	}
}

class Tool29 extends Tool {
	public Tool29() {
		sc = new Scanner(System.in);
	}
	
	public int inputArrayAndCount(String[] array) {
		sc.useDelimiter(",|\n");
		String tmp;
		int i;
		for (i = 0; i < array.length; i++) {
			try {
				tmp = sc.next();
				array[i] = tmp;
				if (tmp == null || tmp.equals("") || tmp.equals(".+*$")) {
					return i;
				}
			} catch (Exception e) {
				return i;
			}
		}
		return i;
	}
}

class Tool30 extends Tool {
	public Tool30() {
		sc = new Scanner(System.in);
	}
	
	public int inputArrayAndCount(String[] array) {
		String tmp;
		int i;
		for (i = 0; i < array.length; i++) {
			try {
				tmp = sc.next();
				if (tmp.equals("0")) {
					return i;
				}
				if (tmp == null || tmp.equals("")) {
					return i;
				}
				array[i] = tmp;
			} catch (Exception e) {
				return i;
			}
		}
		return i;
	}
}

class Tool31 extends Tool30 {
	Thread th;
	
	public Tool31() {
		sc = new Scanner(System.in);
		th = new Thread();
	}
	
	public int inputArrayAndCount(String[] array) {
		ToolSub31 sub = new ToolSub31(array);
		int i = 0;
		try {
			sub.start();
			th.sleep(300);
			sub.interrupt();
			while (!(array[i] == null)) {
				i++;
			}
		} catch (Exception e) {
			return i;
		}
		return i;
	}
}

class ToolSub31 extends Thread implements Runnable {
	String[] array;
	Scanner sc;
	
	public ToolSub31(String[] recivedArray) {
		sc = new Scanner(System.in);
		array = recivedArray;
	}
	
	public void run() {
		try {
			String tmp;
			int i;
			for (i = 0; i < array.length; i++) {
				try {
					tmp = sc.next();
					array[i] = tmp;
					if ((int) array[i].charAt(array[i].length() - 1) == (int) '.' && !sc.hasNext()) {
						break;
					}
				} catch (Exception e) {
					break;
				}
			}
		} catch (Exception e) {
			return;
		}
	}
}

class Tool32 extends Tool {
	public Tool32() {
		sc = new Scanner(System.in);
	}
	
	public void inputArray(String[] array) {
		sc.useDelimiter("\\.|\\s|\n");
		String tmp;
		int i;
		for (i = 0; i < array.length; i++) {
			try {
				tmp = sc.next();
				if (tmp.equals("END_OF_TEXT")) {
					return;
				}
				if (tmp == null || tmp.equals("")) {
					continue;
				}
				array[i] = tmp;
			} catch (Exception e) {
				continue;
			}
		}
		return;
	}
	
	public String inputWord() {
		String word;
		try {
			word = sc.next();
		} catch (Exception e) {
			return "";
		}
		return word;
	}
}

class Toi34 implements Toi {
	Scanner sc;
	
	public void exec(String[] args) {
		solve();
	}
	
	public Toi34() {
		sc = new Scanner(System.in);
	}
	
	public void solve() {
		Tool32 tool = new Tool32();
		String[] card = new String[10];
		String tmp;
		byte[] m = new byte[card.length];
		short[][] h = new short[10][200];
		char[][] individualCard = new char[10][200];
		for (int i = 0; i < card.length; i++) {
			try {
				tmp = sc.nextLine();
				if (tmp.equals("-")) {
					break;
				} else {
					card[i] = tmp;
					m[i] = sc.nextByte();
					for (int j = 0; j < m[i]; j++) {
						h[i][j] = sc.nextShort();
					}
				}
			} catch (Exception e) {
				continue;
			}
		}
		for (int i = 0; i < individualCard.length; i++) {
			try {
				for (int j = 0; j < card[i].length(); j++) {
					try {
						individualCard[i][j] = card[i].charAt(j);
					} catch (Exception e) {
						break;
					}
				}
			} catch (Exception e) {
				break;
			}
		}
		char[] tmpArray = new char[200];
		for (int i = 0; i < individualCard.length; i++) {
			for (int j = 0; j < m[i]; j++) {
				for (int k = 0; k < h[i][j]; k++) {
					for (int l = 0; l < card[i].length(); l++) {
						if (l > 0) {
							tmpArray[l - 1] = individualCard[i][l];
						} else {
							tmpArray[card[i].length() - 1 - l] = individualCard[i][l];
						}
					}
					for (int l = 0; l < card[i].length(); l++) {
						try {
							individualCard[i][l] = tmpArray[l];
						} catch (Exception e) {
							break;
						}
					}
				}
			}
			try {
				if(i % 2 != 0){
					System.out.println();
				}
				for (int j = 0; j < card[i].length(); j++) {
					System.out.print(individualCard[i][j]);
				}
			}catch (Exception e){
				break;
			}
		}
	}
}

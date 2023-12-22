import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(buf,",");
				int card[] = new int[5];
				for (int i=0;i<5;i++) {
					card[i] = Integer.parseInt(st.nextToken());
				}
				Arrays.sort(card);
				if (isFourCard(card)) System.out.println("four card");
				else if (isFullHouse(card)) System.out.println("full house");
				else if (isStraight(card)) System.out.println("straight");
				else if (isThreeCard(card)) System.out.println("three card");
				else if (isTwoPair(card)) System.out.println("two pair");
				else if (isOnePair(card)) System.out.println("one pair");
				else System.out.println("null"); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean isOnePair(int c[]) {
		if (c[0]==c[1]||c[1]==c[2]||c[2]==c[3]||c[3]==c[4]) return true;
		else return false;
	}

	public static boolean isTwoPair(int c[]) {
		if (c[0]==c[1]) {
			if (c[2]==c[3]||c[3]==c[4]) return true;
		} else if (c[1]==c[2]) {
			if (c[3]==c[4]) return true;
		}
		return false;
	}

	public static boolean isThreeCard(int c[]) {
		for (int i=0;i<3;i++) {
			if (c[i]==c[i+1]&&c[i+1]==c[i+2]) return true;
		}
		return false;
	}

	public static boolean isStraight(int c[]) {
		if (c[0]==1&&c[1]==10) {
			if (c[2]==11&&c[3]==12&&c[4]==13) return true;
		}
		for (int i=0;i<4;i++) {
			if (c[i]+1==c[i+1]) continue;
			else return false;
		}
		return true;
	}

	public static boolean isFullHouse(int c[]) {
		if (c[0]==c[1]&&c[1]==c[2]) {
			if (c[3]==c[4]) return true;
		} else if (c[2]==c[3]&&c[3]==c[4]) {
			if (c[0]==c[1]) return true;
		}
		return false;
	}

	public static boolean isFourCard(int c[]) {
		if (c[0]==c[1]&&c[2]==c[3]&&c[0]==c[2]) return true;
		else if (c[1]==c[2]&&c[3]==c[4]&&c[1]==c[3]) return true;
		else return false;
	}
}
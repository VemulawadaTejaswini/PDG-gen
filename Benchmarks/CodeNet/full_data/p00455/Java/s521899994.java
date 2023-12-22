import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int h_in, m_in, s_in, h_out, m_out, s_out;
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		
			read();
			slove();
			read();
			slove();
			read();
			slove();
	}
	static boolean read(){
		h_in = sc.nextInt();
		m_in = sc.nextInt();;
		s_in = sc.nextInt();
		h_out = sc.nextInt();
		m_out = sc.nextInt();
		s_out = sc.nextInt();
		return true;
	}
	static void slove(){
		int sum = 3600*h_out + 60*m_out + s_out 
				-(3600*h_in + 60*m_in + s_in);
		System.out.print(sum/3600);
		sum = sum%3600;
		System.out.print(" "+ sum/60);
		sum = sum%60;
		System.out.println(" "+ sum);
	}

}
import java.io.IOException;

public class Main {
	/**
	* @param args
	*/
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	o = 0;

		while((o = parseNum()) != 0) {
			o = (o%39==0)?39:o%39;
			System.out.println("3C"+((o<=9)?0:"")+o);
		}
	}

	private static int parseNum() {
		try {
			int	buf = 0;
			int	num = 0;
			int	mns = 0;
			int	skp = 1;

			// -,0〜9以外は読み飛ばす
			while (true) {
				buf = System.in.read();
				if (buf == '-') {
					mns = 1;
					skp = 0;
				} else if (buf >= '0' && buf <= '9') {
					num = num * 10 + (buf - '0');
					skp = 0;
				} else if (skp == 0 || buf == -1) {
					return (mns == 0)?num:num*(-1);
				}
			}
		} catch (IOException e) {}
		return -1;
	}
}
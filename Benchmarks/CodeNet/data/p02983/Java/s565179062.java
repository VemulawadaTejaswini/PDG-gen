import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static private int sample = 0;
	static private InputStream in;
	static private PrintStream out;
	static private Scanner sc;
	static {
		if(sample == 0) {
			in = System.in;
			out = System.out;
		}else {
			try {
				in = new FileInputStream(new File("sample"+sample));
				out = new PrintStream("result"+sample);
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(1);
			}
		}
		sc = new Scanner(in);
	}
	static public boolean fileCompare2(String fileA, String fileB) {
	    boolean bRet = false;
	    try {
	        bRet = Arrays.equals(Files.readAllBytes(Paths.get(fileA)), Files.readAllBytes(Paths.get(fileB)));
	    } catch (IOException e) {
	    }
	    return bRet;
	}
	static public void exit() {
		if(sample!=0) {
			out.close();
			if(fileCompare2("answer"+sample, "result"+sample)) {
				System.out.println("AC");
			}else {
				System.out.println("WA");
			}
		}
		sc.close();
	}
	static public void main(String ...strings ) {
		final int L = sc.nextInt();
		final int R = sc.nextInt();
		int min = Integer.MAX_VALUE;
		for(int i=L;i<=R-1;i++) {
			for(int j=i+1;j<=R;j++) {
				min = Math.min(min, (i*j)%2019);
			}
		}
		out.println(min);
		exit();
	}
}

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
		final int N = sc.nextInt();
		final int D = sc.nextInt();
		final int p[][] = new int[N][D];
		Set<Integer> set = new HashSet<>();
		for(int i=1;i<127;i++) {
			set.add(i*i);
		}
		for(int i=0;i<N;i++) {
			for(int d=0;d<D;d++) {
				p[i][d] = sc.nextInt();
			}
		}
		int count = 0;
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				int diff = 0;
				for(int d=0;d<D;d++) {
					diff += (p[i][d]-p[j][d])*(p[i][d]-p[j][d]);
				}
				if(set.contains(diff)) {
					count++;
				}
			}
		}
		out.println(count);
		exit();
	}
}

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class Main {
	
	
	void begin() throws IOException {
		int result=1;
		for(int m=1;m<10;m++){
			for(int n=1;n<10;n++){
				result=(m*n);
				System.out.printf(m+"+n+"=");
				System.out.printf(result+"\n");
			}
		}
	}

	void close() throws IOException {
		in.close();
	}

	Scanner in;

	public Main() throws FileNotFoundException {
		//in = new Scanner(new File("in.txt"));
		in = new Scanner(new BufferedInputStream(System.in));
	}

	public static void main(String[] args) throws IOException {
		Main ljp = new Main();
		ljp.begin();
		ljp.close();
	}
}
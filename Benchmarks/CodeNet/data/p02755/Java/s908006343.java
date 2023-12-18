import java.awt.Event;
import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
//		new TestA().doIt();
//		new TestB().doIt();
		new TestC().doIt();
	}
	class TestA{
		void doIt() {
			String str = sc.next();
			if(str.equals("AAA") || str.equals("BBB")) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}
	}
	class TestB{
		void doIt() {
			long N = Long.parseLong(sc.next());
			long A = Long.parseLong(sc.next());
			long B = Long.parseLong(sc.next());
			long Loop = N / (A + B);
			N = N % (A + B);
			
			long Acount = Loop * A;
			if(N < A)Acount += N;
			else if(N >= A)Acount += A;
			
			System.out.println(Acount);
		}
	}
	class TestC{
		void doIt() {
			int A = Integer.parseInt(sc.next());
			int B = Integer.parseInt(sc.next());
			int num = 0;
			while(true) {
				int numA = (int)(num * 0.08);
				int numB = (int)(num * 0.10);
				if(numA == A && numB == B)break;
				if(numA > A) {
					num = -1;
					break;
				}
				num++;
			}
			System.out.println(num);
		}
	}
}

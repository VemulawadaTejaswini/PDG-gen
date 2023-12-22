//
// Write a program which reads an integer x and print it as is.
// Note that multiple datasets are given for this problem.
//

import java.io.BufferedReader;
import java.io.InputStreamReader;

interface Aggregate {
	public abstract Iterator createIterator();
}

interface Iterator {
	public abstract boolean hasNext();
	public abstract Object next();
}

 class TestCases implements Aggregate {
	private int[] data;
	private int last = 0;
	
	public TestCases(int max) {
		data = new int[max];
	}
	
	public int getDataAt(int index) {
		return data[index];
	}
	
	public void appendData(int data) {
		this.data[last] = data;
		last++;
	}
	
	public int getLength() {
		return last;
	}
	
	public Iterator createIterator() {
		return new TestCasesIterator(this);
	}
}
 
 class TestCasesIterator implements Iterator {
	 private TestCases testCases;
	 private int index = 0;
	 
	 public TestCasesIterator(TestCases testCases) {
		 this.testCases = testCases;
		 this.index = 0;
	 }
	 
	 public boolean hasNext() {
		 if (index < testCases.getLength()) {
			 return true;
		 } else {
			 return false;
		 }
	 }
	 
	 public Object next() {
		 Integer data = testCases.getDataAt(index);
		 index++;
		 return data;
	 }
}

class PrintTestCases {
	private static PrintTestCases printTestCase = new PrintTestCases();
	private TestCases testCase;
	
	private PrintTestCases() {
		testCase = new TestCases(10000);
	}
	
	public static PrintTestCases getInstance() {
		return printTestCase;
	}
	
	public void read() {
		try {
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));
			String line = "";
			while (null != (line = br.readLine())) {
				int data = Integer.parseInt(line);
				if (0 == data)
					break;
				testCase.appendData(data);
			}
		} catch (Exception e) {
			System.exit(1);
		}
	}
	
	public void write() {
		Iterator it = testCase.createIterator();
		int cnt = 1;
		
		while (it.hasNext()) {
			System.out.println("Case " + (cnt++) + ": " + it.next());
		}
	}
}

public class Main {
	public static void main(String[] args) {
		PrintTestCases test = PrintTestCases.getInstance();
		test.read();
		test.write();
	}

}
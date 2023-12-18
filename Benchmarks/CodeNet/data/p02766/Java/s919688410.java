import java.io.*;
import java.lang.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		Reader reader = new Reader();
      	int n = reader.nextInt();
      	int k = reader.nextInt();
		OutputStream out = new BufferedOutputStream(System.out);
		out.write((""+ fromDeci(k, n).length()).getBytes());
		out.flush();
	}
    static char reVal(int num) 
    { 
        if (num >= 0 && num <= 9) 
            return (char)(num + 48); 
        else
            return (char)(num - 10 + 65); 
    } 

    // Function to convert a given decimal number 
    // to a base 'base' and 
    static String fromDeci(int base1, int inputNum) 
    { 
        String s = ""; 

        // Convert input number is given 
        // base by repeatedly dividing it 
        // by base and taking remainder 
        while (inputNum > 0) 
        { 
            s += reVal(inputNum % base1); 
            inputNum /= base1; 
        } 
        StringBuilder ix = new StringBuilder(); 

            // append a string into StringBuilder input1 
            ix.append(s); 

        // Reverse the result 
        return new String(ix.reverse()); 
    } 

	static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            return ret;
        }
        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            return ret;
        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1) {
                buffer[0] = -1;
            }
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead) {
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }
    }
}

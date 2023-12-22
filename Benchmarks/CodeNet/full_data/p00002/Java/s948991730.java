
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0001&lang=jp
 *
 *
 */
class V0002{
    public static void main(String[] a) throws IOException{

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

        	while(true) {
        		String line = br.readLine();
        		if (line==null || line.equals("")) {
        			return;
        		}
        		String[] tmp = line.split(" ");
        		System.out.println(Integer.parseInt(tmp[0])+Integer.parseInt(tmp[1]));
        	}

        }

    }

}
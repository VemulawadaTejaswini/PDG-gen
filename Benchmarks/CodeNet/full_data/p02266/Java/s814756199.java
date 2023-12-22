import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
   
public class Main {
     
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
     
    public void exec() throws IOException {
        SimpleInputUtil in = new SimpleInputUtil();
        PrintWriter out = new PrintWriter(System.out);
        out.print(new SectionDiagram().analyze(in.br.readLine()));
        out.flush();
    }
}

class SectionDiagram {
	public static final String EOF = System.lineSeparator();

	Deque<Integer> downhillDeque = new ArrayDeque<>();
	Deque<WaterHazardElement> waterHazardDeque = new ArrayDeque<>();
	int A = 0;
	int k = 0;
	StringBuilder sbL = new StringBuilder();
	
	public SectionDiagram analyze(String s) {
		int len = s.length();
		for(int i=0; i<len; i++) {
			switch(s.charAt(i)) {
			case '\\':
				downhillDeque.push(i);
				break;
			case '/':
				if(!downhillDeque.isEmpty()) {
					int start = downhillDeque.pop();
					WaterHazardElement wh = new WaterHazardElement(start,i);
					while(true) {
						if(!waterHazardDeque.isEmpty()){
							WaterHazardElement whPre = waterHazardDeque.getFirst();
							if(wh.include(whPre)) {
								if(!wh.merge(waterHazardDeque.removeFirst())){
									break;
								}
							} else {
								waterHazardDeque.addFirst(wh);
								break;
							}
						}else{
							waterHazardDeque.addFirst(wh);
							break;
						}
					}
				}
				break;
			}
		}
		
		for(k=0; !waterHazardDeque.isEmpty(); k++){
			int c = waterHazardDeque.removeLast().getCapacity();
			A += c;
			sbL.append(" ").append(c);
		}
		return this;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(A).append(EOF);
		sb.append(k).append(sbL).append(EOF);
		return sb.toString();
	}
	
}

class WaterHazardElement {
	int st = -1;
	int ed = -1;
	int childCapacity = 0;
	
	public WaterHazardElement(int st, int ed) {
		this.st = st;
		this.ed = ed;
	}
	
	public boolean merge(WaterHazardElement s) {
		childCapacity += s.getCapacity();
		return (s.st - this.st >= 3);
	}
	
	public int getCapacity() {
		return childCapacity + ed - st;
	}
	
	public boolean include(WaterHazardElement s) {
		return this.st < s.st && s.ed < this.ed;
	}
	
}
 
class SimpleInputUtil {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
    public String[] readStrArray(String delim) throws NumberFormatException, IOException{
        return br.readLine().split(delim);
    }
     
    public int readInt() throws NumberFormatException, IOException{
        return Integer.parseInt(br.readLine());
    }
     
    public int[] readIntArray(int[] a) throws NumberFormatException, IOException{
        int i=0;
        while(i<a.length) {
            for(String s: br.readLine().split(" ")){
                if(i<a.length) {
                    a[i++] = Integer.parseInt(s);
                }
            }
        }
        return a;
    }
 
     
}
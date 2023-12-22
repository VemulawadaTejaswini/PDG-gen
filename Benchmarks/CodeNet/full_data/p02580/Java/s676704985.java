import java.util.*; import java.io.*; import java.math.*;
public class Main{
	//Don't have to see. start------------------------------------------
	static class InputIterator{
		ArrayList<String> inputLine = new ArrayList<String>(1024);
		int index = 0; int max; String read;
		InputIterator(){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try{
				while((read = br.readLine()) != null){
					inputLine.add(read);
				}
			}catch(IOException e){}
			max = inputLine.size();
		}
		boolean hasNext(){return (index < max);}
		String next(){
			if(hasNext()){
				return inputLine.get(index++);
			}else{
				throw new IndexOutOfBoundsException("There is no more input");
			}
		}
	}
	static HashMap<Integer, String> CONVSTR = new HashMap<Integer, String>();
	static InputIterator ii = new InputIterator();//This class cannot be used in reactive problem.
	static PrintWriter out = new PrintWriter(System.out);
	static void flush(){out.flush();}
	static void myout(Object t){out.println(t);}
	static void myerr(Object t){System.err.print("debug:");System.err.println(t);}
	static String next(){return ii.next();}
	static boolean hasNext(){return ii.hasNext();}
	static int nextInt(){return Integer.parseInt(next());}
	static long nextLong(){return Long.parseLong(next());}
	static double nextDouble(){return Double.parseDouble(next());}
	static ArrayList<String> nextStrArray(){return myconv(next(), 8);}
	static ArrayList<String> nextCharArray(){return myconv(next(), 0);}
	static ArrayList<Integer> nextIntArray(){
		ArrayList<String> input = nextStrArray(); ArrayList<Integer> ret = new ArrayList<Integer>(input.size());
		for(int i = 0; i < input.size(); i++){
			ret.add(Integer.parseInt(input.get(i)));
		}
		return ret;
	}
	static ArrayList<Long> nextLongArray(){
		ArrayList<String> input = nextStrArray(); ArrayList<Long> ret = new ArrayList<Long>(input.size());
		for(int i = 0; i < input.size(); i++){
			ret.add(Long.parseLong(input.get(i)));
		}
		return ret;
	}
	static String myconv(Object list, int no){//only join
		String joinString = CONVSTR.get(no);
		if(list instanceof String[]){
			return String.join(joinString, (String[])list);
		}else if(list instanceof ArrayList){
			return String.join(joinString, (ArrayList)list);
		}else{
			throw new ClassCastException("Don't join");
		}
	}
	static ArrayList<String> myconv(String str, int no){//only split
		String splitString = CONVSTR.get(no);
		return new ArrayList<String>(Arrays.asList(str.split(splitString)));
	}
	public static void main(String[] args){
		CONVSTR.put(8, " "); CONVSTR.put(9, "\n"); CONVSTR.put(0, "");
		solve();flush();
	}
	//Don't have to see. end------------------------------------------
	static void solve(){//Here is the main function
		ArrayList<Integer> one = nextIntArray();
		int H = one.get(0);
		int W = one.get(1);
		int M = one.get(2);
		Count[] hCount = new Count[H];
		Count[] wCount = new Count[W];
		for(int i = 0; i < H; i++){
			hCount[i] = new Count(i);
		}
		for(int i = 0; i < W; i++){
			wCount[i] = new Count(i);
		}
		HashSet<String> mlist = new HashSet<>();
		for(int i = 0; i < M; i++){
			ArrayList<Integer> tmp = nextIntArray();
			mlist.add(String.valueOf(tmp.get(0) - 1) + ":" + String.valueOf(tmp.get(1) - 1));
			hCount[tmp.get(0) - 1].count++;
			wCount[tmp.get(1) - 1].count++;
		}
		Arrays.sort(hCount, new OriginComparator());
		Arrays.sort(wCount, new OriginComparator());
		int hMax = hCount[0].count;
		int wMax = wCount[0].count;
		int output = hMax + wMax - 1;
		boolean isOK = false;
		for(int i = 0; i < hCount.length; i++){
			if(isOK){
				break;
			}
			if(hCount[i].count < hMax){
				break;
			}
			for(int j = 0; j < wCount.length; j++){
				if(wCount[j].count < wMax){
					break;
				}
				if(!mlist.contains(String.valueOf(hCount[i].no) + ":" + String.valueOf(wCount[j].no))){
					output++;
					isOK = true;
					break;
				}
			}
		}
		myout(output);
	}
	//Method addition frame start

static class Count{
	int no;
	int count = 0;
	Count(int i){
		no = i;
	}
	
}
public static class OriginComparator implements Comparator<Count>{
	public int compare(Count mae, Count ato){
		return ato.count - mae.count;
	}
}
	//Method addition frame end
}

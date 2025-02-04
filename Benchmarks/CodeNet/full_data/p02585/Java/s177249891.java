import java.util.*; import java.io.*; import java.math.*;
public class Main{
	static void solve(){//Here is the main function
		ArrayList<Integer> one = nextIntArray();
		int N = one.get(0);
		int K = one.get(1);
		ArrayList<Integer> plist = nextIntArray();
		ArrayList<Integer> clist = nextIntArray();
		long output = -1 * (1L << 60);
		int[] loop = new int[N];
		long[] sum = new long[N];
		for(int i = 0; i < N; i++){
			if(loop[i] > 0){
				continue;
			}
			int dist = 0;
			long tmp = 0;
			int index = i;
			while(loop[index] == 0){
				dist++;
				tmp += clist.get(index);
				loop[index] = -1;
				index = plist.get(index) - 1;
			}
			index = i;
			while(loop[index] < 0){
				loop[index] = dist;
				sum[index] = tmp;
				index = plist.get(index) - 1;
			}
		}
		for(int i = 0; i < N; i++){
			long tmp = 0;
			if(K / loop[i] > 0){
				tmp = sum[i] * (K / loop[i] - 1);
				if(tmp < 0){
					tmp = 0;
				}
			}
			int amari = K;
			if(K / loop[i] > 0){
				amari = K % loop[i] + loop[i];
			}
			int index = i;
			for(int j = 0; j < amari; j++){
				tmp += clist.get(index);
				index = plist.get(index) - 1;
				output = Math.max(output, tmp);
			}
		}
		myout(output);
	}
	//Method addition frame start



	//Method addition frame end

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
	@SuppressWarnings("unchecked")
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
}

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
		int N = nextInt();
		long output = 0;
		int[][] list = new int[50][50];
		int[] twoList = new int[N];
		int[] fiveList = new int[N];
		for(int i = 0; i < N; i++){
			double Ai = nextDouble();
			long tmp = Math.round(Ai * (double)1000000000);
			while(tmp % 2 == 0){
				twoList[i]++;
				tmp /= 2;
			}
			while(tmp % 5 == 0){
				fiveList[i]++;
				tmp /= 5;
			}
		}
		for(int i = 0; i < N; i++){
			list[twoList[i]][fiveList[i]]++;
		}
		for(int i = 49; i >= 0; i--){
			for(int j = 48; j >= 0; j--){
				list[i][j] += list[i][j + 1];
			}
		}
		for(int i = 48; i >= 0; i--){
			for(int j = 49; j >= 0; j--){
				list[i][j] += list[i + 1][j];
			}
		}
		for(int i = 0; i < N; i++){
			int count2 = Math.max(18 - twoList[i], 0);
			int count5 = Math.max(18 - fiveList[i], 0);
			output += list[count2][count5];
			if(count2 <= twoList[i] && count5 <= fiveList[i]){
				output--;
			}
		}
		myout(output / 2);
	}
	//Method addition frame start



	//Method addition frame end
}

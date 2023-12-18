import java.util.*;import java.io.*;import java.math.*;
public class Main{
	//Don't have to see. start------------------------------------------
	static class InputIterator{
		ArrayList<String> inputLine = new ArrayList<String>(1024);
		int index = 0; int max;
		InputIterator(){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true){
				String read;
				try{
					read = br.readLine();
				}catch(IOException e){
					read = null;
				}
				if(read != null){
					inputLine.add(read);
				}else{
					break;
				}
			}
			max = inputLine.size();
		}
		boolean hasNext(){return (index < max);}
		String next(){
			if(hasNext()){
				String returnStr = inputLine.get(index);
				index++;
				return returnStr;
			}else{
				throw new IndexOutOfBoundsException("There is no more input");
			}
		}
	}
  
	static InputIterator ii = new InputIterator();//This class cannot be used in reactive problem.
	static PrintWriter out = new PrintWriter(System.out);
	static void flush(){out.flush();}
	static void myout(Object t){out.println(t);}
	static void myerr(Object t){System.err.print("debug:");System.err.println(t);}
	static String next(){return ii.next();}
	static int nextInt(){return Integer.parseInt(next());}
	static long nextLong(){return Long.parseLong(next());}
	static ArrayList<String> nextStrArray(){return myHanSpSplit(next());}
	static ArrayList<String> myHanSpSplit(String str){return new ArrayList<String>(Arrays.asList(str.split(" ")));}
	static ArrayList<String> nextCharArray(){return mySingleSplit(next());}
	static ArrayList<String> mySingleSplit(String str){return new ArrayList<String>(Arrays.asList(str.split("")));}
	static ArrayList<Integer> nextIntArray(){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		ArrayList<String> input = nextStrArray();
		for(int i = 0; i < input.size(); i++){
			ret.add(Integer.parseInt(input.get(i)));
		}
		return ret;
	}
	static ArrayList<Long> nextLongArray(){
		ArrayList<Long> ret = new ArrayList<Long>();
		ArrayList<String> input = nextStrArray();
		for(int i = 0; i < input.size(); i++){
			ret.add(Long.parseLong(input.get(i)));
		}
		return ret;
	}
	static String kaigyoToStr(String[] list){return String.join("\n",list);}
	static String kaigyoToStr(ArrayList<String> list){return String.join("\n",list);}
	static String hanSpToStr(String[] list){return String.join(" ",list);}
	static String hanSpToStr(ArrayList<String> list){return String.join(" ",list);}
	public static void main(String[] args){
		Runtime rt = Runtime.getRuntime();
		long mae = System.currentTimeMillis();
		solve();
		flush();
		long ato = System.currentTimeMillis();
		myerr("time : " + (ato - mae) + "ms");
		myerr("memory : " + ((rt.totalMemory() - rt.freeMemory()) / 1024) + "KB");
	}
	//Don't have to see. end------------------------------------------
	static void solve(){//Here is the main function
		int N = nextInt();
		ArrayList<String> list = nextCharArray();
		HashMap<String, TreeSet<Integer>> map = new HashMap<String, TreeSet<Integer>>(1000);
		ArrayList<String> alpha = mySingleSplit("abcdefghijklmnopqrstuvwxyz");
		for(int i = 0; i < alpha.size(); i++){
			map.put(alpha.get(i), new TreeSet());
		}
		for(int i = 0; i < N; i++){
			TreeSet<Integer> tmp = map.get(list.get(i));
			tmp.add(i + 1);
			map.put(list.get(i), tmp);
		}
		int Q = nextInt();
		for(int i = 0; i < Q; i++){
			ArrayList<String> tmp = nextStrArray();
			if(tmp.get(0).equals("1")){
				int changeIndex = Integer.parseInt(tmp.get(1));
				for(int j = 0; j < alpha.size(); j++){
					TreeSet set = map.get(alpha.get(j));
					if(set.contains(changeIndex)){
						set.remove(changeIndex);
						map.put(alpha.get(j), set);
						break;
					}
				}
				TreeSet set = map.get(tmp.get(2));
				set.add(changeIndex);
				map.put(tmp.get(2), set);
			}else{
				int L = Integer.parseInt(tmp.get(1));
				int R = Integer.parseInt(tmp.get(2));
				int count = 0;
				for(int j = 0; j < alpha.size(); j++){
					TreeSet set = map.get(alpha.get(j));
					Object high = set.floor(R);
					Object low = set.ceiling(L);
					if(low != null && high != null){
						if((int)low <= (int)high){
							count++;
						}
					}
				}
				myout(count);
			}
		}
	}
	//Method addition frame start

	//Method addition frame end
}
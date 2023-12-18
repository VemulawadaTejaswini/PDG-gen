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
  int N = one.get(0);
  int MA = one.get(1);
  int MB = one.get(2);
  ArrayList[] list = new ArrayList[N];
  int maxValue = 401;
  int[][][] dp = new int[N + 1][maxValue][maxValue];
  for(var i = 0; i < N; i++){
    list[i] = nextIntArray();
  }
  for(var i = 0; i < N + 1; i++){
    for(int j = 0; j < maxValue; j++){
      Arrays.fill(dp[i][j], -1);
    }
  }
      
      
  dp[0][0][0] = 0;
  //dp[i][j][k] : i個目を買い、MA合計がj、MB合計がkになる時の最小コスト
  for(int i = 1; i <= N; i++){
	for(int j = 0; j < maxValue; j++){
		for(int k = 0; k < maxValue; k++){
			if(dp[i - 1][j][k] != -1){
				dp[i][j][k] = dp[i - 1][j][k];
			}
		}
		
	}
    ArrayList<Integer> item = list[i - 1];
    for(int j = 0; j < maxValue; j++){
      for(int k = 0; k < maxValue; k++){
        //myerr({i,j,k});
        if(dp[i - 1][j][k] != -1){
          if(dp[i][j + item.get(0)][k + item.get(1)] == -1){
            dp[i][j + item.get(0)][k + item.get(1)] = dp[i - 1][j][k] + item.get(2);
          }else{
            dp[i][j + item.get(0)][k + item.get(1)] = Math.min(dp[i - 1][j][k] + item.get(2), dp[i][j + item.get(0)][k + item.get(1)]);
          }
        }
      }
    }
  }
	int count = 1;
	int output = 10000;
	while(true){
		int getMA = MA * count;
		int getMB = MB * count;
		if(getMA < maxValue && getMB < maxValue){
			if(dp[N][getMA][getMB] != -1){
				output = Math.min(output,dp[N][getMA][getMB]);
			}
		}else{
			break;
		}
		count++;
	}
	if(output == 10000){
		myout(-1);
	}else{
		myout(output);
	}
      
      
	}
	//Method addition frame start


  
	//Method addition frame end
}

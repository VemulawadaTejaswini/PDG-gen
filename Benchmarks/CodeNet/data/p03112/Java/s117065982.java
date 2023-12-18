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
      int A = one.get(0);
      int B = one.get(1);
      int X = one.get(2);
      long[] alist = new long[A];
      long[] blist = new long[B];
      for(int i = 0; i < A; i++) alist[i] = nextLong();
      for(int i = 0; i < B; i++) blist[i] = nextLong();
      Arrays.sort(alist);
      Arrays.sort(blist);
      for(int i = 0; i < X; i++){
        long xi = nextLong();
        int[] aIndex = binarySearch(alist, xi);
        int[] bIndex = binarySearch(blist, xi);
        Node selectA = new Node();
        Node selectB = new Node();
        if(aIndex[0] == -1 || aIndex[1] == A){
			if(aIndex[0] == -1){
				selectA.kyori = alist[aIndex[1]];
				selectA.vecOnly = 1;
			}else{
				selectA.kyori = alist[aIndex[0]];
				selectA.vecOnly = 2;
			}
		}
		if(bIndex[0] == -1 || bIndex[1] == B){
			if(bIndex[0] == -1){
				selectB.kyori = blist[bIndex[1]];
				selectB.vecOnly = 1;
			}else{
				selectB.kyori = blist[bIndex[0]];
				selectB.vecOnly = 2;
			}
		}
        if(selectA.vecOnly != 0 && selectB.vecOnly != 0 && selectA.vecOnly == selectB.vecOnly){
			myout(Math.max(Math.abs(selectA.kyori - xi), Math.abs(selectB.kyori - xi)));
		}else{
          	long min;
          	if(selectA.vecOnly != 0 && selectB.vecOnly == 0){
              	int vec;
              	int notVec;
              	if(selectA.vecOnly == 1){
                  vec = 1;
                  notVec = 0;
                }else{
                  vec = 0;
                  notVec = 1;
                }
              	min = Math.max(Math.abs(selectA.kyori - xi), Math.abs(blist[bIndex[vec]] - xi));
                min = Math.min(min, Math.abs(blist[bIndex[notVec]] - xi) * 2 + Math.abs(selectA.kyori - xi));
                min = Math.min(min, Math.abs(selectA.kyori - xi) * 2 + Math.abs(blist[bIndex[notVec]] - xi));
                myout(min);
            }else if(selectA.vecOnly == 0 && selectB.vecOnly != 0){
              	int vec;
              	int notVec;
              	if(selectB.vecOnly == 1){
                  vec = 1;
                  notVec = 0;
                }else{
                  vec = 0;
                  notVec = 1;
                }
              	min = Math.max(Math.abs(selectB.kyori - xi), Math.abs(alist[aIndex[vec]] - xi));
                min = Math.min(min, Math.abs(alist[aIndex[notVec]] - xi) * 2 + Math.abs(selectB.kyori - xi));
                min = Math.min(min, Math.abs(selectB.kyori - xi) * 2 + Math.abs(alist[aIndex[notVec]] - xi));
                myout(min);
            }else if(selectA.vecOnly != 0 && selectB.vecOnly != 0){
              	min = Math.abs(selectA.kyori - xi) * 2 + Math.abs(selectB.kyori - xi);
              	min = Math.min(min, Math.abs(selectB.kyori - xi) * 2 + Math.abs(selectA.kyori - xi));
              	myout(min);
            }else{
              	min = Math.max(Math.abs(alist[aIndex[0]] - xi), Math.abs(blist[bIndex[0]] - xi));
              	min = Math.min(min, Math.max(Math.abs(alist[aIndex[1]] - xi), Math.abs(blist[bIndex[1]] - xi)));
              	min = Math.min(min, Math.abs(alist[aIndex[0]] - xi) * 2 + Math.abs(blist[bIndex[1]] - xi));
              	min = Math.min(min, Math.abs(alist[aIndex[1]] - xi) * 2 + Math.abs(blist[bIndex[0]] - xi));
              	min = Math.min(min, Math.abs(blist[bIndex[0]] - xi) * 2 + Math.abs(alist[aIndex[1]] - xi));
              	min = Math.min(min, Math.abs(blist[bIndex[1]] - xi) * 2 + Math.abs(alist[aIndex[0]] - xi));
              	myout(min);
            }
        }
      }
	}
	//Method addition frame start

static class Node{
  long kyori = 0;
  int vecOnly = 0;
  Node(){}
}
  
static int[] binarySearch(long[] list, long search){
  int ng = -1;
  int ok = list.length;
  while(Math.abs(ok - ng) > 1){
    int center = (ok + ng) / 2;
    if(list[center] > search){
      ok = center;
    }else{
      ng = center;
    }
  }
  int[] ret = new int[2];
  ret[0] = ng;
  ret[1] = ok;
  return ret;
}

	//Method addition frame end
}

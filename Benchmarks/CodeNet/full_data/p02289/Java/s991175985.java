import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		heap hoge=new heap(2000000);
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String unko="";
		String[] bu=new String[2];
		while(true) {
			unko=bfr.readLine();
			if(unko.equals("end")) {
				System.exit(0);
			}
			else if(unko.charAt(0)=='i'){
				bu=unko.split(" ");
				long a=Long.parseLong(bu[1])*(-1);
				hoge.heap_push(a);
			}
			else {
				long aa=hoge.heap_pop();
				System.out.println(aa*-1);
			}
		}
	}

	static class heap{

		static int sz;		//現在のヒープに埋まっている数

		static long[] heap;

		public heap(int size) {
			sz=0; heap=new long[size];
		}

		int size() {		//サイズをかえす
			return sz;
		}

		void heap_push(long a) {		//ヒープに入れる
			int i=sz++;
			while(i>0) {	//今指しているヒープがルートに来るまで続ける
				int parent=(i-1)/2;
				if(heap[parent]<=a) {
					break;
				}
				heap[i]=heap[parent];
				i=parent;
			}
			heap[i]=a;
		}

		long heap_pop() {
             //小さい順から取り出す
			long ret=heap[0];
			long x=heap[--sz];
			int i=0;
			while(i*2+1<sz) {	//最下層の葉っぱまで行くまで続ける
				int a=i*2+1,b=i*2+2;		//aは左の葉っぱ、bは右の葉っぱ
				if(b<sz && heap[b]<heap[a]) {
					a=b;
				}
				if(heap[a]>=x) {
					break;
				}
				heap[i]=heap[a];
				i=a;
			}
			heap[i]=x;
			return ret;
		}
	}
}


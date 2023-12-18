import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);

		long[] A = new long[N];

		for(int i=0;i<N;i++){
			W = in.readLine();
			A[i]=Long.parseLong(W);
		}

		Tree t = new Tree(A[N-1]);

		for(int i=N-2;-1<i;i--){
			t.ins(t,A[i]);
		}

		long i=1;
		while(true){
			if(t.right!=null){
				t=t.right;
				i++;
			}else{
				break;
			}
		}
		System.out.println(i);
	}

	public static class Tree{
		long val;
		public Tree left=null;
		public Tree right=null;

		public Tree(long v){
			val=v;
		}

		public void ins(Tree root ,long v){
			Tree t =root;
			while(true){
				if(t.val <= v){
					if(t.right != null){
						t=t.right;
					}else{
						t.right=new Tree(v);
						break;
					}
				}else{
//					if(t.left != null){
//						t=t.left;
//					}else{
//						t.left=new Tree(v);
						break;
//					}
				}
			}
		}
	}

}

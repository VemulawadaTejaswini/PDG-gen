import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static ArrayList<ArrayList<Integer>> adj_list   = new ArrayList<ArrayList<Integer>>(),
                                                 timestamp  = new ArrayList<ArrayList<Integer>>();

	private static final int U     = 0,
			                 K     = 1,
		                     START = 1;

	private static int times = 0;

	public static void main(String[] args) {

		//input
		 Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
         int      N = sc.nextInt();

         ArrayList<Integer> ar;
         for(int i = 0;i < N;i++){
        	 ar = new ArrayList<Integer>();
        	 for(String s:sc.next().split("\\s")){ar.add(Integer.parseInt(s));}
        	 adj_list.add(ar);
        	 timestamp.add(new ArrayList<Integer>());
         }
         for(int i=0;i<N;i++){timestamp.get(i).add(i+1);}

         //calculation
         ArrayList<Integer> l;
         DFS(START);

         int u,k,zero=0,one=1;
         ArrayList<Integer> il,o;
         for(int i = 0; i < N; i++){
        	 il = adj_list.get(i);
        	 u = il.get(U);
        	 k = il.get(K);
        	 o = new ArrayList<Integer>();
        	 for(int j = 0;j < N;j++){o.add(zero);}
        	 for(int j = 0;j < k;j++){
        		 o.set(il.get(j+2)-1,one);}
        	 timestamp.set(u-1,o);
         }

         //output
         for (ArrayList<Integer> ol:timestamp) {
			for(int i=0;i<N;i++){
				System.out.print(ol.get(i));
				if(i<N-1){System.out.print(" ");}
			}
			System.out.println();
		}
	}

	private static void DFS(int id){
		ArrayList<Integer> in,out;
		out = get_OUT_list(id);
		get_IN_list(id);



	}

	private static ArrayList<Integer> get_IN_list(int id){
		ArrayList<Integer> ret = null;
		for(ArrayList<Integer> ar:adj_list){if(ar.get(U) == id){ret = ar;}}
		return ret;
	}

	private static ArrayList<Integer> get_OUT_list(int id){
		ArrayList<Integer> ret = null;
		for(ArrayList<Integer> ar:timestamp){if(ar.get(U) == id){ret = ar;}}
		return ret;
	}

}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static ArrayList<ArrayList<Byte>> adj_list   = new ArrayList<ArrayList<Byte>>(),
                                              adj_matrix = new ArrayList<ArrayList<Byte>>();

	private static final int U = 0,
			                 K = 1;

	public static void main(String[] args) {;
		 Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
         Byte N = sc.nextByte();

         for(int i = 0;i < N;i++){
        	 ArrayList<Byte> ar = new ArrayList<Byte>();
        	 for(String s:sc.next().split("\\s")){
        		 ar.add(Byte.parseByte(s));
        	 }
        	 adj_list.add(ar);
        	 adj_matrix.add(new ArrayList<Byte>());
         }

//         for(ArrayList<Byte> l:adj_list){
//        	 for(byte b:l){System.out.print(b+" ");}
//        	 System.out.println();
//         }

         byte u,k,zero=0,one=1;
         ArrayList<Byte> il,o;
         for(int i = 0; i < N; i++){
        	 il = adj_list.get(i);
        	 u = il.get(U);
        	 k = il.get(K);
        	 o = new ArrayList<Byte>();
        	 for(int j = 0;j < N;j++){o.add(zero);}
        	 for(int j = 0;j < k;j++){
//        		 System.out.print("j:"+j+", k:"+k+", ");
//        		 System.out.println(il.get(j+2));
        		 o.set(il.get(j+2)-1,one);}
        	 adj_matrix.set(u-1,o);
         }

         for (ArrayList<Byte> ol:adj_matrix) {
			for(int i=0;i<N;i++){
				System.out.print(ol.get(i));
				if(i<N-1){System.out.print(" ");}
			}
			System.out.println();
		}
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class card{
	final private String str;
	final private int number;
	final private int id;
	
	//コンストラクタの生成
	card(String str, int id){
		this.str  =str;
		number = Integer.parseInt(str.substring(2));
		this.id = id;
	}
	
	final int getId() {
		return id;
	}
	
	final int getNumber() {
		return number;
	}
	
	@Override
	public final String toString() {
		return str;
	}
}


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		final int n = Integer.parseInt(br.readLine());
        final card[] A = new card[n];
        for(int i = 0; i<n; i++) {
        	A[i] = new card(br.readLine(), i);
        }
        quickSort(A, 0, n-1);
        sb.append(isStable(A) ? "Stable\n" : "Not stable\n");
        for(int i = 0; i<n; i++)
            sb.append(A[i]).append('\n');
        System.out.print(sb);
	}
	
	private static void quickSort(card[] A, int p, int r) {
		if(p < r) {
			final int q = partition(A, p, r);
			quickSort(A, p, q - 1);
			quickSort(A, q + 1, r);
		}
	}
	
	public static int partition(card[] A, int p, int r) {
		final card x = A[r];
		int i = p;
		card t;
		for(int j = p; j<r; j++){
            if(A[j].getNumber()<=x.getNumber()){
                t = A[i];
                A[i] = A[j];
                A[j] = t;
                i++;
            }
        }
        A[r] = A[i];
        A[i] = x;
        return i;
	}
	
	private static boolean isStable(card[] A) {
		for(int i = 1, n = A.length; i<n; i++){
            if(A[i-1].getNumber()==A[i].getNumber()&&A[i-1].getId()>A[i].getId()) return false;
        }
        return true;
	}
}


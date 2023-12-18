import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] n_k = readLine().split(" ");
		String[] array_base = readLine().split(" ");
		
		int n=Integer.parseInt(n_k[0]);
		int k=Integer.parseInt(n_k[1]);
		int[] array = new int[n];
		int id_1=0;
		for(int i=0;i<n;i++){
			array[i]=Integer.parseInt(array_base[i]);
			if(array[i]==1){id_1 = i;}
		}
		int time = 0;
		time+=Math.ceil((float)id_1/(k-1));
		time+=Math.ceil((float)(n-id_1-1)/(k-1));
		System.out.println(time);
		return;
	}

	private static String readLine(){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			return reader.readLine();
		}catch(Exception e){
			return e.getMessage();
		}
	}
}

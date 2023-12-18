import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main2{

	public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String[] input = br.readLine().split(" ");
       int n = Integer.parseInt(input[0]);
       int k = Integer.parseInt(input[1]);
       int[] a = new int[n];
       int[] b = new int[n];
       for(int i = 0;i < n;i++){
       	input = br.readLine().split(" ");
       	a[i] = Integer.parseInt(input[0]);
       	b[i] = Integer.parseInt(input[1]);
       }
       int l = 0;
       int m = 0;
      
       while(m <= k){
       	if(b[l] > 0){
       		b[l] -= 1;
       	}else{
       		l += 1;
       	}
       	m += 1;
       }
       System.out.println(a[l]);
   }

}
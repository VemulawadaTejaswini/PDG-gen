import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
	          String[] A = line.split("");
	          int[] Arr = new int[A.length];
	          int sum1=0;
	          int sum2=0;
	          for(int i=0;i<Arr.length;i++){
	          	Arr[i]=Integer.parseInt(A[i]);
	          	if(i==0){
	          		sum1+=Arr[0];	
	          	}
	          	else{
	          		sum2+=Arr[i];
	          	}
	          }
	          if(sum1==1 && sum2==0){
	             System.out.println(10);	
	          }
	          else{
	          	System.out.println(sum1+sum2);
	          }
	          
	}

}

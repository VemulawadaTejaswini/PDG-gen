import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class main{
 public static void main(String[] args){
  BufferedReader = reader = new BufferedReader(new InputStreamReader(System.in));
  int len = Integer.parseInt(reader.readLine);
  int[] arr = new int[len];

String arrStr = readLine();
StringTokenizer token = new StringTokenizer(arrStr," ");
int i = 0;
while(token.hasMoreElements()){
 arr[i++] = Integer.parseInt((String)token.nextElement());
}
reader.close();
 for(int i = 1;i<A.length;i++){
		int j = i-1;
		int key = A[i];
		while(j >= 0 && A[j] > key){
			
			//入れ替え

			A[j] = A[j + 1];
			A[j+1] = A[j];
			j --;
		}
		
		//結果の出力
		for(int i =0;i<A.length-1;i++){
			System.out.print(A[i]+" ");
		}System.out.print(A[A.length-1]);
	 }

 }
}
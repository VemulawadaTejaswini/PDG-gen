import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
//recode
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
        String[] Aa = line.split(" ");
        int A = Integer.parseInt(Aa[0]);
        int B = Integer.parseInt(Aa[1]);
        int C = Integer.parseInt(Aa[2]);
        long K = Long.parseLong(Aa[3]);
        int i=0;
        while(i<K){
        	int sum1 = B+C;
        	int sum2= C+A;
        	int sum3 = A+B;
        	A=sum1;
        	B=sum2;
        	C = sum3;
        	i++;
        }
        System.out.println(A-B);
    }
		
		

}
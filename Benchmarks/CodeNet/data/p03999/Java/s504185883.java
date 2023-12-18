import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static long getAnswer(long[] numbers){
		int digits = numbers.length;
		if(digits==1) return numbers[0];
		
		long[] FirstExcepted = new long[digits-1];
		for(int i=0;i<digits-1;i++) FirstExcepted[i]=numbers[i+1];
		long[] FirstConnected = new long[digits -1];
		for(int i=1;i<=digits-2;i++) FirstConnected[i]=numbers[i+1];
		FirstConnected[0]=numbers[0]*10+numbers[1];
		
		long FirstPlusPart = numbers[0]*(int)Math.pow(2,digits-2) + getAnswer(FirstExcepted);
		long noFirstPlusPart = getAnswer(FirstConnected);
		
		return noFirstPlusPart + FirstPlusPart;
	}
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("");
        int digits = input.length;
        long[] numbers = new long[digits];
        for(int i=0;i<digits;i++) numbers[i] = Long.parseLong(input[i]);
        
        
        System.out.println(getAnswer(numbers));
    }
}

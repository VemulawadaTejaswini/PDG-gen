import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Rikenkou
 *
 */
class PrimeNumber {

	public int numPrime(int integerNo){
		int numPrime = 0;
		for(int testNo = 2; testNo <= integerNo; testNo++){
			if(isPrimeNo(testNo) == true)	numPrime++;
		}
		return numPrime;
	}

	public boolean isPrimeNo(int testNo){
		boolean isPrime = false;

		int remainder = 1;
		int quotient = testNo;

		for(int divisor = 2; divisor <= quotient; divisor++){
			quotient = testNo / divisor;
			if(quotient < divisor){
				isPrime = true;
				break;
			}
			remainder = testNo % divisor;
			if(remainder == 0){
				isPrime = false;
				break;
			}

			if(quotient == divisor){
				isPrime = true;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		while(true){
			try{
				String buf = br.readLine();
				if(buf == null) break;
				int integerNo = Integer.parseInt(buf);
				if(integerNo/1000000 != 0){
					System.out.println("The number is too large!!!");
					System.exit(0);
				}
				PrimeNumber primeNumber = new PrimeNumber();
				System.out.println(primeNumber.numPrime(integerNo));
			}catch(Exception e){
				System.out.print(e);
				break;
			}
		}
	}

}
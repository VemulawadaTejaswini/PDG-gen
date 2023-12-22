import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		int siraberu=0;
		boolean isp=false;
		int min,max;
		int counter=1;

		try {
			while(true) {
				str=bfr.readLine();
				siraberu=Integer.parseInt(str);
				while(true) {
					siraberu-=counter;
					isp=isPrime(siraberu);
					if(isp==true) {
						min=siraberu;
						break;
					}
				}

				siraberu=Integer.parseInt(str);
				while(true) {
					siraberu+=counter;
					isp=isPrime(siraberu);
					if(isp==true) {
						max=siraberu;
						break;
					}
				}

				System.out.println(min+" "+max);
			}
		}catch(IOException e) {
		}
	}

	static boolean isPrime(int a) {
		int siraberu=a;
		if(a%2==0 && a!=2) {
			return false;
		}
		else if(a==2) {
			return true;
		}
		int max=((int)Math.sqrt(siraberu))+1;
		for(int i=2; i<max; i++) {
			if(siraberu%i==0) {
				return false;
			}
		}
		return true;
	}
}

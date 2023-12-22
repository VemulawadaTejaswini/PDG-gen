import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		sc = new Scanner(System.in);
		new Main();
		sc.close();
	}
	
	Main()
	{
		while(sc.hasNext()){
			String inp = sc.next();
			StringBuilder b = new StringBuilder();
			
			for(int i = 0; i < inp.length(); ++i){
				if(inp.charAt(i) == '@'){
					char c = inp.charAt(i+2);
					for(int j =  inp.charAt(i+1) - '0'; j > 0; --j)
						b.append(c);
					i += 2;
				}
				else b.append(inp.charAt(i));
			}
			
			System.out.println(b);
		}
	}
	
	
	boolean isPrime(int n){
		if(n == 2) return true;
		if(n % 2 == 0) return false;
		
		for(int i = 3; i * i <= n; i += 2)
			if(n % i == 0) return false;
		
		return true;
	}

	static Scanner sc;
}
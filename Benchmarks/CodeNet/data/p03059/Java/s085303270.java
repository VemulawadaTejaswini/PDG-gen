import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String inputN = scanner.nextLine();
		String inputA = scanner.nextLine();

		scanner.close();
		
		Integer inN = Integer.parseInt(inputN);
		List<Integer> inA = Arrays.asList( inputA.split(" ") ).stream().map(x -> Integer.parseInt(x) ).collect(Collectors.toList());
		
		Integer[] ls = new Integer[inA.size()];
		Integer[] rs = new Integer[inA.size()];
		
		int acm = inA.get(0);
		ls[0] = acm;
		
		// create accumulation list
		for(int i = 1; i < inN; i++) {
			acm = calc(acm, inA.get(i));
			ls[i] = acm;
		}

		acm = inA.get(inN - 1);
		rs[0] = acm;
		int j = 1;
		for(int i = inN - 2; i >= 0; i--) {
			acm = calc(acm, inA.get(i));
			rs[j] = acm;
			j++;
		}

		
		int max = 0;
		
		for(int i = 0; i< inN - 1; i++) {
			
			if(i == inN - 1) {
				int val = ls[inN - 2] ;
				if(val > max) {
					max = val;
				}
			}
			else if(i == 0) {
				int val = 	rs[inN - 2];
				
				if(val > max) {
					max = val;
				}
			} else {
				int x,y;
				if(ls[i - 1] >  rs[(inN - 1) - i - 1]) {
					x = ls[i - 1];
					y = rs[(inN - 1) - i - 1];
				} else {
					y = ls[i - 1];
					x = rs[(inN - 1) - i - 1];
				}
				int val = 	calc( x, y ) ;
				if(val > max) {
					max = val;
				}
			}
		}
		
		System.out.println(max);
	}
	
	private static int calc(int x, int y) {
        int tmp;
        while ((tmp = x % y) != 0) {
            x = y;
            y = tmp;
        }
        
        return y;
	}
}
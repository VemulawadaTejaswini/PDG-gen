import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int[] i = ArrconvAtoi(s);
		i[0]++;
		s = sc.nextLine();
		int[] pc = ArrconvAtoi(s);
		
		int cakesum = 0;
		
			for (int c : pc) {
				cakesum += c;
			}
			
		System.out.println(cakesum % i[0] == 0 ? cakesum / i[0] : cakesum / i[0]  + 1);

	}
	
    private static int[] ArrconvAtoi(String s) {
        String[] strs = s.split(" ");
        int[] ints = new int[strs.length];
        int i = 0;
 
        for (String st : strs) {
            ints[i] = Integer.parseInt(st);
            i++;
        }
 
        return ints;
    }
}

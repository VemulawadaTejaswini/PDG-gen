import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int[] i = ArrconvAtoi(s);
			
		System.out.println(i[0] / i[1] + i[0] % i[1]);

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


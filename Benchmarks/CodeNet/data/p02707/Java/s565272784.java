import java.io.PrintWriter;
import java.util. *;

	
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); sc.nextLine();
        String a = sc.nextLine();
        System.out.println(a);
//        StringBuilder sb = new StringBuilder();
//        for(int i=0;i<N-1;i++) {
//            sb.append(sc.next());
//        }
//        String a = sb.toString();
         
//        String a = "";
//        for (int i = 0; i < N-1; i++) {
//			a = a + sc.next();
//		}
//      
        PrintWriter out = new PrintWriter(System.out);
        int i = 0;
        int j = 0;
        while (j < N - 1) {
        	int temp_sum = a.length();
			a = a.replaceAll(String.valueOf(j+1), "");
			out.println(temp_sum - a.length());
			i += temp_sum - a.length(); 
			j += 1;
		}
        out.flush();
        System.out.println(0);
	}
}

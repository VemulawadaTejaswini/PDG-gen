import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int iline = Integer.parseInt(line);
		long[] ians = new long[87];
		ians[0] = 2;
		ians[1] = 1;
		for(int i=2;i<87;i++){
			ians[i] = ians[i-1] + ians[i-2];
		}
		System.out.println(ians[iline]);
    }
}

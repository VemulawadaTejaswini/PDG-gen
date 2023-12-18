import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int bmax=0,max=0;

		for(int i=0;i<s.length()-1;i++) {
			for(int j=i;j<s.length();j++) {
				if(s.substring(j,j+1).equals("A")||s.substring(j,j+1).equals("C")||s.substring(j,j+1).equals("G")||s.substring(j,j+1).equals("T")) {
					max++;//ACGT
				}else {
					break;
				}
			}
			if(max>=bmax)bmax=max;
			max=0;
		}
		System.out.println(bmax);
	}
}

//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));



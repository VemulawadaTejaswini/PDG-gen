import java.util.Scanner;
public class Garden {

    
    	
	public static void Main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		long K = sc.nextLong();
		double days  = 5*Math.pow(10, 15);
		
		for(int i=0;i<s.length();i++) {

			int n = Integer.parseInt(s.charAt(i)+"");
			double m = Math.pow(n, days);
			if (K<=m) 
			{System.out.println(n);
				break;}

		}
		

	}

}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//List<String> list_wa=new ArrayList<String>();
		//Integer[][] array = new Integer[n][m];
		int n = sc.nextInt();
		double count=0;
		for(int i=0;n>i;i++) {
			double a = sc.nextDouble();
			String s = sc.next();
			if(s.equals("JPY"))
				count = count+a;
			else
				count = count+a*380000;
			//System.out.println(i);
		}
		System.out.println(count);
	}
}


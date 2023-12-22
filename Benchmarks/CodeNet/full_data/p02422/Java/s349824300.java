import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int onum= sc.nextInt();

		for(int i=0; i<onum; i++) {
			String order = sc.next();
			if(order.equals("replace")) {
				int ini=sc.nextInt(),end=sc.nextInt();
				String rep=sc.next();
				str=str.substring(0,ini) + rep + str.substring(end+1,str.length());
			}else if(order.equals("print")) {
				int ini = sc.nextInt(),end=sc.nextInt();
				System.out.println(str.substring(ini,end+1));
			}else if(order.equals("reverse")) {
				int ini= sc.nextInt(),end=sc.nextInt();
				char[] sub= str.substring(ini,end+1).toCharArray();
				String rev="";
				for(int j=sub.length-1; j>=0; j--) {
					rev+=sub[j];
				}
				str = str.substring(0,ini) + rev + str.substring(end+1,str.length());
			}
		}
	}
}

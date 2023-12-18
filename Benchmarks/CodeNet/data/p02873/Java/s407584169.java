import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			String s = sc.next();

			String[] a = new String[s.length()];
			int[] num = new int[s.length()+1];
			
			int c =0;
			int d =0;
			
			for(int i =0;i<s.length();i++) {
				a[i]=String.valueOf(s.charAt(i));

			}
			
			for(int i =0;i<s.length();i++) {
				if(a[i].equals("<")) {
					c++;
				}else {
					c=0;
				}
				num[i+1]=c;

			}
			
			for(int i =s.length()-1;i>0;i--) {
				if(a[i].equals(">")) {
					d++;
				}else {
					d=0;
				}
				num[i]=Math.max(num[i], d);

			}
			
			int res =0;
			
			for(int i=0;i<s.length()+1;i++) {
				res +=num[i];
			}
			


			System.out.println(res);

		}

	}
	

	
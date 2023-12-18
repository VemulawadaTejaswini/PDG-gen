
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s=sc.next();
		sc.close();


		if(s.equals("zyxwvutsrqponmlkjihgfedcba"))
			System.out.print(-1);
		else {


			int n= s.length();
			char ch[]=new char[n+1];
			for(int i=0;i<n;i++) {
				ch[i]=s.charAt(i);
			}

			boolean hantei=true;

			if(n==26) {
				int chiisaihou=0;

				for(int i=25;i>=0;i--) {
					if(ch[i]>ch[i-1]) {
						chiisaihou=i-1;
						break;
					}
				}

				for(int i=25;i>=chiisaihou;i++) {
					if(ch[chiisaihou]<ch[i]) {
						ch[chiisaihou]=ch[i];
						break;
					}
				}
				for(int i=0;i<chiisaihou+1;i++) {
					System.out.print(ch[i]);
				}

			}

			else {
				for(char i=97;i<=123;i++) {
					for(int j=0;j<n;j++) {
						if(i==ch[j]) {
							hantei=false;
						}
					}
					if(hantei) {
						ch[n]=i;
						break;
					}
					hantei=true;
				}


				for(int i=0;i<=n;i++) {
					System.out.print(ch[i]);
				}
			}




		}


	}

}

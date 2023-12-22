import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		String[] list = {"a","b","c","d","e","f","g","h","i","j",
						"k","l","m","n","o","p","q","r","s","t",
						"u","v","w","x","y","z"};
		int exp = 0;
		String name = "";
		
		for(int i=1;i<=11;i++) {
			if(n == 27) {
				exp = 2;
				break;
			}else if(Math.pow(26,i)+Math.pow(26, i-1) >= n) {
				exp = i;
				break;
			}
		}
		long s = 0;
		String[] namelist = new String[exp];
		for(int j=0;j<exp;j++) {
			if(n > 26) {
				s = n % 26;
				n = n / 26;
				if(s == 0) {
					s = 26;
					n = n - 1;
				}
				namelist[j] = list[(int) (s-1)];
			}else {
				namelist[j] = list[(int) (n-1)];
			}
		}
		for(int k=exp-1;k>=0;k--) {
			name = name + namelist[k];
		}
		System.out.println(name);
	}

}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		char[] rgb = scan.next().toCharArray();
		scan.close();
		
		int numR = 0;
		int numG = 0;
		int numB = 0;
		for(char c : rgb) {
			switch(c) {
			case 'R' : numR++; break;
			case 'G' : numG++; break;
			case 'B' : numB++; break;
			}
		}

		long ans = numR*numG*numB;

/*		for(int d=1;d<=n;d++){
			for(int m=0;m<n;m++){
				if(m-d<0||m+d>=n) continue;
          
				if(rgb[m-d] != rgb[m+d] && rgb[m] != rgb[m+d] && rgb[m-d] != rgb[m]) ans--;
			}
		}*/
		
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				if(i+(i-j)<n){
					if(rgb[i]!=rgb[j]&&rgb[i]!=rgb[i+(i-j)]&&rgb[j]!=rgb[i+(i-j)])
					ans--;
				}
			}
		}
		
		System.out.println(ans);
	}
}

public class RGBTriples {
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

		for(int d=1;d<=n;d++){
			for(int m=0;m<n;m++){
				if(m-d<0||m+d>=n) continue;
          
				if(rgb[m-d] != rgb[m+d] && rgb[m] != rgb[m+d] && rgb[m-d] != rgb[m]) ans--;
			}
		}
		
		System.out.println(ans);
	}
}
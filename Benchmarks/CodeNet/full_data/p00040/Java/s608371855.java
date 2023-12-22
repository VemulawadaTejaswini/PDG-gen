import java.io.*;

class AffineCipher {
	String s,c;
	String alph = "abcdefghijklmnopqrstuvwxyz";
	int a[] = {1,3,5,7,9,11,15,17,19,21,23,25};

	AffineCipher(String s) {
		this.s = s;
		this.c = s;
	}

	boolean Found(String t) {
		if (t.indexOf("that")!=-1||
			t.indexOf("this")!=-1) return true;
		else return false;
	}

	String FindString() {
		for (int i=0;i<12;i++) {
			for (int j=0;j<=25;j++) {
				String t = "";
				for (int k=0;k<this.s.length();k++) {
					if (alph.indexOf(this.s.charAt(k))!=-1)
						t = t+alph.charAt((a[i]*alph.indexOf(this.s.charAt(k))+j)%26);
					else t = t+this.s.charAt(k);
				}
				this.s = this.c;
				if (Found(t)) return t;
			}	
			this.s = this.c;
		}
		return "NotFound";
	}
}

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int n = Integer.parseInt(br.readLine());
			for (int i=0;i<n;i++) {
				AffineCipher ac = new AffineCipher(br.readLine());
				System.out.println(ac.FindString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
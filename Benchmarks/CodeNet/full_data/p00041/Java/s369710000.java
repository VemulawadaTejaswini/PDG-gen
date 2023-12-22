import java.io.*;
import java.util.StringTokenizer;

class Researcher {
	int n[] = new int[4];

	Researcher(int n[],int n1,int n2,int n3,int n4) {
		this.n[0] = n[n1];
		this.n[1] = n[n2];
		this.n[2] = n[n3];
		this.n[3] = n[n4];
	}

	String FindPattern() {
		String t;
		t = pattern1(1,"",n[0]);
		if (t.equals("f")==false) return t;

		t = pattern2(2,"",n[3]);
		if (t.equals("f")==false) return t;

		t = pattern3(2,"",n[1]);
		if (t.equals("f")==false) return t;

		t = pattern4(2,"",n[1]);
		if (t.equals("f")==false) return t;

		t = pattern5(1,"",n[0],n[2]);
		if (t.equals("f")==false) return t;

		return "f";
	}

	String pattern1(int number,String s,int sum) { //number:1,sum:n[0]
		if (number<4) {
			String t = pattern1(number+1,s+"+",sum+n[number]);
			if (!t.equals("f")) return t;
			t = pattern1(number+1,s+"-",sum-n[number]);
			if (!t.equals("f")) return t;
			t = pattern1(number+1,s+"*",sum*n[number]);
			if (!t.equals("f")) return t;
		}
		else if (number==4) {
			if (sum==10) return "((("+n[0]+" "+s.charAt(0)+" "+n[1]+") "+s.charAt(1)+" "+n[2]+") "+s.charAt(2)+" "+n[3]+")";
			else return "f";
		}
		return "f";
	}

	String pattern2(int number,String s,int sum) { //number:2,sum:n[3]
		if (number>=0) {
			String t = pattern2(number-1,s+"+",n[number]+sum);
			if (!t.equals("f")) return t;
			t = pattern2(number-1,s+"-",n[number]-sum);
			if (!t.equals("f")) return t;
			t = pattern2(number-1,s+"*",n[number]*sum);
			if (!t.equals("f")) return t;
		}
		else if (number==-1) {
			if (sum==10) return "("+n[0]+" "+s.charAt(2)+" ("+n[1]+" "+s.charAt(1)+" ("+n[2]+" "+s.charAt(0)+" "+n[3]+")))";
			else return "f";
		}
		return "f";
	}

	String pattern3(int number,String s,int sum) { //number:2,sum:n[1]
		if (number==2) {
			String t = pattern3(0,s+"+",sum+n[2]);
			if (!t.equals("f")) return t;
			t = pattern3(0,s+"-",sum-n[2]);
			if (!t.equals("f")) return t;
			t = pattern3(0,s+"*",sum*n[2]);
			if (!t.equals("f")) return t;
		} else if (number==0) {
			String t = pattern3(3,s+"+",n[0]+sum);
			if (!t.equals("f")) return t;
			t = pattern3(3,s+"-",n[0]-sum);
			if (!t.equals("f")) return t;
			t = pattern3(3,s+"*",n[0]*sum);
			if (!t.equals("f")) return t;
		} else if (number==3) {
			String t = pattern3(-1,s+"+",sum+n[3]);
			if (!t.equals("f")) return t;
			t = pattern3(-1,s+"-",sum-n[3]);
			if (!t.equals("f")) return t;
			t = pattern3(-1,s+"*",sum*n[3]);
			if (!t.equals("f")) return t;
		} else if (number==-1) {
			if (sum==10) return "(("+n[0]+" "+s.charAt(1)+" ("+n[1]+" "+s.charAt(0)+" "+n[2]+"))"+" "+s.charAt(2)+" "+n[3]+")";
			else return "f";
		}
		return "f";
	}

	String pattern4(int number,String s,int sum) { //number:2,sum:n[1]
		if (number==2) {
			String t = pattern4(3,s+"+",sum+n[2]);
			if (!t.equals("f")) return t;
			t = pattern4(3,s+"-",sum-n[2]);
			if (!t.equals("f")) return t;
			t = pattern4(3,s+"*",sum*n[2]);
			if (!t.equals("f")) return t;
		} else if (number==3) {
			String t = pattern4(0,s+"+",sum+n[3]);
			if (!t.equals("f")) return t;
			t = pattern4(0,s+"-",sum-n[3]);
			if (!t.equals("f")) return t;
			t = pattern4(0,s+"*",sum*n[3]);
			if (!t.equals("f")) return t;
		} else if (number==0) {
			String t = pattern4(-1,s+"+",n[0]+sum);
			if (!t.equals("f")) return t;
			t = pattern4(-1,s+"-",n[0]-sum);
			if (!t.equals("f")) return t;
			t = pattern4(-1,s+"*",n[0]*sum);
			if (!t.equals("f")) return t;
		} else if (number==-1) {
			if (sum==10) return "("+n[0]+" "+s.charAt(2)+" (("+n[1]+" "+s.charAt(0)+" "+n[2]+")"+" "+s.charAt(1)+" "+n[3]+"))";
			else return "f";
		}
		return "f";
	}

	String pattern5(int number,String s,int sum1,int sum2) { //number:1,sum1:n[0],sum2:n[2]
		if (number==1) {
			String t = pattern5(3,s+"+",sum1+n[1],sum2);
			if (!t.equals("f")) return t;
			t = pattern5(3,s+"-",sum1-n[1],sum2);
			if (!t.equals("f")) return t;
			t = pattern5(3,s+"*",sum1*n[1],sum2);
			if (!t.equals("f")) return t;
		} else if (number==3) {
			String t = pattern5(2,s+"+",sum1,sum2+n[3]);
			if (!t.equals("f")) return t;
			t = pattern5(2,s+"-",sum1,sum2-n[3]);
			if (!t.equals("f")) return t;
			t = pattern5(2,s+"*",sum1,sum2*n[3]);
			if (!t.equals("f")) return t;
		} else if (number==2) {
			String t = pattern5(-1,s+"+",sum1+sum2,0);
			if (!t.equals("f")) return t;
			t = pattern5(-1,s+"-",sum1-sum2,0);
			if (!t.equals("f")) return t;
			t = pattern5(-1,s+"*",sum1*sum2,0);
			if (!t.equals("f")) return t;
		} else if (number==-1) {
			if (sum1==10) return "(("+n[0]+" "+s.charAt(0)+" "+n[1]+") "+s.charAt(2)+" ("+n[2]+" "+s.charAt(1)+" "+n[3]+"))";
			else return "f";
		}
		return "f";
	}
}

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while ("0 0 0 0".equals(buf = br.readLine())==false) {
				StringTokenizer st = new StringTokenizer(buf);
				int n[] = new int[4];
				for (int i=0;i<4;i++) n[i] = Integer.parseInt(st.nextToken());
				
				boolean end = false;
				for (int i=0;i<4;i++) {
					for (int j=0;j<4;j++) {
						if (j==i) continue;
						for (int k=0;k<4;k++) {
							if (k==j||k==i) continue;
							for (int l=0;l<4;l++) {
								if (l==i||l==j||l==k) continue;
								Researcher r = new Researcher(n,i,j,k,l);
								String t = r.FindPattern();
								if (t.equals("f")==false) {
									System.out.println(t);
									end = true;
									break;
								}
							}
							if (end) break;
						}
						if (end) break;
					}
					if (end) break;
				}
				if (end==false) System.out.println(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
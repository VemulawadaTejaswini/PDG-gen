import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String aa=sc.next();
		int mojisu=aa.length();
		String crib=sc.next();
		int c_moji=crib.length();
		int point=-1;

		for(int i=0; i<=mojisu-c_moji; i++) {
			boolean mj=true;
			String a=aa.substring(i,i+c_moji);

			for(int j=0; j<c_moji; j++) {
				if(a.charAt(j)==crib.charAt(j) || a.charAt(j)=='?') {
					//
				}
				else {
					mj=false;
				}
			}
			if(mj==true) {
				point=i;
			}
		}

		if(point==-1) {
			System.out.println("UNRESTORABLE");
		}

		else {
			char[] bb=new char[mojisu];

			for(int i=0; i<mojisu; i++) {
				bb[i]=aa.charAt(i);

				if(i>=point && i<point+mojisu) {
					bb[i]=crib.charAt(i-point);
				}

				if(bb[i]=='?') {
					bb[i]='a';
				}
			}

			String moto="";
			for(int i=0; i<mojisu; i++) {
				moto=moto+""+bb[i];
			}
			System.out.println(moto);
		}
	}
}
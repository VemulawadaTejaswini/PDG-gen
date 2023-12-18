import java.util.Scanner;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String sin = sc.nextLine();
		int iin = Integer.parseInt(sin);
		int[][] iif = new int[iin][10];
		int[][] iip = new int[iin][11];
		int[] irmax = new int[iin];
		int[] irzmax = new int[iin];
		boolean bzflg = true;

		for(int i=0;i<iin;i++) {
			String sif = sc.nextLine();
			String[] ksif = new String[10];
			ksif = sif.split(" ");
			for(int j=0;j<10;j++) {
				iif[i][j] = Integer.parseInt(ksif[j]);
			}
		}
		for(int i=0;i<iin;i++) {
			String sip = sc.nextLine();
			String[] ksip = new String[11];
			ksip = sip.split(" ");
			for(int j=0;j<11;j++) {
				iip[i][j] = Integer.parseInt(ksip[j]);
			}
		}

		for(int i=0;i<iin;i++) {
			int mx = 1;
			for(int j=0;j<10;j++) {
				if(iif[i][j]==1) {
					mx++;
				}
			}
			int mmx = iip[i][0];
			int mzmx = 0;
			for(int j=1;j<mx;j++) {
				if(j==1) {
					mzmx = iip[i][j];
				}
				else {
					if(mzmx<iip[i][j]) {
						mzmx = iip[i][j];
					}
				}
				if(mmx<iip[i][j]) {
					mmx = iip[i][j];
				}
			}
			irmax[i] = mmx;
			irzmax[i] = mzmx;
			if(mmx==mzmx) {
				bzflg = false;
			}
		}
		if(bzflg) {
			int irt = irzmax[0];
			for(int i=0;i<iin;i++) {
				if(irt<irzmax[i]) {
					irt = irzmax[i];
				}
			}
			if(irt<=0) {
				System.out.println(irt);
			}else {
				int iirt = 0;
				for(int i=0;i<iin;i++) {
					if(irzmax[i]>0) {
						iirt += irzmax[i];
					}
				}
				System.out.println(iirt);
			}
		}
		else {
			int irt = irmax[0];
			for(int i=0;i<iin;i++) {
				if(irt<irmax[i]) {
					irt = irmax[i];
				}
			}
			if(irt<=0) {
				System.out.println(irt);
			}else {
				int iirt = 0;
				for(int i=0;i<iin;i++) {
					if(irmax[i]>0) {
						iirt += irmax[i];
					}
				}
				System.out.println(iirt);
			}
		}
    }
}
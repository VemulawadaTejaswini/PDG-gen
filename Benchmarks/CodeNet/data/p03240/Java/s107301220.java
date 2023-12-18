import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		int[][] zahyo=new int[cases][3];

		for(int i=0; i<cases; i++) {
			zahyo[i][0]=sc.nextInt();		//x
			zahyo[i][1]=sc.nextInt();		//y
			zahyo[i][2]=sc.nextInt();		//h
		}

		int sum_height=0;
		boolean onaji=true;
		for(int i=0; i<=100; i++) {
			for(int j=0; j<=100; j++) {
				sum_height=-1;
				for(int k=0; k<cases; k++) {
					if(zahyo[k][2]>0) {
						int tmp=zahyo[k][2]+Math.abs(j-zahyo[k][1])+Math.abs(i-zahyo[k][0]);
						if(sum_height==-1) {
							sum_height=tmp;
						}
						else {
							if(sum_height!=tmp) {
								sum_height=-2;
								break;
							}
						}
					}
				}

				if(sum_height==-2) {
					continue;
				}
				for(int k=0; k<cases; k++) {
					if(zahyo[k][2]==0) {
						int dist=Math.abs(j-zahyo[k][1])+Math.abs(i-zahyo[k][0]);
						if(sum_height>dist) {
							sum_height=-2;
							break;
						}
					}
				}
				System.out.println(i+" "+j+" "+sum_height);
				System.exit(0);
			}
		}
	}
}

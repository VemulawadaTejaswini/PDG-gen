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

		int sum_height=-1;
		boolean onaji=true;
		for(int i=0; i<=100; i++) {
			for(int j=0; j<=100; j++) {
				onaji=true;
				sum_height=-1;
				for(int k=0; k<cases; k++) {
					if(zahyo[k][2]!=0) {
						if(sum_height==-1) {
							sum_height=Math.abs(i-zahyo[k][0])+Math.abs(j-zahyo[k][1])+zahyo[k][2];
							onaji=true;
						}
						else {
							if(sum_height==Math.abs(i-zahyo[k][0])+Math.abs(j-zahyo[k][1])+zahyo[k][2]) {
								//
							}
							else {
								onaji=false;
								break;
							}
						}
					}
					else if(zahyo[k][2]==0){
						//
					}
				}
				if(onaji==true) {

					for(int k=0; k<cases; k++) {
						if(zahyo[k][2]==0) {
							if(Math.max(sum_height-Math.abs(zahyo[i][0]-i)-Math.abs(zahyo[i][1]-j),0)==0) {
								onaji=true;
							}
							else {
								onaji=false;
								break;
							}
						}
					}
					if(onaji==true) {
						System.out.println(i+" "+j+" "+sum_height);
						System.exit(0);
					}
				}
			}
		}

	}
}

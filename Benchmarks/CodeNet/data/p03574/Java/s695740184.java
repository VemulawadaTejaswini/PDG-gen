import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int[][] res=new int[h][w];
		//long n=sc.nextLong(),y=sc.nextLong();
		String buff="";
		for(int i=0;i<h;i++) {
			buff=sc.next();
			for(int j=0;j<w;j++) {
				if(buff.substring(j,j+1).equals(".")) {
					res[i][j]=0;
				}else {
					res[i][j]=-1;
				}
			}
		}
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if(res[i][j]==-1) {
					if(j-1>=0 &&res[i][j-1]!=-1) {
						res[i][j-1]++;
					}
					if(j+1<=w-1&&res[i][j+1]!=-1) {
						res[i][j+1]++;
					}
					if(i-1>=0&&res[i-1][j]!=-1) {
						res[i-1][j]++;
					}
					if(i+1<=h-1&&res[i+1][j]!=-1) {
						res[i+1][j]++;
					}
					if(i+1<=h-1) {
						if(j-1>=0&&res[i+1][j-1]!=-1) {
							res[i+1][j-1]++;
						}
						if(j+1<=w-1&&res[i+1][j+1]!=-1) {
							res[i+1][j+1]++;
						}
					}
					if(i-1>=0) {
						if(j-1>=0&&res[i-1][j-1]!=-1) {
							res[i-1][j-1]++;
						}
						if(j+1<=w-1&&res[i-1][j+1]!=-1) {
							res[i-1][j+1]++;
						}
					}
				}
			}
		}
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if(res[i][j]==-1) {
					System.out.print("#");
				}else {
					System.out.print(res[i][j]);
				}
			}
			System.out.println();
		}

	}

}

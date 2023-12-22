import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	static char[][] moji1, moji2;
	static int h1, w1, h2, w2;

	static void black1(int x, int y) {
		if(x>=0 && x<=h1+1 && y>=0 && y<=w1+1) {
			if(moji1[x][y]=='#') {
				moji1[x][y]='v';
				black1(x+1, y);
				black1(x+1, y+1);
				black1(x, y+1);
				black1(x-1, y+1);
				black1(x-1, y);
				black1(x-1, y-1);
				black1(x, y-1);
				black1(x+1, y-1);
			}
		}
	}
	static void white1(int x, int y) {
		if(x>=0 && x<=h1+1 && y>=0 && y<=w1+1) {
			if(moji1[x][y]=='.') {
				moji1[x][y]='v';
				white1(x+1, y);
				white1(x, y+1);
				white1(x-1, y);
				white1(x, y-1);
			}
		}
	}
	static void black2(int x, int y) {
		if(x>=0 && x<=h2+1 && y>=0 && y<=w2+1) {
			if(moji2[x][y]=='#') {
				moji2[x][y]='v';
				black2(x+1, y);
				black2(x+1, y+1);
				black2(x, y+1);
				black2(x-1, y+1);
				black2(x-1, y);
				black2(x-1, y-1);
				black2(x, y-1);
				black2(x+1, y-1);
			}
		}
	}
	static void white2(int x, int y) {
		if(x>=0 && x<=h2+1 && y>=0 && y<=w2+1) {
			if(moji2[x][y]=='.') {
				moji2[x][y]='v';
				white2(x+1, y);
				white2(x, y+1);
				white2(x-1, y);
				white2(x, y-1);
			}
		}
	}

	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			while(sc.hasNext()) {
				h1=sc.nextInt();
				w1=sc.nextInt();
				if(h1+w1==0) break;
				int b1count=0, b2count=0; 
				int w1count=0, w2count=0;
				moji1=new char[h1+2][w1+2];
				
				for(int i=1; i<=h1; i++) {
					String str=sc.next();
					for(int j=1; j<=w1; j++) {
						moji1[i][j]=str.charAt(j-1);
					}
				}
				for(int j=0; j<=w1+1; j++) {
					moji1[0][j]='.';
					moji1[h1+1][j]='.';
				}
				for(int i=0; i<=h1+1; i++) {
					moji1[i][0]='.';
					moji1[i][w1+1]='.';
				}//周囲が白
				
				Stack<Character> stack1=new Stack<>();
				for(int i=0; i<=h1+1; i++) {
					for(int j=0; j<=w1+1; j++) {
						if(moji1[i][j]=='#') {
							b1count++;
							black1(i, j);
							stack1.add('#');
						}
						else if(moji1[i][j]=='.'){
							w1count++;
							white1(i, j);
							stack1.add('.');
						}
					}
//					for(int k=0; k<=h1+1; k++) {
//						for(int kk=0; kk<=w1+1; kk++) {
//							System.out.print(moji1[k][kk]);
//						}
//						System.out.println();
//					}
//					System.out.println();
				}
	//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
				
				h2=sc.nextInt();
				w2=sc.nextInt();
				moji2=new char[h2+2][w2+2];
				for(int i=1; i<=h2; i++) {
					String str=sc.next();
					for(int j=1; j<=w2; j++) {
						moji2[i][j]=str.charAt(j-1);
					}
				}
				for(int j=0; j<=w2+1; j++) {
					moji2[0][j]='.';
					moji2[h2+1][j]='.';
				}
				for(int i=0; i<=h2+1; i++) {
					moji2[i][0]='.';
					moji2[i][w2+1]='.';
				}//周囲が白
				
				Stack<Character> stack2=new Stack<>();
				for(int i=0; i<=h2+1; i++) {
					for(int j=0; j<=w2+1; j++) {
						if(moji2[i][j]=='#') {
							b2count++;
							black2(i, j);
							stack2.add('#');
						}
						else if(moji2[i][j]=='.') {
							w2count++;
							white2(i, j);
							stack2.add('.');
						}
					}
//					for(int k=0; k<=h2+1; k++) {
//						for(int kk=0; kk<=w2+1; kk++) {
//							System.out.print(moji2[k][kk]);
//						}
//						System.out.println();
//					}
//					System.out.println();
				}
		//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
				
				boolean ans=true;
//				System.out.println("b1count="+b1count);
//				System.out.println("w1count="+w1count);
//				System.out.println("b2count="+b2count);
//				System.out.println("w2count="+w2count);
				if((b1count!=b2count)||(w1count!=w2count)) {
					ans=false;
				}
				else {
					while(!stack1.isEmpty()) {
						char m1=stack1.pop();
						char m2=stack2.pop();
//						System.out.println("m1="+m1+"m2="+m2);
						if(m1!=m2) {
							ans=false;
							stack1.clear();
							stack2.clear();
							break;
						}
					}
				}
				if(ans) {
					System.out.println("yes");
				}
				else {
					System.out.println("no");
				}
				
				
				
			}
		}
	}
}

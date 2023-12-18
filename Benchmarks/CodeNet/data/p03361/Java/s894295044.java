import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		StringTokenizer stk;

		try {
			str=bfr.readLine();
			if(str.equals("")) {
				System.exit(0);
			}

			else {
				int tate,yoko=0;
				stk=new StringTokenizer(str," ");
				tate=Integer.parseInt(stk.nextToken());
				yoko=Integer.parseInt(stk.nextToken());
				int mawari_count=0;

				int[][] kurosiro=new int[tate+2][yoko+2];

				for(int i=0; i<tate+2; i++) {
					for(int j=0; j<yoko+2; j++) {
						kurosiro[i][j]=0;
					}
				}
				String moji="";

				for(int i=0; i<tate; i++) {
					str=bfr.readLine();
					for(int j=0; j<yoko; j++) {
						moji=str.charAt(j)+"";
						if(moji.equals(".")) {
							kurosiro[i+1][j+1]=0;
						}
						else if(moji.equals("#")) {
							kurosiro[i+1][j+1]=1;
						}
					}
				}

				for(int i=1; i<=tate+1; i++) {
					for(int j=1; j<=yoko+1; j++) {
						if(kurosiro[i][j]==1) {
							if(kurosiro[i+1][j]==0) {
								mawari_count++;
							}

							if(kurosiro[i-1][j]==0) {
								mawari_count++;
							}

							if(kurosiro[i][j+1]==0) {
								mawari_count++;
							}

							if(kurosiro[i][j-1]==0) {
								mawari_count++;
							}

							if(mawari_count==4) {
								System.out.println("No");
								System.exit(0);
							}
							else {
								//なにもしない
							}
							mawari_count=0;
						}
						else {
							//なにもしない
						}
					}
				}

				System.out.println("Yes");
				System.exit(0);

			}
			stk=new StringTokenizer(str," ");

		}catch(IOException e) {

		}

	}
}
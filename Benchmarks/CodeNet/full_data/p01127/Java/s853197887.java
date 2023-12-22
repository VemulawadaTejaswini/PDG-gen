
import java.util.*;
import java.util.Scanner;


public class Main {

	public static void main(String args[]){
		String st;
		Scanner sc = new Scanner(System.in);
		HashSet<Character> hs = new HashSet<Character>();
		HashSet<Character> hs2 = new HashSet<Character>();
		hs.add('.');
		hs.add('*');
		int n= sc.nextInt();
		for(int T=0;T<n;T++){
			int H=sc.nextInt(),W=sc.nextInt();
			char[][] field = new char[H][W];
			for(int i=0;i<H;i++){
				st = sc.next();
				for(int j=0;j<W;j++){
					field[i][j] = st.charAt(j);
				}
			}

			char temp;
			int min_i,min_j,max_i=0,max_j=0;
			int check;
			for(int k=0;k<7;k++){
				hs2.clear();
				for(int i=0;i<H;i++){
					for(int j=0;j<W;j++){
						max_i=0;max_j=0;
						check=0;
						if(!hs.contains(field[i][j])&&!hs2.contains(field[i][j])){
							for(int iii=0;iii<H;iii++){
								for(int jjj=0;jjj<W;jjj++){
									System.out.print(field[iii][jjj]);
								}		
								System.out.print("\n");
							}
							System.out.print("\n");

							temp = field[i][j];
							hs.add(temp);
							min_i = i;
							min_j =j;
							for(int ii=0;ii<H;ii++){
								for(int jj=0;jj<W;jj++){
									if(field[ii][jj]==temp){
										if(min_i>ii){
											min_i = ii;
										}
										if(min_j>jj){
											min_j= jj;
										}
										if(max_i<ii){
											max_i = ii;
										}
										if(max_j<jj){
											max_j= jj;
										}
									}
								}
							}

							for(int ii=min_i;ii<=max_i;ii++){
								for(int jj=min_j;jj<=max_j;jj++){
									if(field[ii][jj]!=temp&&field[ii][jj]!='*'){
										check++;
										hs.remove(temp);
										hs2.add(temp);
										break;
									}
								}
								if(check!=0) break;
							}
							if(check==0){//*におきかえ
								hs2.remove(temp);
								for(int ii=min_i;ii<=max_i;ii++){
									for(int jj=min_j;jj<=max_j;jj++){
										field[ii][jj] = '*';
									}
								}
								//i=0;
								//j=0;

							}

						}

					}
				}
			}
			check =0;
			//全てが'.' or '*'の判定
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
					if(field[i][j]!='.'&&field[i][j]!='*'){
						check = -1;
					}
				}		
			}
			if(check==-1){
				//OK
				System.out.println("SUSPICIOUS");
			}else if(check==0){
				//No
				System.out.println("SAFE");
			}
		}
	}
}
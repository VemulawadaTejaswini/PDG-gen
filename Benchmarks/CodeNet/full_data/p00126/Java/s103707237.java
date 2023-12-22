
import java.util.*;

public class Main {
	static char ch[][]=new char[9][9];
	static void check(int[][] bord){
		Set<Integer> s=new TreeSet<Integer>();
		//yoko
		for(int i=0;i<9;i++){
			s.clear();
			for(int j=0;j<9;j++){
				if(!s.add(bord[i][j])){
					//被りを見つけた時の処理
					for(int k=0;k<9;k++){
						if(bord[i][j]==bord[i][k]){
							ch[i][k]='*';
						}
					}
				}
			}
		}
		//tate
		for(int j=0;j<9;j++){
			s.clear();
			for(int i=0;i<9;i++){
				if(!s.add(bord[i][j])){
					//被りを見つけた時の処理
					for(int k=0;k<9;k++){
						if(bord[i][j]==bord[k][j]){
							ch[k][j]='*';
						}
					}
				}
			}
		}
		//3*3
		for(int i=0;i<9;i+=3){
			for(int j=0;j<9;j+=3){
				check2(bord,i,j);
			}
		}
	}
	static void check2(int[][] bord,int x,int y){
		Set<Integer> s=new TreeSet<Integer>();
		for(int i=y;i<y+3;i++){
			for(int j=x;j<x+3;j++){
				if(!s.add(bord[i][j])){
					for(int k=y;k<y+3;k++){
						for(int l=x;l<x+3;l++){
							if(bord[i][j]==bord[k][l]){
								ch[k][l]='*';
							}
						}
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int bord[][]=new int[9][9];
		while(n--!=0){
			for(int i=0;i<9;i++){
				for(int j=0;j<9;j++){
					bord[i][j]=sc.nextInt();
				}
			}
			for(int j=0;j<9;j++){
				Arrays.fill(ch[j],' ');
			}
			check(bord);
			for(int i=0;i<9;i++){
				for(int j=0;j<9;j++){
					System.out.print(ch[i][j]+""+bord[i][j]);
				}
				System.out.println();
			}
			if(n!=0) System.out.println();
		}
	}

}
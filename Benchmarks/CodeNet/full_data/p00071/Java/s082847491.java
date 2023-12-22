import java.util.Scanner;
public class Main {
	static char[][] bombsMap=new char[8][8];
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<8;j++){
				bombsMap[j]=sc.next().toCharArray();
			}
			int x=sc.nextInt()-1;
			int y=sc.nextInt()-1;
			bomb(x,y);
			System.out.println("Data "+(i+1)+":");
			for(int j=0;j<8;j++){
				System.out.println(String.valueOf(bombsMap[j]));
			}
		}
	}
	static void bomb(int x,int y){
		bombsMap[y][x]='0';
		for(int i=1;x-i>=0&&i<4;i++){
			if(bombsMap[y][x-i]=='1'){
				bomb(x-i,y);
			}
		}
		for(int i=1;x+i<=7&&i<4;i++){
			if(bombsMap[y][x+i]=='1'){
				bomb(x+i,y);
			}
		}
		for(int i=1;y-i>=0&&i<4;i++){
			if(bombsMap[y-i][x]=='1'){
				bomb(x,y-i);
			}
		}
		for(int i=1;y+i<=7&&i<4;i++){
			if(bombsMap[y+i][x]=='1'){
				bomb(x,y+i);
			}
		}
	}
}
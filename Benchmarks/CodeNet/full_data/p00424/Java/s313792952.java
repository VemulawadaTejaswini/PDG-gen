import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int roop=0;
		char tmpData;
		char[][] data=new char[100][10000];
		char[][] ch=new char[10000][2];
		try{
			while(true){
				int n=sc.nextInt(); //変換表文字数
				if(n==0) break;	//n==0で結果出力へ
				roop++;
				for(int j=0;j<n;j++){	//変換表の入力
					ch[j][0]=sc.next().charAt(0);
					ch[j][1]=sc.next().charAt(0);
				}
				int dn=sc.nextInt();	//変換データ文字数
				for(int j=0;j<dn;j++){
					tmpData=sc.next().charAt(0);
					for(int k=0;k<n;k++){
						if(tmpData==ch[k][0]) tmpData=ch[k][1];
						data[roop][k]=tmpData;
					}
				}
			}
			sc.close();
			for(int j=1;j<roop;j++){
				System.out.println("");
				for(int k=0;k<100;k++){
					System.out.print(data[j][k]);	//結果出力
				}
			}
		}catch(Exception e){
		}
	}
}
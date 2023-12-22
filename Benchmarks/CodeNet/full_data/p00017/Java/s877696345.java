import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	private static int[][] charaint;
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		while(str!=null){
			String[]wordstr=str.split(" ",0);
			for(int i=0;i<wordstr.length;i++){
				char[][]chara=new char[wordstr.length][wordstr[i].length()];
				charaint=new int[wordstr.length][wordstr[i].length()];
				chara[i]=wordstr[i].toCharArray();
				for(int j=0;j<chara[i].length;j++){
					charaint[i][j]=(int)chara[i][j];
				}
			}
			int shift=Search(charaint);
			Print(shift,charaint);
			str=br.readLine();
		}
	}
	private static int Search(int[][]ch){
		for(int i=0;i<ch.length;i++){
			if(ch[i].length==3){
				for(int k=0;k<26;k++){
					int a=97+((ch[i][0]-97+k)%26);
					int b=97+((ch[i][1]-97+k)%26);
					int c=97+((ch[i][2]-97+k)%26);
					if(a==116&&b==104&&c==101){
						return k;
					}
				}
			}else if(ch[i].length==4){
				for (int k=0;k<26;k++){
					int a=97+((ch[i][0]-97+k)%26);
					int b=97+((ch[i][1]-97+k)%26);
					int c=97+((ch[i][2]-97+k)%26);
					int d=97+((ch[i][3]-97+k)%26);
					if((a==116&&b==104&&c==105&&d==115)||(a==116&&b==104&&c==97&&d==116)){
						return k;
					}
				}
			}
		}
	}
	private static void Print(int n,int[][]ch){
		for (int i=0;i<ch.length;i++){
			for (int j=0;j<ch[i].length;j++){
				System.out.print((char)(97+((ch[i][j]-97+n)%26)));
			}
			if(i!=ch.length-1){
				System.out.print(" ");
			}
		}
	}
}
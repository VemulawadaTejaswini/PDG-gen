import java.io.*;
import java.util.regex.Pattern;
public class Main {
	public static void main(String[] args) throws IOException{
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String str=br.readLine();
			char[] ch=str.toCharArray();
			Pattern pattern=Pattern.compile("the|this|that");
			while(true){
				for(int i=0;i<ch.length;i++){
					if('a'<=ch[i]&&ch[i]<'z'){	//a〜zでプラスしてループ
						ch[i]++;
					}else if(ch[i]=='z') ch[i]='a';	//zの次はa
				}
				if(pattern.matcher(String.valueOf(ch)).find()){
					break;
				}
			}
			System.out.println(ch);
		}catch(Exception e){
		}
	}
}
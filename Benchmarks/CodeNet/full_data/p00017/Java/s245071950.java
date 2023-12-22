import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String str=br.readLine();
			int len=str.length();
			char[] ch=str.toCharArray();
			char[] ch2=str.toCharArray();
			while(true){
				for(int i=0;i<len;i++){
					if(ch[i]!=' '&&ch[i]!='.'&&ch[i]!='\n'){
						ch[i]++;
						ch2[i]--;
					}
				}
				String newStr1=String.valueOf(ch);
				String newStr2=String.valueOf(ch2);
				if(newStr1.matches(".*the.*")||newStr1.matches("this")||newStr1.matches(".*that.*")){
					System.out.println(newStr1);
					break;
				}
				if(newStr2.matches(".*the.*")||newStr2.matches(".*this.*")||newStr2.matches(".*that.*")){
					System.out.println(newStr2);
					break;
				}
			}
		}catch(Exception e){
		}
	}
}
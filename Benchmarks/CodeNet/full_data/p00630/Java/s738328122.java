import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}
	void run(){
		Scanner sc=new Scanner(System.in);
		while(true){
			char ch[]=sc.next().toCharArray();
			String type=sc.next();
			if(type.equals("X")) break;
			int now=typeCheck(ch);
			if(type.equals("U")){
				System.out.println(Uchange(ch, now));
			}
			else if(type.equals("L")){
				System.out.println(Lchange(ch, now));
			}
			else if(type.equals("D")){
				System.out.println(Dchange(ch, now));
			}
		}
	}
	int typeCheck(char ch[]){
		for(int i=0; i<ch.length; i++){
			if(ch[i]=='_'){
				return 2;
			}
		}
		if(Character.isUpperCase(ch[0])){
			return 0;
		}
		else return 1;
	}
	String Uchange(char ch[],int now){
		if(now==0){//テ・ツ?・テ・ツ環崚」ツ?袈
			//テ」ツ?敕」ツ?ョテ」ツ?セテ」ツ?セテ」ツ?ァOK
			return String.valueOf(ch);
		}
		else if(now==1){//テ・ツ?・テ・ツ環崚」ツ?鍬
			ch[0]=Character.toUpperCase(ch[0]);	
			return String.valueOf(ch);
		}
		else if(now==2){//テ・ツ?・テ・ツ環崚」ツ?轡
			String str="";
			ch[0]=Character.toUpperCase(ch[0]);
			str+=String.valueOf(ch[0]);
			for(int i=1; i<ch.length; i++){
				if(ch[i]=='_'){
					i++;
					ch[i]=Character.toUpperCase(ch[i]);
					str+=String.valueOf(ch[i]);
				}
				else{
					str+=String.valueOf(ch[i]);
				}
			}
			return str;
		}
		return "NG";
	}
	String Lchange(char ch[],int now){
		if(now==0){//テ・ツ?・テ・ツ環崚」ツ?袈
			ch[0]=Character.toLowerCase(ch[0]);	
			return String.valueOf(ch);
		}
		else if(now==1){//テ・ツ?・テ・ツ環崚」ツ?鍬
			//テ」ツ?敕」ツ?ョテ」ツ?セテ」ツ?セテ」ツ?ァOK
			return String.valueOf(ch);
		}
		else if(now==2){//テ・ツ?・テ・ツ環崚」ツ?轡
			String str="";
			for(int i=0; i<ch.length; i++){
				if(ch[i]=='_'){
					i++;
					ch[i]=Character.toUpperCase(ch[i]);
					str+=String.valueOf(ch[i]);
				}
				else{
					str+=String.valueOf(ch[i]);
				}
			}
			return str;
		}
		return "NG";
	}
	String Dchange(char ch[],int now){
		if(now==0){//テ・ツ?・テ・ツ環崚」ツ?袈
			ch[0]=Character.toLowerCase(ch[0]);	
			String str="";
			str+=ch[0];
			for(int i=1; i<ch.length; i++){
				if(Character.isUpperCase(ch[i])){
					str+="_";
					str+=String.valueOf(Character.toLowerCase(ch[i]));
				}
				else{
					str+=String.valueOf(ch[i]);
				}
			}
			return str;
		}
		else if(now==1){//テ・ツ?・テ・ツ環崚」ツ?鍬
			String str="";
			for(int i=0; i<ch.length; i++){
				if(Character.isUpperCase(ch[i])){
					str+="_";
					str+=String.valueOf(Character.toLowerCase(ch[i]));
				}
				else{
					str+=String.valueOf(ch[i]);
				}
			}
			return str;
		}
		else if(now==2){//テ・ツ?・テ・ツ環崚」ツ?轡
			//テ」ツ?敕」ツ?ョテ」ツ?セテ」ツ?セテ」ツ?ァOK
			return String.valueOf(ch);
		}
		return "NG";
	}
}
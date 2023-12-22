import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0,j;
		boolean bool = false;
		String str[]=sc.nextLine().split(" ");
		for(int k=0;k<26;k++){
			for(i=0;i<str.length;i++){
				char ch[]=str[i].toCharArray();
				for(j=0;j<ch.length;j++){
					if(Character.isLowerCase(ch[j])){//ツ渉ャツ閉カツ篠堋つゥツづつ、ツつゥ
						ch[j]=(char)((ch[j]+1)%26+'a');
					}
				}//forツ　j
				str[i]=new String(ch);
				if(str[i].equals("the")||str[i].equals("this")||str[i].equals("that"))
					bool=true;
			}//for i
			if(bool) break;
		}//forツ　k
		boolean f=true;
		for(i=0;i<str.length;i++){
			if(!f)System.out.print(" ");
			f=false;
			System.out.print(str[i]);
		}
		System.out.println();
	}
}
import java.util.Scanner;

class Main{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		while(sc.hasNext()){
			String str = sc.nextLine();
			char[] c = str.toCharArray();
			String temp="";
			for(int j = 0; j < 26; j++){
				for(int i=0;i<c.length;i++){
					if('a' <= c[i] && c[i] <= 'z')
						if(c[i] == 'z')
							c[i] = 'a';
						else
							c[i]++;
				}
				temp = String.valueOf(c);
				if (temp.contains("that")||
						temp.contains("this")||
						temp.contains("the")){
					System.out.println(temp);
					break;
				}
			}
		}
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String tmp = new String();
		String str1 = new String();
		String str2 = new String();
	//	char[] ch = s.toCharArray();
		int count = 0;
		int flag =0;
		while(s.contains("ST")){
			char[] ch = s.toCharArray();
			for(int i=0;i<ch.length-1;i++){
				if (ch[i]==83&&ch[i+1]==84){
					str1=s.substring(0,i);
					str2=s.substring(i+2, s.length());
					break;
				}
			}
			s = str1+str2;
		}
		System.out.println(s.length());
	}

}
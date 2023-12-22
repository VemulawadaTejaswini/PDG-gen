import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		String[] a={" ","'",",","-",".","?","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String[] b1={"101","000000","000011","10010001","010001","000001","100101","10011010","0101","0001","110","01001","10011011","010000","0111","10011000","0110","00100","10011001","10011110","00101","111","10011111","1000","00110","00111","10011100","10011101","000010","10010010","10010011","10010000"};
		String[] b2={"11010","11110","11100","11101","11011","11111","00000","00001","00010","00011","00100","00101","00110","00111","01000","01001","01010","01011","01100","01101","01110","01111","10000","10001","10010","10011","10100","10101","10110","10111","11000","11001"};
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine()){
			char[] c1=sc.nextLine().toCharArray();
			String str1="";
			for(int i=0;i<c1.length;i++){
				for(int j=0;j<a.length;j++){
					if(a[j].equals(c1[i]+"")){
						str1+=b2[j];
						break;
					}
				}
			}
			String str2="";
			String answer="";
			for(int i=0;i<str1.length();i++){
				str2+=str1.charAt(i);
				for(int j=0;j<b1.length;j++){
					if(str2.equals(b1[j])){
						answer+=a[j];
						str2="";
						break;
					}
				}
			}
			System.out.println(answer);
		}
	}
}
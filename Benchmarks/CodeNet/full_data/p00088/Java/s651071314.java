import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//while(scan.hasNext()){
			String str = scan.nextLine();
			char[] ch = str.toCharArray();
			String newstr = "";
			for(int i = 0;i < ch.length;i++){
				switch(ch[i]){
					case ' ': newstr += "101";	break;//
					case '\'': newstr += "000000";	break;//
					case ',': newstr += "000011"; break;//
					case '-': newstr += "10010001"; break;//
					case '.': newstr += "010001"; break;//
					case '?': newstr += "000001"; break;//
					case 'A': newstr += "100101"; break;//
					case 'B': newstr += "10011010"; break;//
					case 'C': newstr += "0101"; break;//
					case 'D': newstr += "0001"; break;//
					case 'E': newstr += "110"; break;//
					case 'F': newstr += "01001"; break;//
					case 'G': newstr += "10011011"; break;//
					case 'H': newstr += "010000"; break;//
					case 'I': newstr += "0111"; break;//
					case 'J': newstr += "10011000"; break;//
					case 'K': newstr += "0110"; break;//
					case 'L': newstr += "00100"; break;//
					case 'M': newstr += "10011001"; break;//
					case 'N': newstr += "10011110"; break;//
					case 'O': newstr += "00101"; break;//
					case 'P': newstr += "111"; break;//
					case 'Q': newstr += "10011111"; break;//
					case 'R': newstr += "1000"; break;//
					case 'S': newstr += "00110"; break;//
					case 'T': newstr += "00111"; break;//
					case 'U': newstr += "10011100"; break;//
					case 'V': newstr += "10011101"; break;//
					case 'W': newstr += "000010"; break;//
					case 'X': newstr += "10010010"; break;//
					case 'Y': newstr += "10010011"; break;//
					case 'Z': newstr += "10010000"; break;//
				}
			}
			while(newstr.length() % 5 != 0){
				newstr += "0";
			}
			//System.out.println(newstr);
			str = "";
			for(int i = 0;i < newstr.length();i += 5){
				if(newstr.substring(i,i+5).equals("00000")){
					str += "A";
				}else if(newstr.substring(i,i+5).equals("00001")){
					str += "B";
				}else if(newstr.substring(i,i+5).equals("00010")){
					str += "C";
				}else if(newstr.substring(i,i+5).equals("00011")){
					str += "D";
				}else if(newstr.substring(i,i+5).equals("00100")){
					str += "E";
				}else if(newstr.substring(i,i+5).equals("00101")){
					str += "F";
				}else if(newstr.substring(i,i+5).equals("00110")){
					str += "G";
				}else if(newstr.substring(i,i+5).equals("00111")){
					str += "H";
				}else if(newstr.substring(i,i+5).equals("01000")){
					str += "I";
				}else if(newstr.substring(i,i+5).equals("01001")){
					str += "J";
				}else if(newstr.substring(i,i+5).equals("01010")){
					str += "K";
				}else if(newstr.substring(i,i+5).equals("01011")){
					str += "L";
				}else if(newstr.substring(i,i+5).equals("01100")){
					str += "M";
				}else if(newstr.substring(i,i+5).equals("01101")){
					str += "N";
				}else if(newstr.substring(i,i+5).equals("01110")){
					str += "O";
				}else if(newstr.substring(i,i+5).equals("01111")){
					str += "P";
				}else if(newstr.substring(i,i+5).equals("10000")){
					str += "Q";
				}else if(newstr.substring(i,i+5).equals("10001")){
					str += "R";
				}else if(newstr.substring(i,i+5).equals("10010")){
					str += "S";
				}else if(newstr.substring(i,i+5).equals("10011")){
					str += "T";
				}else if(newstr.substring(i,i+5).equals("10100")){
					str += "U";
				}else if(newstr.substring(i,i+5).equals("10101")){
					str += "V";
				}else if(newstr.substring(i,i+5).equals("10110")){
					str += "W";
				}else if(newstr.substring(i,i+5).equals("10111")){
					str += "X";
				}else if(newstr.substring(i,i+5).equals("11000")){
					str += "Y";
				}else if(newstr.substring(i,i+5).equals("11001")){
					str += "Z";	
				}else if(newstr.substring(i,i+5).equals("11010")){
					str += " ";
				}else if(newstr.substring(i,i+5).equals("11011")){
					str += ".";	
				}else if(newstr.substring(i,i+5).equals("11100")){
					str += ",";	
				}else if(newstr.substring(i,i+5).equals("11101")){
					str += "-";
				}else if(newstr.substring(i,i+5).equals("11110")){
					str += "'";
				}else if(newstr.substring(i,i+5).equals("11111")){
					str += "?";
				}
			}
			System.out.println(str);
		//}
	}
}
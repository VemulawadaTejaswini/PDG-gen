import java.util.Scanner;

public class Main{
	Main(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String str = sc.nextLine();
			String st = "";
			
			for(int i=0, l=str.length(); i < l; i++){
				st += trans(str.substring(i, i+1));
			}
			if(st.length()%5 != 0){
				for(int i=0, l=5-st.length()%5; i < l; i++){
					st += "0";
				}
			}
			for(int i=0, l=st.length(); i < l; i+=5){
				System.out.print(conv(st.substring(i,i+5)));
			}
			System.out.println();
		}
	}
	
	String trans(String str){
		if(str.equals(" ")){
			return "101";
		}
		if(str.equals("'")){
			return "000000";
		}
		if(str.equals(",")){
			return "000011";
		}
		if(str.equals("-")){
			return "10010001";
		}
		if(str.equals(".")){
			return "010001";
		}
		if(str.equals("?")){
			return "000001";
		}
		if(str.equals("A")){
			return "100101";
		}
		if(str.equals("B")){
			return "10011010";
		}
		if(str.equals("C")){
			return "0101";
		}
		if(str.equals("D")){
			return "0001";
		}
		if(str.equals("E")){
			return "110";
		}
		if(str.equals("F")){
			return "01001";
		}
		if(str.equals("G")){
			return "10011011";
		}
		if(str.equals("H")){
			return "010000";
		}
		if(str.equals("I")){
			return "0111";
		}
		if(str.equals("J")){
			return "10011000";
		}
		if(str.equals("K")){
			return "0110";
		}
		if(str.equals("L")){
			return "00100";
		}
		if(str.equals("M")){
			return "10011001";
		}
		if(str.equals("N")){
			return "10011110";
		}
		if(str.equals("O")){
			return "00101";
		}
		if(str.equals("P")){
			return "111";
		}
		if(str.equals("Q")){
			return "10011111";
		}
		if(str.equals("R")){
			return "1000";
		}
		if(str.equals("S")){
			return "00110";
		}
		if(str.equals("T")){
			return "00111";
		}
		if(str.equals("U")){
			return "10011100";
		}
		if(str.equals("V")){
			return "10011101";
		}
		if(str.equals("W")){
			return "000010";
		}
		if(str.equals("X")){
			return "10010010";
		}
		if(str.equals("Y")){
			return "10010011";
		}
		return "10010000";
	}
	
	String conv(String str){
		if(str.equals("00000")){
			return "A";
		}
		if(str.equals("00001")){
			return "B";
		}
		if(str.equals("00010")){
			return "C";
		}
		if(str.equals("00011")){
			return "D";
		}
		if(str.equals("00100")){
			return "E";
		}
		if(str.equals("00101")){
			return "F";
		}
		if(str.equals("00110")){
			return "G";
		}
		if(str.equals("00111")){
			return "H";
		}
		if(str.equals("01000")){
			return "I";
		}
		if(str.equals("01001")){
			return "J";
		}
		if(str.equals("01010")){
			return "K";
		}
		if(str.equals("01011")){
			return "L";
		}
		if(str.equals("01100")){
			return "M";
		}
		if(str.equals("01101")){
			return "N";
		}
		if(str.equals("01110")){
			return "O";
		}
		if(str.equals("01111")){
			return "P";
		}
		if(str.equals("10000")){
			return "Q";
		}
		if(str.equals("10001")){
			return "R";
		}
		if(str.equals("10010")){
			return "S";
		}
		if(str.equals("10011")){
			return "T";
		}
		if(str.equals("10100")){
			return "U";
		}
		if(str.equals("10101")){
			return "V";
		}
		if(str.equals("10110")){
			return "W";
		}
		if(str.equals("10111")){
			return "X";
		}
		if(str.equals("11000")){
			return "Y";
		}
		if(str.equals("11001")){
			return "Z";
		}
		if(str.equals("11010")){
			return " ";
		}
		if(str.equals("11011")){
			return ".";
		}
		if(str.equals("11100")){
			return ",";
		}
		if(str.equals("11101")){
			return "-";
		}
		if(str.equals("11110")){
			return "'";
		}
		return "?";
	}
	
	public static void main(String[] args){
		new Main();
	}
}
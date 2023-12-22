import java.util.Scanner;
import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String text = "";
		while(scan.hasNext()){
			text += br.readLine();
		}
		char mozi[] = text.toCharArray();
		String To = "";
		for(int i = 0 ; i < mozi.length ; i++){
			String Hantei =  String.valueOf(mozi[i]);
			if(Hantei.equals("A")){
				To += "100101";
			}else if(Hantei.equals("B")){
				To += "10011010";
			}else if(Hantei.equals("C")){
				To += "0101";
			}else if(Hantei.equals("D")){
				To += "0001";
			}else if(Hantei.equals("E")){
				To += "110";
			}else if(Hantei.equals("F")){
				To += "01001";
			}else if(Hantei.equals("G")){
				To += "10011011";
			}else if(Hantei.equals("H")){
				To += "010000";
			}else if(Hantei.equals("I")){
				To += "0111";
			}else if(Hantei.equals("J")){
				To += "10011000";
			}else if(Hantei.equals("K")){
				To += "0110";
			}else if(Hantei.equals("L")){
				To += "00100";
			}else if(Hantei.equals("M")){
				To += "10011001";
			}else if(Hantei.equals("N")){
				To += "10011110";
			}else if(Hantei.equals("O")){
				To += "00101";
			}else if(Hantei.equals("P")){
				To += "111";
			}else if(Hantei.equals("Q")){
				To += "10011111";
			}else if(Hantei.equals("R")){
				To += "1000";
			}else if(Hantei.equals("S")){
				To += "00110";
			}else if(Hantei.equals("T")){
				To += "00111";
			}else if(Hantei.equals("U")){
				To += "10011100";
			}else if(Hantei.equals("V")){
				To += "10011101";
			}else if(Hantei.equals("W")){
				To += "000010";
			}else if(Hantei.equals("X")){
				To += "10010010";
			}else if(Hantei.equals("Y")){
				To += "10010011";
			}else if(Hantei.equals("Z")){
				To += "10010000";
			}else if(Hantei.equals(" ")){
				To += "101";
			}else if(Hantei.equals("'")){
				To += "000000";
			}else if(Hantei.equals(",")){
				To += "000011";
			}else if(Hantei.equals("-")){
				To += "10010001";
			}else if(Hantei.equals(".")){
				To += "010001";
			}else if(Hantei.equals("?")){
				To += "000001";
			}
		}
		int amari =  To.length()%5;
		if(amari == 1){
			To += "0000";
		}else if(amari == 2){
			To += "000";
		}else if(amari == 3){
			To += "00";
		}else if(amari == 4){
			To += "0";
		}
		int won[] = new int[To.length()/5];
		int j;
		String newtext = "";
		for(j = 0 ; j < To.length()/5 ; j++){
			won[j] = Integer.parseInt(To.substring(j*5,(j+1)*5));
			if(won[j] == 0){
				newtext += "A";
			}else if(won[j] == 1){
				newtext += "B";
			}else if(won[j] == 10){
				newtext += "C";
			}else if(won[j] == 11){
				newtext += "D";
			}else if(won[j] == 100){
				newtext += "E";
			}else if(won[j] == 101){
				newtext += "F";
			}else if(won[j] == 110){
				newtext += "G";
			}else if(won[j] == 111){
				newtext += "H";
			}else if(won[j] == 1000){
				newtext += "I";
			}else if(won[j] == 1001){
				newtext += "J";
			}else if(won[j] == 1010){
				newtext += "K";
			}else if(won[j] == 1011){
				newtext += "L";
			}else if(won[j] == 1100){
				newtext += "M";
			}else if(won[j] == 1101){
				newtext += "N";
			}else if(won[j] == 1110){
				newtext += "O";
			}else if(won[j] == 1111){
				newtext += "P";
			}else if(won[j] == 10000){
				newtext += "Q";
			}else if(won[j] == 10001){
				newtext += "R";
			}else if(won[j] == 10010){
				newtext += "S";
			}else if(won[j] == 10011){
				newtext += "T";
			}else if(won[j] == 10100){
				newtext += "U";
			}else if(won[j] == 10101){
				newtext += "V";
			}else if(won[j] == 10110){
				newtext += "W";
			}else if(won[j] == 10111){
				newtext += "X";
			}else if(won[j] == 11000){
				newtext += "Y";
			}else if(won[j] == 11001){
				newtext += "Z";
			}else if(won[j] == 11010){
				newtext += " ";
			}else if(won[j] == 11011){
				newtext += ".";
			}else if(won[j] == 11100){
				newtext += ",";
			}else if(won[j] == 11101){
				newtext += "-";
			}else if(won[j] == 11110){
				newtext += "'";
			}else{
				newtext += "?";
			}
		}
		System.out.println(newtext);
	}
}
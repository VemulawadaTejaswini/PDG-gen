import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		while(scan.hasNext()){
			String n =scan.next();
			char Ch1[] = n.toCharArray();
			int ch1[] = new int[10];
			for(int i = 0; i < 10 ; i++){
				ch1[i] = Integer.parseInt("" + Ch1[i]);
			}
			int ch2[] = new int[9];
			int ch3[] = new int[8];
			int ch4[] = new int[7];
			int ch5[] = new int[6];
			int ch6[] = new int[5];
			int ch7[] = new int[4];
			int ch8[] = new int[3];
			int ch9[] = new int[2];
			int ch10 = 0;
			String s;
			for(int i = 0; i < 9 ; i++){
				ch2[i] = ch1[i] + ch1[i+1];
				if(Integer.toString(ch2[i]).length() >=2){
					s = String.valueOf(ch2[i]);
					s = s.substring(Integer.toString(ch2[i]).length()-1,Integer.toString(ch2[i]).length());
					ch2[i] = Integer.parseInt(s);
				}
			}
			for(int i = 0; i < 8 ; i++){
				ch3[i] = ch2[i] + ch2[i+1];
				if(Integer.toString(ch3[i]).length() >=2){
					s = String.valueOf(ch3[i]);
					s = s.substring(Integer.toString(ch3[i]).length()-1,Integer.toString(ch3[i]).length());
					ch3[i] = Integer.parseInt(s);
				}
			}
			for(int i = 0; i < 7 ; i++){
				ch4[i] = ch3[i] + ch3[i+1];
				if(Integer.toString(ch4[i]).length() >=2){
					s = String.valueOf(ch4[i]);
					s = s.substring(Integer.toString(ch4[i]).length()-1,Integer.toString(ch4[i]).length());
					ch4[i] = Integer.parseInt(s);
				}
			}
			for(int i = 0; i < 6 ; i++){
				ch5[i] = ch4[i] + ch4[i+1];
				if(Integer.toString(ch5[i]).length() >=2){
					s = String.valueOf(ch5[i]);
					s = s.substring(Integer.toString(ch5[i]).length()-1,Integer.toString(ch5[i]).length());
					ch5[i] = Integer.parseInt(s);
				}
			}
			for(int i = 0; i < 5 ; i++){
				ch6[i] = ch5[i] + ch5[i+1];
				if(Integer.toString(ch6[i]).length() >=2){
					s = String.valueOf(ch6[i]);
					s = s.substring(Integer.toString(ch6[i]).length()-1,Integer.toString(ch6[i]).length());
					ch6[i] = Integer.parseInt(s);
				}
			}
			for(int i = 0; i < 4 ; i++){
				ch7[i] = ch6[i] + ch6[i+1];
				if(Integer.toString(ch7[i]).length() >=2){
					s = String.valueOf(ch7[i]);
					s = s.substring(Integer.toString(ch7[i]).length()-1,Integer.toString(ch7[i]).length());
					ch7[i] = Integer.parseInt(s);
				}
			}
			for(int i = 0; i < 3 ; i++){
				ch8[i] = ch7[i] + ch7[i+1];
				if(Integer.toString(ch8[i]).length() >=2){
					s = String.valueOf(ch8[i]);
					s = s.substring(Integer.toString(ch8[i]).length()-1,Integer.toString(ch8[i]).length());
					ch8[i] = Integer.parseInt(s);
				}
			}
			for(int i = 0; i < 2 ; i++){
				ch9[i] = ch8[i] + ch8[i+1];
				if(Integer.toString(ch9[i]).length() >=2){
					s = String.valueOf(ch9[i]);
					s = s.substring(Integer.toString(ch9[i]).length()-1,Integer.toString(ch9[i]).length());
					ch9[i] = Integer.parseInt(s);
				}
			}
			ch10 = ch9[0] + ch9[1];
			if(Integer.toString(ch10).length() >=2){
				s = String.valueOf(ch10);
				s = s.substring(Integer.toString(ch10).length()-1,Integer.toString(ch10).length());
				ch10 = Integer.parseInt(s);
			}
			System.out.println(ch10);
		}
	}
}
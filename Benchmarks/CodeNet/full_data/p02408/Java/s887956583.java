package main;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{

		Scanner scan = new Scanner(System.in);
		//BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> suite = new ArrayList<String>();
		ArrayList<Integer> number = new ArrayList<Integer>();
		String n =scan.nextLine();
		while(scan.hasNextInt()){
			String x = scan.next();
			suite.add(x);
			String y = scan.next();
			int yy = Integer.parseInt(y);
			number.add(yy);
		}
		//System.out.println("owari");
		for(int tes =0; tes<suite.size();tes++){
			System.out.println(suite.get(tes)+" "+number.get(tes));
		}
		for(int i=1; i!=14; i++ ){//???????????????1-13?????¢???
			System.out.println("spd");
			for (int ii=0;ii<suite.size();ii++)
			{
				System.out.println("spade");
				if(suite.get(ii) =="S" && number.get(ii) == number.get(i)){
					//???????????????????????¨??????
					break;
				}
				else{
					System.out.println(suite.get(i)+" "+number.get(i));
				}
			}
		}
		for(int i=1; i!=14; i++ ){//????????????1-13?????¢???
			for (int ii=0;ii<suite.size();ii++)
			{
				if(suite.get(ii) =="H" && number.get(ii) == number.get(i)){
					//???????????????????????¨??????
					break;
				}
				else{
					System.out.println(suite.get(i)+" "+number.get(i));
				}
			}
		}
		for(int i=1; i!=14; i++ ){//????????????1-13?????¢???
			for (int ii=0;ii<suite.size();ii++)
			{
				if(suite.get(ii) =="C" && number.get(ii) == number.get(i)){
					//???????????????????????¨??????
					break;
				}
				else{
					System.out.println(suite.get(i)+" "+number.get(i));
				}
			}
		}
		for(int i=1; i!=14; i++ ){//????????¢???1-13?????¢???
			for (int ii=0;ii<suite.size();ii++)
			{
				if(suite.get(ii) =="D" && number.get(ii) == number.get(i)){
					//???????????????????????¨??????
					break;
				}
				else{
					System.out.println(suite.get(i)+" "+number.get(i));
				}
			}
		}
	}
}
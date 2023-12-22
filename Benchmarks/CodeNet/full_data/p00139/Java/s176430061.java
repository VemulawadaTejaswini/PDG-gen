import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	enum State{
		START, MOUTH, EYE_A, EYE_B, BODY_A1, BODY_A2, BODY_B1, BODY_B2, MID_A, TAIL_A, TAIL_B1, TAIL_B2, NA;
	}
	
	String snake(String s){
		State state=State.START;
		int length=0;
		
		LOOP:
		for(int i=0;i<s.length();++i){
			char next=s.charAt(i);
			
			switch(state){
			case START:
				if(next=='>') state=State.MOUTH;
				else state=State.NA;
				break;
			case MOUTH:
				if(next=='\'') state=State.EYE_A;
				else if(next=='^') state=State.EYE_B;
				else state=State.NA;
				break;
			case EYE_A:
				if(next=='='){
					state=State.BODY_A1;
					length=0;
				}
				else state=State.NA;
				break;
			case BODY_A1:
				++length;
				if(next=='=') state=State.BODY_A1;
				else if(next=='#') state=State.MID_A;
				else state=State.NA;
				break;
			case MID_A:
				if(next=='=') state=State.BODY_A2;
				else state=State.NA;
				break;
			case BODY_A2:
				--length;
				if(next=='=') state=State.BODY_A2;
				else if(next=='~'&&length==0) state=State.TAIL_A;
				else state=State.NA;
				break;
			case EYE_B:
				if(next=='Q') state=State.BODY_B1;
				else state=State.NA;
				break;
			case BODY_B1:
				if(next=='=') state=State.BODY_B2;
				else state=State.NA;
				break;
			case BODY_B2:
				if(next=='Q') state=State.BODY_B1;
				else if(next=='~') state=State.TAIL_B1;
				else state=State.NA;
				break;
			case TAIL_B1:
				if(next=='~') state=State.TAIL_B2;
				else state=State.NA;
				break;
			default:
				break LOOP;
			}
		}
		
		switch(state){
		case TAIL_A:
			return "A";
		case TAIL_B2:
			return "B";
		default:
			return "NA";
		}

	}
	
	BufferedReader input;
	
	int ni() throws NumberFormatException, IOException{
		return Integer.parseInt(input.readLine());
	}
	
	String ns() throws IOException{
		return input.readLine();
	}
	
	void io(){
		input=new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n=ni();
			for(int i=0;i<n;++i){
				System.out.println(snake(ns()));
			}
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}
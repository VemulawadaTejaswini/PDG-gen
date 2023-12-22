import java.util.*;
public class Main {
	
	static int judge(double g){
		if(g <= 48.00) return 0;
		for(int i=0; i<=3; i++)
			if(g>48.00+3*i && g<=51.00+3*i) return i+1;
		if(g>60.00 && g<=64.00) return 5;
		if(g>64.00 && g<=69.00) return 6;
		if(g>69.00 && g<=75.00) return 7;
		if(g>75.00 && g<=81.00) return 8;
		if(g>81.00 && g<=91.00) return 9;
		return 10;
	}
	
	static String name(int i){
		switch(i){
		case 0:	return "light fly";
		case 1: return "fly";
		case 2: return "bantam";
		case 3: return "feather";
		case 4: return "light";
		case 5: return "light welter";
		case 6: return "welter";
		case 7: return "light middle";
		case 8:	return "middle";
		case 9: return "light heavy";
		default: return "heavy";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			System.out.println(name(judge(sc.nextDouble())));			
			
		}
	}

}
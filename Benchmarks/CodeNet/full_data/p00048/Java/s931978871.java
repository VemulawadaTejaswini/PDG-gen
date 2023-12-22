import java.util.Scanner;

public enum Main{
	LF("light fly"), FL("fly"), BT("bantam"), FE("feather"), LG("light"), LW("light welter"),
	WT("welter"), LM("light middle"), MI("middle"), LH("light heavy"), HV("heavy"); 
	
	private String s;
	private Main(String str) { this.s = str;}
	public String toString() { return this.s;}
	
	private static Main classify(double weight) {
		if(weight <= 48) return LF;
		else if(weight <= 51) return FL;
		else if(weight <= 54) return BT;
		else if(weight <= 57) return FE;
		else if(weight <= 60) return LG;
		else if(weight <= 64) return LW;
		else if(weight <= 69) return WT;
		else if(weight <= 75) return LM;
		else if(weight <= 81) return MI;
		else if(weight <= 91) return LH;
		else return HV;
	}
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextDouble()) System.out.println(classify(sc.nextDouble()));
		sc.close();
	}
}
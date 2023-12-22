import java.util.Scanner;
import java.util.regex.Pattern;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in).useDelimiter("\\r\\n");
		while(stdIn.hasNext()){
			StringBuffer cipher = new StringBuffer(stdIn.next());
			System.out.println(getComplex(cipher));
		}
	}

	public static String getComplex(StringBuffer cipher){
		Pattern pattern = Pattern.compile(".*the.*|.*this.*|.*that.*");
		
		for(int i=0;i<26;i++){

			if(pattern.matcher(cipher).find())break;

			for(int j=0;j<cipher.length();j++){
				if(cipher.charAt(j) == '.')continue;
				if(cipher.charAt(j) == ' ')continue;
				if(cipher.charAt(j) == 'a')cipher.replace(j,j+1,"b");
				else if(cipher.charAt(j) == 'b')cipher.replace(j,j+1,"c");
				else if(cipher.charAt(j) == 'c')cipher.replace(j,j+1,"d");
				else if(cipher.charAt(j) == 'd')cipher.replace(j,j+1,"e");
				else if(cipher.charAt(j) == 'e')cipher.replace(j,j+1,"f");
				else if(cipher.charAt(j) == 'f')cipher.replace(j,j+1,"g");
				else if(cipher.charAt(j) == 'g')cipher.replace(j,j+1,"h");
				else if(cipher.charAt(j) == 'h')cipher.replace(j,j+1,"i");
				else if(cipher.charAt(j) == 'i')cipher.replace(j,j+1,"j");
				else if(cipher.charAt(j) == 'j')cipher.replace(j,j+1,"k");
				else if(cipher.charAt(j) == 'k')cipher.replace(j,j+1,"l");
				else if(cipher.charAt(j) == 'l')cipher.replace(j,j+1,"m");
				else if(cipher.charAt(j) == 'm')cipher.replace(j,j+1,"n");
				else if(cipher.charAt(j) == 'n')cipher.replace(j,j+1,"o");
				else if(cipher.charAt(j) == 'o')cipher.replace(j,j+1,"p");
				else if(cipher.charAt(j) == 'p')cipher.replace(j,j+1,"q");
				else if(cipher.charAt(j) == 'q')cipher.replace(j,j+1,"r");
				else if(cipher.charAt(j) == 'r')cipher.replace(j,j+1,"s");
				else if(cipher.charAt(j) == 's')cipher.replace(j,j+1,"t");
				else if(cipher.charAt(j) == 't')cipher.replace(j,j+1,"u");
				else if(cipher.charAt(j) == 'u')cipher.replace(j,j+1,"v");
				else if(cipher.charAt(j) == 'v')cipher.replace(j,j+1,"w");
				else if(cipher.charAt(j) == 'w')cipher.replace(j,j+1,"x");
				else if(cipher.charAt(j) == 'x')cipher.replace(j,j+1,"y");
				else if(cipher.charAt(j) == 'y')cipher.replace(j,j+1,"z");
				else if(cipher.charAt(j) == 'z')cipher.replace(j,j+1,"a");
			}
		}
		return cipher.toString();
	}
}
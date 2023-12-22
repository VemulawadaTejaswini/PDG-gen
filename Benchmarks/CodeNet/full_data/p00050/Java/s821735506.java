import java.util.Scanner;

public class Main {
	public static void main (String[] args){
			Scanner sc = new Scanner(System.in);
			String[] section;
			String newstr = "";
			String line = sc.nextLine();
			if(line.indexOf("apple") != -1){
				section = line.split("apple");
				for(int i = 0; i < section.length; i++){
					section[i] = section[i].replace("peach", "apple");
					newstr += section[i];
					if(i != section.length - 1){newstr += "peach";}
				}
				if(line.lastIndexOf("apple") == line.length() - "apple".length()){
					newstr += "peach";
				}
			}else{
				newstr = line.replace("peach", "apple");
			}
			System.out.println(newstr);
			
	}
}
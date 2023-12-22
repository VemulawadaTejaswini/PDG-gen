import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		StringBuilder reverse;
		String line;
		String[] imperative;
		str.append(scan.nextLine());
		for (int i = 0; i < Integer.parseInt(scan.nextLine()); i++) {
			line = scan.nextLine();
			imperative = line.split(" ");
			if(imperative[0].equals("print")){
				System.out.println(str.substring(Integer.parseInt(imperative[1]), Integer.parseInt(imperative[2])));
			}else if(imperative[0].equals("reverse")){
				reverse = str.reverse();
				str.replace(Integer.parseInt(imperative[1]), Integer.parseInt(imperative[2]), reverse.substring(Integer.parseInt(imperative[1]), Integer.parseInt(imperative[2])));
			}else{
				str.replace(Integer.parseInt(imperative[1]), Integer.parseInt(imperative[2]), imperative[3]);
			}
			/*
			switch (imperative[0]) {
			case "print":
				System.out.println(str.substring(Integer.parseInt(imperative[1]), Integer.parseInt(imperative[2])));
			case "reverse":
				reverse = str.reverse();
				str.replace(Integer.parseInt(imperative[1]), Integer.parseInt(imperative[2]), reverse.substring(Integer.parseInt(imperative[1]), Integer.parseInt(imperative[2])));
			case "replace":
				str.replace(Integer.parseInt(imperative[1]), Integer.parseInt(imperative[2]), imperative[3]);
			}
			*/
		}
		
	}
}
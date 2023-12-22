import java.util.Scanner;

public class Main {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String a = scanner.nextLine();
String[]temp  =a.split(" ");
do{
if(temp[1].equals("+"))
 System.out.println(Integer.parseInt(temp[0])+Integer.parseInt(temp[2]));
else if (temp[1].equals("-"))
System.out.println(Integer.parseInt(temp[0])-Integer.parseInt(temp[2]));
else if (temp[1].equals("*"))
System.out.println(Integer.parseInt(temp[0])*Integer.parseInt(temp[2]));
else if (temp[1].equals("/"))
System.out.println(Integer.parseInt(temp[0])/Integer.parseInt(temp[2]));
else if (temp[1].equals("?"))
System.out.println("error");
else break;
}while( temp[1].equals("?"));
}

}
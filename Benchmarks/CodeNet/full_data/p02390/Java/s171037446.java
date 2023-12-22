import java.util.Scanner;

class Main{

public static String hours(int sec){
int min = sec%360;
int hour = sec / 360;
return hour + ":" + min + ";" + sec;

}
	
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int p = scanner.nextInt();

System.out.println(hours(p));

}
}


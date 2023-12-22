 
class Main{
	public static void main(String[] args) {
		int InputSecond = new java.util.Scanner(System.in).nextInt();
		int hours;
		int minutes;
		int seconds;
		
		hours = InputSecond / 3600;
		minutes = (InputSecond % 3600) / 60;
		seconds = InputSecond % 60;
		System.out.println(hours + ":" + minutes + ":" + seconds);
	}
}
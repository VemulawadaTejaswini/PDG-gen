public class Main { 
	public static void main(String[] args){
		int inSeconds = new java.util.Scanner(System.in).nextInt();
		int outHours = inSeconds / (60*60);
		inSeconds = inSeconds % (60*60);
		int outMinutes = inSeconds / 60;
		inSeconds = inSeconds % 60;
		int outSeconds = inSeconds;
		System.out.println(outHours + ":" +outMinutes + ":" + outSeconds);
	}
}
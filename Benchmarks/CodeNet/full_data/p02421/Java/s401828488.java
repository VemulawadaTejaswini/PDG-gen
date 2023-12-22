import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static int pointT=0;
	private static int pointH=0;
	private static int size=sc.nextInt();
	public static void main(String[] args){
		for(int i=0;i<size;i++){
			String wordT=sc.next();
			String wordH=sc.next();
			battle(wordT,wordH);
		}
		System.out.println(pointT+" "+pointH);
	}
	private static void battle(String t,String h){
		if(t.compareTo(h)>0) pointT+=3;
		if(t.compareTo(h)<0) pointH+=3;
		if(t.compareTo(h)==0){
			pointH++;
			pointT++;
		}
	}
}
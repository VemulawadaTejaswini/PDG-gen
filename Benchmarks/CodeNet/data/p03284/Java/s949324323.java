import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int atCoderCracker = sc.nextInt();
		int atCoderParticipants = sc.nextInt();
		
		Person takahashi = new Person();
		takahashi.shoutInjusticeToTheWorld(atCoderCracker, atCoderParticipants);
	}
}

class Person {
	public void shoutInjusticeToTheWorld(int atCoderCracker, int atCoderParticipants) {
		int volumeOfInjustice = atCoderCracker % atCoderParticipants == 0 ? 0 : 1;
		System.out.println(volumeOfInjustice);
	}
}
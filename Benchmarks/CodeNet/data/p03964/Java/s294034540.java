import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numberOfChecks = sc.nextInt();
		long count1 = 0;
		long totalMinimumVotes = 0;
		long count2 = 2;
		
		while (count1 < numberOfChecks) {
			int votesForA = sc.nextInt();
			int votesForB = sc.nextInt();
			while (count2 >= 0) {
				if (count2 % (votesForA + votesForB) == 0) {
					break;
				} else {
					count2++;
				}
			}
			count1++;
		}
		System.out.println(count2);
	}
}
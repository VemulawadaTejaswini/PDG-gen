import java.util.*;

public class Main {
	public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
    	int i, number_of_people, answer;
      	int[] limit = new int[5];
      	number_of_people = Integer.parseInt(sc.next());
      	for(i = 0; i < 5; i++) limit[i] = Integer.parseInt(sc.next());
      	Arrays.sort(limit);
      	if(number_of_people % limit[0] == 0) answer = number_of_people / limit[0] + 4;
      	else answer = number_of_people / limit[0] + 5;
      	System.out.println(answer);
    }
}
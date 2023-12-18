import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String[] lineKNQ = sc.nextLine().split(" ");
    	int intPersons = Integer.parseInt(lineKNQ[0]);
    	int initScore = Integer.parseInt(lineKNQ[1]);
    	int countMatch = Integer.parseInt(lineKNQ[2]);
    	
    	//set the socre of preson
    	Map<Integer,Integer> personAndScore = new LinkedHashMap();
    	for(int i = 1;i<=intPersons;i++) {
    		personAndScore.put(i, initScore);
    	}
    	
    	//commit the match
    	for(int i = 1;i<=countMatch;i++) {
    		int winner = Integer.parseInt(sc.nextLine());
    		for(int key:personAndScore.keySet()) {
    			if(winner == key) {
    				personAndScore.put(key, personAndScore.get(key));
    			}else {
    				personAndScore.put(key, personAndScore.get(key)-1);
    			}
    		}
    	}
    	
    	for(int key:personAndScore.keySet()) {
    		if(personAndScore.get(key) >= 1) {
    			System.out.println("Yes");
    		}else {
    			System.out.println("No");
    		}
    	}
    	
    }
}
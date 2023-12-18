import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int age;
	int charge;

	age = sc.nextInt();
	charge = sc.nextInt();
	if(age % 2 == 0){
	    if(6 <= age && age <= 12){
		charge = charge / 2;
	    } else if (age <= 5){
		charge = 0;
	    }
	}
	System.out.println(charge);
    }
}
	
	    
	

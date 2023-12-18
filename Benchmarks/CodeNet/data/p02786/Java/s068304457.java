import java.util.*;
class Main{
    static double numAttack = 0;
	public static void main(String args[]){
    	Scanner s = new Scanner(System.in);
      	double health = s.nextDouble();
      	attackMonster(health);
      	System.out.println((int)numAttack);
    }
    static void attackMonster(double health){
        numAttack++;
        if(health==1){
            health = 0;
        }
        else{
            attackMonster(Math.floor(health/2));
            attackMonster(Math.floor(health/2));
        }
    }
}

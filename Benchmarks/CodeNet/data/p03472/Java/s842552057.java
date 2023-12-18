import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String[] tmpArray = input.split(" ");
		int n = Integer.parseInt(tmpArray[0]);
		int hp = Integer.parseInt(tmpArray[1]);
		
//		int[] attack = new int[n];
//		int[] throwAtk = new int[n];
		Attack attack[] = new Attack[2*n];
		
//		int throwSum = 0;
//		int maxAtk = 0;
		for(int i = 0; i < n; i++){
			tmpArray = br.readLine().split(" ");
			int a = Integer.parseInt(tmpArray[0]);
			int b = Integer.parseInt(tmpArray[1]);
			attack[2*i] = new Attack(a, true);
			attack[2*i + 1] = new Attack(b, false);
//			throwSum += throwAtk[i];
//			maxAtk = Math.max(maxAtk, attack[i]);
		}
		
		int result = 0;
		Arrays.sort(attack);
		
		for(int i = 2*n - 1; i >= 0 ; i--){
			if(attack[i].unlimited){
//				System.out.println("attack");
				if(hp % attack[i].damage != 0){
					result++;
				}
				result += hp/attack[i].damage;
				break;
			}
			else {
//				System.out.println("throw");
				hp -= attack[i].damage;
				result++;
				if(hp <= 0){
					break;
				}
			}
		}
		
		System.out.println(result);
	}

}

class Attack implements Comparable<Attack>{
	int damage;
	boolean unlimited;
	public Attack(int damage, boolean unlimited){
		this.damage = damage;
		this.unlimited = unlimited;
	}
	public int compareTo(Attack atk) {
		// TODO Auto-generated method stub
		return this.damage - atk.damage;
	}
	
	
}
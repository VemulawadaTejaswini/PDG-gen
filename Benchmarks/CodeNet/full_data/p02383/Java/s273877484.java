import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		List<Integer> firstList  = new ArrayList<>();
		List<String>  secondList = new ArrayList<>();
		
		while(sc.hasNext()){
			
			String next = sc.next();
			
			try{
				int number = Integer.parseInt(next);
				firstList.add(number);
				
			}catch(NumberFormatException e){
				
				for(int i= 0; i < next.length();i++){
					
					secondList.add(String.valueOf(next.charAt(i)));
					
				}
				
			}
			
		}
		
		Main.Dice dice = new Main().new Dice(firstList);
		
		for(String direction : secondList){
			
			dice =dice.roll(direction);
			
		}
		
		System.out.println(dice.showTop());
		
		sc.close();
		

	}
	
	
	class Dice{
		
		private int one;
		private int two;
		private int three;
		private int four;
		private int five;
		private int six;
		
		Dice(List<Integer> arg){
			
			if(arg == null || arg.size() != 6){
				throw new IllegalArgumentException();
			}
			
			this.one  = arg.get(0);
			this.two  = arg.get(1);
			this.three= arg.get(2);
			this.four = arg.get(3);
			this.five = arg.get(4);
			this.six  = arg.get(5);
			
		}
		
		
		Dice roll(String direction){
			int tmp;
			switch(direction){
			
			case "N":
				
				tmp = this.five;
				this.five = this.one;
				this.one  = this.two;
				this.two  = this.six;
				this.six  = tmp;
				break;
				
			case "S":
				tmp = this.five;
				this.five = this.six;
				this.six  = this.two;
				this.two  = this.one;
				this.one  = tmp;
				break;
			case "W":
				tmp = this.one;
				this.one = this.three;
				this.three  = this.six;
				this.six  = this.four;
				this.four  = tmp;
				break;
				
			case "E":
				tmp = this.one;
				this.one = this.four;
				this.four  = this.six;
				this.six  = this.three;
				this.three  = tmp;
				break;
			}
			
			return this;
		}
		
		
		int showTop(){
			return this.one;
		}
	}

}


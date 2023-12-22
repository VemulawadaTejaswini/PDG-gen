import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] hand = new int[5];
		while(true){
			boolean[] IS = new boolean[]{false, false, false};
			
			for(int i = 0; i < 5; i++){
				hand[i] = sc.nextInt();
				if(hand[i] == 0){
					System.exit(0);
				}
				if(hand[i] == 1)IS[0] = true;
				if(hand[i] == 2)IS[1] = true;
				if(hand[i] == 3)IS[2] = true;
			}
			if(IS[0]&&IS[1]&&IS[2])
				for(int x = 0; x < 5; x++)
					System.out.println(3);
			else{
				if(IS[0]&&IS[1])
					for(int i = 0; i < 5; i++)
						if(hand[i] == 1)System.out.println(1);
						else System.out.println(2);
				if(IS[1]&&IS[2])
					for(int i = 0; i < 5; i++)
						if(hand[i] == 2)System.out.println(1);
						else System.out.println(2);
				if(IS[2]&&IS[0])
					for(int i = 0; i < 5; i++)
						if(hand[i] == 3)System.out.println(1);
						else System.out.println(2);
			}
		}
	}
}
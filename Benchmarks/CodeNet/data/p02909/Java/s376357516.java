import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tapSequence = sc.next();
		sc.close();
		
		String[] sequenceArr = tapSequence.split("");
		
		boolean isEasy = true;
		
		for(int i = 0; i < sequenceArr.length ; i++) {
			String tap = sequenceArr[i];
			if((i + 1) %2 == 0) {
				if(tap.equals("R")) {
					isEasy = false;
					break;
				}
			}else {
				if(tap.equals("L")) {
					isEasy = false;
					break;
				}
			}
		}
		
		if(isEasy) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}		
	}

}
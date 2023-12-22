import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		
		int numbers = Integer.parseInt(sc.next());
		String taroCard = null;
		String hanakoCard = null;
		
		int[] scores = new int[2];
		
		
		for(int i =0; i< numbers;i++){
		
			taroCard = sc.next();
			hanakoCard = sc.next();
			
			scores = computeCards(taroCard,hanakoCard,scores);
			
		}
		
		System.out.println(scores[0] +" " + scores[1]);
		
		sc.close();
		
		
	}

	private static int[] computeCards(String priorCard, String postCard,int[] score) {
		
		int count = priorCard.length() > postCard.length() ? postCard.length() : priorCard.length();
		
		for(int i=0;i<count;i++){
			
			int result = Character.compare(priorCard.charAt(i), postCard.charAt(i));
			
			if(result > 0){
				score[0] += 3;
				return score;
			}
			else if(result == 0){
				continue;
			}
			else{
				score[1] += 3;
				return score;
			}
		}
		
		if(priorCard.length() > postCard.length()){
			score[0] += 3;
			return score;
		}
		else if(priorCard.length() < postCard.length()){
			score[1] += 3;
			return score;
		}
		
		score[0] += 1;
		score[1] += 1;
		return score;
	}

}


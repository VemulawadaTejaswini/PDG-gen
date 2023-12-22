import java.util.Scanner;



public class Main{


	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);

		while(true){
		int mid_score=scan.nextInt();
		int final_score=scan.nextInt();
		int re_score=scan.nextInt();

		if(mid_score==-1&&final_score==-1&&re_score==-1){break;}

		System.out.println(grading(mid_score, final_score, re_score));

		}

		scan.close();
	}

	public static char grading(int mid_score, int final_score, int re_score){
		char char_grading='0';
		int total_score=0;
		total_score=(mid_score+final_score);

		if(mid_score==-1||final_score==-1||total_score<30){
			char_grading='F';

		}else if((total_score>=30&&total_score<50) && re_score<50){
			char_grading='D';

		}else if(((total_score>=30&&total_score<50) && re_score>=50) || (total_score>=50&&total_score<65)){
			char_grading='C';
		}else if(total_score>=65&&total_score<80){
			char_grading='B';
		}else if(total_score>=80){
			char_grading='A';
		}




		return char_grading;
	}


}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main (String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		Dice dice = new Dice();

		dice.setDice(input.readLine().split(" "));
		
		dice.setNum = Integer.parseInt(input.readLine());
		
		dice.pairAll = new String[dice.setNum][2];
		
		 //上面と前面の数字の組を1ペアとし、それをsetNumペア持つ配列pairAllを作る
	    for(int kai = 0; kai < dice.setNum; kai++)
	    {
	        String[] pair = input.readLine().split(" ");
	        
	        dice.pairAll[kai][0] = pair[0];
	        
	        dice.pairAll[kai][1] = pair[1];
	    }

		dice.Search();
	}
}


class Dice{

	public String[] dice;

	private char[] move;

	private String[] over;
	
	public int setNum;
	
	private String[] solution;
	
	public String[][] pairAll;

	public void setDice (String[] diceStr)
	{
		dice = new String[diceStr.length];

		for(int num = 0; num < diceStr.length; num++)
			dice[num] = diceStr[num];
	}

	public void Move (char[] compass)
	{
		move = compass;

		//move.length回、転がす
		for(int kai = 0; kai < move.length; kai++)
		{
			over = new String[6];

			//東に転がす場合
			if(move[kai] == 'E')
			{
				over[0] = dice[3];
				over[1] = dice[1];
				over[2] = dice[0];
				over[3] = dice[5];
				over[4] = dice[4];
				over[5] = dice[2];

				for(int num = 0; num < over.length; num++)
					dice[num] = over[num];
			}

			//西に転がす場合
			else if(move[kai] == 'W')
			{
				over[0] = dice[2];
				over[1] = dice[1];
				over[2] = dice[5];
				over[3] = dice[0];
				over[4] = dice[4];
				over[5] = dice[3];

				for(int num = 0; num < over.length; num++)
					dice[num] = over[num];
			}

			//南に転がす場合
			else if(move[kai] == 'S')
			{
				over[0] = dice[4];
				over[1] = dice[0];
				over[2] = dice[2];
				over[3] = dice[3];
				over[4] = dice[5];
				over[5] = dice[1];

				for(int num = 0; num < over.length; num++)
					dice[num] = over[num];
			}

			//北に転がす場合
			else if(move[kai] == 'N')
			{
				over[0] = dice[1];
				over[1] = dice[5];
				over[2] = dice[2];
				over[3] = dice[3];
				over[4] = dice[0];
				over[5] = dice[4];

				for(int num = 0; num < over.length; num++)
					dice[num] = over[num];
			}
		}
	}
	
	public void Search ()
	{
	    solution = new String[setNum];
	    
	    //右面の数字を探し、solutionに代入する。これをsetNum回行う
	    for(int set = 0; set < setNum; set++)
	    {
	        int[] numbers = new int[2];
	        
	        //上面と前面に対応する数字をnumbersに代入する
	        for(int kazu = 0; kazu < numbers.length; kazu++)
	        {
	            for(int num = 0; num < dice.length; num++)
	            {
	                if(pairAll[set][kazu].equals(dice[num]))
	                {
	                    numbers[kazu] = num;
	                    
	                    break;
	                }
	            }
	        }
	        
	        //右面になる場所に代入されている数字をsolutionに代入する
	        if((numbers[0] == 1 && numbers[1] == 2) || (numbers[0] == 2 && numbers[1] == 4) || (numbers[0] == 4 && numbers[1] == 3) || (numbers[0] == 3 && numbers[1] == 1))
	        {
	            solution[set] = dice[0];
	        }
	        
	        else if((numbers[0] == 0 && numbers[1] == 3) || (numbers[0] == 3 && numbers[1] == 5) || (numbers[0] == 5 && numbers[1] == 2) || (numbers[0] == 2 && numbers[1] == 0))
	        {
	            solution[set] = dice[1];
	        }
	        
	        else if((numbers[0] == 0 && numbers[1] == 1) || (numbers[0] == 1 && numbers[1] == 5) || (numbers[0] == 5 && numbers[1] == 4) || (numbers[0] == 4 && numbers[1] == 0))
	        {
	            solution[set] = dice[2];
	        }
	        
	        else if((numbers[0] == 0 && numbers[1] == 4) || (numbers[0] == 4 && numbers[1] == 5) || (numbers[0] == 5 && numbers[1] == 1) || (numbers[0] == 1 && numbers[1] == 0))
	        {
	            solution[set] = dice[3];
	        }
	        
	        else if((numbers[0] == 0 && numbers[1] == 2) || (numbers[0] == 2 && numbers[1] == 5) || (numbers[0] == 5 && numbers[1] == 3) || (numbers[0] == 3 && numbers[1] == 0))
	        {
	            solution[set] = dice[4];
	        }
	        
	        else if((numbers[0] == 1 && numbers[1] == 3) || (numbers[0] == 3 && numbers[1] == 4) || (numbers[0] == 4 && numbers[1] == 2) || (numbers[0] == 2 && numbers[1] == 1))
	        {
	            solution[set] = dice[5];
	        }
	    }
	    
	    //solutionに代入された答えを全て表示する
	    for(int kai = 0; kai < setNum; kai++)
	    
	        System.out.println(solution[kai]);
	    
	}
}



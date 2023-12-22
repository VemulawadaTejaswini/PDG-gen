import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main (String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		Dice dice = new Dice();

		dice.setDice(input.readLine().split(" "));

		String solution = dice.Move(input.readLine().toCharArray());

		System.out.println(solution);
	}
}

public class Dice {

	private String[] dice;

	private char[] move;

	private String[] over;

	public void setDice (String[] diceStr)
	{
		dice = new String[6];

		for(int num = 0; num < diceStr.length; num++)
			dice[num] = diceStr[num];
	}

	public String Move (char[] compass)
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
		return dice[0];
	}
}


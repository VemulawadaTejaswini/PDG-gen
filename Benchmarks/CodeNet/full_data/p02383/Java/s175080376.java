import java.util.Scanner;

public class MainDice
{

	public static void main(String[] args)
	{
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String[] inputValue = sc.nextLine().split(" ");
		String[] inputDirection = sc.nextLine().split("");
		MainDice instance = new MainDice();
		Dice dice = instance.new Dice(inputValue);

		for (String s : inputDirection)
		{
			switch (s)
			{
				case "N":
					dice.moveNourth();
					break;

				case "S":
					dice.moveSourth();
					break;

				case "E":
					dice.moveEast();
					break;

				case "W":
					dice.moveWest();
					break;
			}
		}

		System.out.println(dice.getTop());

	}

	public class Dice
	{
		public int[] Array = new int[6];
		private int tmp;

		public Dice(String[] num)
		{
			for (int i = 0; i < 6; ++i)
				this.Array[i] = Integer.parseInt(num[i]);
		}

		// ??????????????????????????????
		public void moveWest()
		{
			this.tmp = this.Array[0];
			this.Array[0] = this.Array[2];
			this.Array[2] = this.Array[5];
			this.Array[5] = this.Array[3];
			this.Array[3] = this.tmp;
		}

		// ??????????????????????????????
		public void moveNourth()
		{
			this.tmp = this.Array[0];
			this.Array[0] = this.Array[1];
			this.Array[1] = this.Array[5];
			this.Array[5] = this.Array[4];
			this.Array[4] = this.tmp;
		}

		// ??????????????????????????????
		public void moveEast()
		{
			this.tmp = this.Array[0];
			this.Array[0] = this.Array[3];
			this.Array[3] = this.Array[5];
			this.Array[5] = this.Array[2];
			this.Array[2] = this.tmp;
		}

		// ?????????????????????????????????
		public void moveSourth()
		{
			this.tmp = this.Array[0];
			this.Array[0] = this.Array[4];
			this.Array[4] = this.Array[5];
			this.Array[5] = this.Array[1];
			this.Array[1] = this.tmp;
		}

		public int getTop()
		{
			return this.Array[0];
		}
	}

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dice_I_40 {

	public static void main(String[] args) throws IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String first_lines = input.readLine();

		// ??\????????????????????????????´???????

		Dice insdice = new Dice(first_lines.split(" "));

		String second_lines = input.readLine();

		second_lines.toCharArray();

		insdice.dice_roll(second_lines.toCharArray());

		System.out.println(insdice.get_top());

	}
}

class Dice {

	int[] array_dice = new int[6];

	int top = 0;

	int bottom = 0;

	int front = 0;

	int back = 0;

	int right = 0;

	int left = 0;

	int num;

	// ????????????????????????????????£????????????????????\????????????????????§???????????§?????????
	Dice(String[] strings) {

			this.top=Integer.parseInt(strings[0]);

			this.front=Integer.parseInt(strings[1]);

			this.right=Integer.parseInt(strings[2]);

			this.left=Integer.parseInt(strings[3]);

			this.back=Integer.parseInt(strings[4]);

			this.bottom=Integer.parseInt(strings[5]);

			}

	void dice_roll(char []direction){

		      for(int direction_spot=0;direction_spot<direction.length; direction_spot++){

		    	  if(direction[direction_spot]=='N'){

		    		  num=top;

		    		  top=front;

		    		  front=bottom;

		    		  bottom=back;

		    		  back=num;
		    	  }else if(direction[direction_spot]=='S'){

		    		  num=top;

		    		  top=back;

		    		  back=bottom;

		    		  bottom=front;

		    		  front=num;

		    	  }else if(direction[direction_spot]=='E'){

		    		  num=top;

		    		  top=left;

		    		  left=bottom;

		    		  bottom=right;

		    		  right=num;

		    	  }else{

		    		  num=top;

		    		  top=right;

		    		  right=bottom;

		    		  bottom=left;

		    		  left=num;

		    	  }

		      }



	}

	int get_top(){

		return top;

	}
}
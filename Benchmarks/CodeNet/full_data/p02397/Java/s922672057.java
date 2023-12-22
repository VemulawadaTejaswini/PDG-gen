import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    

	String inputnum;
	while(true){
		inputnum = sc.nextLine();
		if(inputnum.equals("0 0")){
			break;
		}
	System.out.println(select(inputnum));
	}

  }
  public static String select(String inputnum){
	String space = " ";
	String nums[] = inputnum.split(space);
        int x = Integer.parseInt(nums[0]);
        int y = Integer.parseInt(nums[1]);

        if(x > y){
		int temp = x;
		x = y;
		y = temp;
		return(x + space + y);
	}
	return(x + space + y);
  }


}
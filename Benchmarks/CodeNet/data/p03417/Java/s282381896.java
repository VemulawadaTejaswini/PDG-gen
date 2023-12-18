import java.util.*;

public class Main {

  public static void main(String args[])
  {
    	Scanner sc = new Scanner(System.in);
    	String input = sc.nextLine();
    	String[] inputs = input.split(" ");
    	int row = Integer.valueOf(inputs[0]);
    	int col  = Integer.valueOf(inputs[1]);
    	long rowLong = Long.valueOf(row);
    	long colLong = Long.valueOf(col);
    	if(row ==1 && col==1) 
        {
          System.out.println('1');
          return;
        }
    	
    
    
    	if( (col== 2 ) || (row==2))
        {
          System.out.println('0');
          return;
        }
    	
    	if( row == 1) 
        {
          System.out.println(col-2);
          return;
        }
    	
    	if(col == 1)
        {
          System.out.println(row-2);
          return;
        }
    	
    	System.out.println( (rowLong-2)*(colLong-2));
  }
  
}
import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int word = scan.nextInt();
      	int last = word%100;
        int first = (word - last)/100;
      	
      	if(jadmon(last)*jadmon(first) == 1){
        	System.out.println("AMBIGUOUS");
        } else if(jadmon(first)== 1 && jadmon(last)==0){
        	System.out.println("MMYY");
        } else if(jadmon(first)==0 && jadmon(last) == 1){
        	System.out.println("YYMM");
        } else {
        	System.out.println("NA");
        }
      	
    }
  	public static int jadmon(int n){
    	if(n>0 && n<13){
        	return 1;
        } else {
        	return 0;
        }
    }
}

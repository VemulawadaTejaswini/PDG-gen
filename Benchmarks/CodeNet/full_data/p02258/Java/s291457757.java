import java.util.*;

public class Main {
	public static void main(String[] a) {
		Scanner input = new Scanner(System.in);
		int loop=input.nextInt();
		int max=0;
		int minInput=0;
		
		
		for(int i=0;i<loop;i++){
			int newNum=input.nextInt();
			
			if(i==0){
				minInput=newNum;
				max=newNum;
			}
			else if(i==1){
				max=newNum-max;
				minInput= newNum<minInput ? newNum : minInput;
			}
			else{
				max=newNum-minInput > max ? newNum-minInput : max;
				minInput= newNum<minInput ? newNum : minInput;
				
			}
			
		}
		
		System.out.println(max);
		
	}

}
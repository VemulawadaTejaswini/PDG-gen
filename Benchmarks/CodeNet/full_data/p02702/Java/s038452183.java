import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scn =new Scanner(System.in);
	//int n =scn.nextInt();
	long val2=(long)(Math.pow(2,31)-1);
	String s=scn.next();
	long count=0;
	for(int i=0;i<s.length();i++){
		long val=0;
		//System.out.print(i+"-->");
		
		  for(int j=i;(val<val2)&&j<s.length();j++){
			
				//System.out.print(j+"A");
		
			val=(val*10)+(long)(s.charAt(j)-'0');
			if(val>val2){
				break;
			}
			if((val%2019)==0){
			//	System.out.println(val);
				count++;
				
			}
	
		}
		//System.out.println();
	}
  System.out.println(count);
	}

}
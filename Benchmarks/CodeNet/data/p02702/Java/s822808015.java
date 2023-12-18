import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scn =new Scanner(System.in);
	//int n =scn.nextInt();
	String s=scn.next();
	int count=0;
	for(int i=0;i<s.length();i++){
		long val=0;
		//System.out.print(i+"-->");
		int j=i;
		  while(j<s.length()&&val<=Integer.MAX_VALUE){
			
				//System.out.print(j+"A");
		
			val=(val*10)+(long)(s.charAt(j)-'0');
			if((val%2019)==0){
			//	System.out.println(val);
				count++;
				
			}
			j++;
		}
		//System.out.println();
	}
  System.out.println(count);
	}

}
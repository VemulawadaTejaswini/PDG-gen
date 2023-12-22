import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str;
		int sum=0,len=0;
		while(true){
			str=sc.nextLine();
			if(str.equals("0")==false){
				sum=0;
				len=str.length();
				for(int i=0;i<len;i++){
					sum+=Integer.parseInt(str.substring(i,i+1));
				}
				System.out.println(sum);
			}
			else{
				break;
			}
		}
	}
}

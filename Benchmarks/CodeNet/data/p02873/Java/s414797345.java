import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String ss = sc.next();
		long sum = 0;
		int count = 0;
		boolean flg = true;
		
		int st_num=0;
		
		for(int i=0;i<ss.length();i++){
			if( ss.charAt(i) == '<' ){
				if (flg){
					count++;
				}else{
					sum+=count*(count-1)/2 + Math.max(count-st_num,0);
					//System.out.println(count);
					//System.out.println("s"+sum);					
					st_num=0;
					count=1;
				}
				flg=true;
			}else{
				if(flg){
					sum+=(1+count)*count/2;
					//System.out.println(count);
					//System.out.println("c"+sum);
					st_num=count;
					count=1;
				}else{
					count++;
				}
				flg=false;
			}
		}
		
		if(flg){
			sum+=(1+count)*count/2;
		}else{
			sum+=count*(count-1)/2 + Math.max(count-st_num,0);
		}
		
		
		System.out.print(sum);
	}
}
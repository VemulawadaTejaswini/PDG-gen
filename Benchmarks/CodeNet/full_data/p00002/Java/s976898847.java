import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			int temp=sc.nextInt();
			temp+=sc.nextInt();
			int count=0;
			//System.err.println(temp);
			while(temp>0){
				temp/=10;
				count++;
			}
			System.out.println(count);
		}
		
	}
}
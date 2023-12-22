import java.util.Scanner; 

class Main{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);	

		int roop = scan.nextInt();
		
		for(int i=0;i<roop;i++){
			int year  = scan.nextInt();
			int manth = scan.nextInt();
			int day = scan.nextInt();
			
			System.out.println(dayCount(year,manth,day));
		}
	
	}

	static int dayCount(int year,int manth,int day){

		int fyear=year;
		int maxday=0;
		int daycount=0;

		for(;year<=1000;year++){

			if(year==fyear){
				for(;manth<=10;manth++){
					if(year%3==0||manth%2!=0){
						maxday=20;		
					}
					else{
						maxday=19;
					}
					
//					System.out.println(year+"年"+manth+"月"+day+"日");

					for(;day<=maxday;day++){
						daycount++;	
					}
					day=1;
				}
			}
			else if(year==1000){
			}
			else{
				for(manth=1;manth<=10;manth++){
					if(year%3==0||manth%2!=0){
						maxday=20;		
					}
					else{
						maxday=19;
					}
					
//					System.out.println(year+"年"+manth+"月"+day+"日");

					for(day=1;day<=maxday;day++){
						daycount++;	
					}
					day=1;
				}
			}

		}
		return daycount;
	}

}
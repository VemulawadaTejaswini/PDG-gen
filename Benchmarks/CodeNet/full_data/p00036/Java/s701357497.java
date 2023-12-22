import java.util.*;
public class Main {	
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new AOJ0036();
	}
	
	class AOJ0015{
		public AOJ0015() {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			for(int s=0;s<n;s++){
				String a = in.next(),c="";
				String b = in.next(),d="";
				for(int i=a.length()-1;i>=0;i--)c+=a.charAt(i);
				for(int i=b.length()-1;i>=0;i--)d+=b.charAt(i);
				String result = "";
				int save = 0;//余った数字
				for(int i=0;i<Math.max(a.length(), b.length());i++){
					if(c.length()>i&&d.length()>i){
						int num1=Integer.parseInt(c.charAt(i)+"");
						int num2=Integer.parseInt(d.charAt(i)+"");
						int sum = num1+num2;
						if(i!=0)sum+=save;
						save=0;
						if(sum>9){
							save = 1;
							sum-=10;
						}
						result+=Integer.toString(sum);
					}else if(c.length()>i&&d.length()<=i){
						int sum=Integer.parseInt(c.charAt(i)+"");
						if(i!=0)sum+=save;
						save=0;
						if(sum>9){
							save = 1;
							sum-=10;
						}
						result+=Integer.toString(sum);
					}else if(d.length()>i&&c.length()<=i){
						int sum=Integer.parseInt(d.charAt(i)+"");
						if(i!=0)sum+=save;
						save=0;
						if(sum>9){
							save = 1;
							sum-=10;
						}
						result+=Integer.toString(sum);
					}
				}
				if(save==1)result+="1";
				if(result.length()>80)System.out.println("overflow");
				else{
					for(int k=result.length()-1;k>=0;k--)System.out.print(result.charAt(k));
					System.out.println();
				}
			}
		}
	}
	
	class AOJ0036{
		char doIt(int y,int x){
			if(hyou[y+1][x] && hyou[y][x+1] && hyou[y+1][x+1] ){
				return 'A';
			}else if( hyou[y+1][x] && hyou[y+2][x] && hyou[y+3][x] ){
				return 'B';
			}else if( hyou[y][x+1] && hyou[y][x+2] && hyou[y][x+3] ){
				return 'C';
			}else if( hyou[y][x+1] && hyou[y+1][x+1] && hyou[y+1][x+2] ){
				return 'E';
			}else if( hyou[y+1][x] && hyou[y+1][x+1] && hyou[y+2][x+1] ){
				return 'F';
			}else if( hyou[y][x+1] && hyou[y+1][x] && hyou[y+1][x-1] ){
				return 'G';
			}else if( hyou[y+2][x-1] && hyou[y+1][x] && hyou[y+1][x-1] ){
				return 'D';
			}
			return ' ';
		}
		boolean[][] hyou = new boolean[10][10];
		public AOJ0036() {
			Scanner in = new Scanner(System.in);
			while(in.hasNext()){
				for(int s=0;s<8;s++){
					String a = in.next();
					for(int i=0;i<a.length();i++)hyou[s][i]=a.charAt(i)=='1'? true:false;
				}
				for(int s=0;s<8;s++){
					boolean a=false;
					for(int i=0;i<8;i++)
						if(hyou[s][i]){
							System.out.println(doIt(s, i));
							a = true;
							break;
						}
					if(a)break;
				}
			}
		}
	}
	
	class AOJ0034{
		int[] kyori = new int[11];
		int speed1,speed2;
		public AOJ0034() {
			Scanner in = new Scanner(System.in);
			while(in.hasNext()){
				String input[] = in.next().split(",");
				int sum=0;
				for(int i=1;i<=10;i++){
					kyori[i] = Integer.parseInt(input[i-1]);
					sum+=kyori[i];
				}
				speed1 = Integer.parseInt(input[10]);
				speed2 = Integer.parseInt(input[11]);
//				double one,two;
//				for(int s=1;s<=10;s++){//終点駅まで
//					
//				}
				
				
				
			}
			
			
			
			
		}
		
		
	}
}
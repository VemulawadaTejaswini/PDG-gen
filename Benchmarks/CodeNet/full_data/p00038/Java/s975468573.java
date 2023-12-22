import java.util.Arrays;
import java.util.Scanner;
	public class Main{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int count[] = {0,0,0,0,0};
			int num[] = new int[5];
			while(sc.hasNext()){
				boolean boo = false;
				String str = sc.nextLine();
				String[] get = str.split(",",0);
				Arrays.sort(get);
				for(int i = 0;i < 5; i++){
					num[i]=Integer.parseInt(get[i]);
				}
				Check(num[0],num[1],num[2],num[3],num[4],boo);
				for(int i = 0; i < 5; i ++){	
					for(int j = 0; j < 5; j ++){
						if(get[i].equals(get[j])){
							count[i]++;
						}
					}
				}
				
				if(count[4]==4){System.out.println("four card");continue;}
				if(count[4]==3&&count[3]==2){System.out.println("full house");continue;}
				if(boo){System.out.println("straight");continue;}
				if(count[4]==3){System.out.println("three card");continue;}
				if(count[4]==count[3])if(count[2]==count[1]){
					System.out.println("two pair");
					continue;
				}else{
					System.out.println("one pair");
					continue;
				}
				System.out.println("null");
			}
		}
		public static void Check(int a,int b,int c,int d,int e,boolean f){
			int count2 = 0;
			if(e - d == d - c && c - b == b - a){
				f = true;
			}else if (e == 13 && a == 1){
				if(b - a == 1 || b - a == -1 )count2 ++;
				if(c - b == 1 || c - b == -1 )count2 ++;
				if(d - c == 1 || d - c == -1 )count2 ++;
				if(e - d == 1 || e - d == -1 )count2 ++;
				if(count2==3){
					f = true;
				}
			}
		}
	}
	
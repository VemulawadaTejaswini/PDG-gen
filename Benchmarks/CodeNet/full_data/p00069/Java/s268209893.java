import java.util.Scanner;

public class Main {
	static int[][] a;
	static int n, start,goal,dan,s;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		label:while(true){
			n = cin.nextInt();
			if(n==0){
				break;
			}
			start = cin.nextInt();
			s = start;
			goal=cin.nextInt();
			dan = cin.nextInt();
			a = new int[dan][n-1];
			for(int i = 0; i < dan;i++){
				String str = cin.next();
				for(int j=0;j<str.length();j++){
					a[i][j]=str.charAt(j)-'0';
				}
			}
			start--;
			for(int i = 0; i < dan;i++){
				//System.out.println(start);
				if(start>0 && a[i][start-1]==1){
					start--;
				}
				else if(start < n-1 && a[i][start]==1){
					start++;
				}
			}
			if(start+1==goal){
				System.out.println(0);
				continue;
			}
			for(int i = 0; i < dan;i++){
				
				for(int j = 0;j < n-1;j++){
					start = s-1;
					if(j==0){
						if(a[i][j]+a[i][j+1]==0){
							a[i][j]=1;
							if(a(i, j))
								continue label;
							a[i][j]=0;
						}
					}
					else if(j==n-2){
						if(a[i][j-1]+a[i][j]==0){
							a[i][j]=1;
							if(a(i, j))
								continue label;
							a[i][j]=0;
						}
					}
					else{
						if(a[i][j-1]+a[i][j]+a[i][j+1]==0){
							a[i][j]=1;
							if(a(i, j))
								continue label;
							a[i][j]=0;
						}
					}
					
				}
			}
			System.out.println(1);
		}
		
	}
	static boolean a(int x, int y){
		for(int i = 0; i < dan;i++){
			if(start>0 && a[i][start-1]==1){
				start--;
			}
			else if(start < n-1 && a[i][start]==1){
				start++;
			}
		}
		if(start+1==goal){
			System.out.println((x+1) + " " + (y+1));
			return true;
		}
		return false;
	}
}
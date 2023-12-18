import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int H=s.nextInt();
		int W=s.nextInt();
		String st[]=new String[H+1];
		char c[][]=new char[H+2][W];
		int count=0;
        System.out.println();
		for(int i=0;i<H+1;i++){
			st[i]=s.nextLine();
		}
		
		for(int i=1;i<H+1;i++){
			for(int j=0;j<W;j++){
				c[i][j]=st[i].charAt(j);
			}
		}
		
		for(int i=1;i<H+1;i++){
			for(int j=0;j<W;j++){
				if(c[i][j]=='.')continue;
				else{
					if(c[i+1][j]=='#'||c[i-1][j]=='#'||c[i][j+1]=='#'||c[i][j-1]=='#'){
						System.out.print("Yes");
						count++;
						break;
					}
				}
				}
			 if(count!=0)break;
			}
		 if(count==0)System.out.print("No");
		}

	}
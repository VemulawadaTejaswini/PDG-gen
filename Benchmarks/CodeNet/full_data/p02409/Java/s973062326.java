import java.util.Scanner;
public class Main{
	public static void main(String[] args){

        Scanner s = new Scanner(System.in);
		int b=0,f=0,r=0,v=0,i,j,k;				//b棟f階のr番目の部屋にv人
		int[][][] heya = new int[4][3][10];
        int n = s.nextInt();
        
		for(i=0;i<n;i++){
				b=s.nextInt();
          	    f=s.nextInt();
				r=s.nextInt();
         	    v=s.nextInt();
            	
            	if(b<5&&b>=1&&f<4&&f>=1&&r<11&&r>=1&&(heya[b-1][f-1][r-1]+v)>=0&&(heya[b-1][f-1][r-1]+v)<10)heya[b-1][f-1][r-1]+=v;
            
        }
        for(i=0;i<4;i++){
              for(j=0;j<3;j++){
                  for(k=0;k<10;k++){
                      System.out.print(" "+heya[i][j][k]);
                      if(k==9)System.out.println();

                  }
              }
            if(i!=3)
            System.out.println("####################");
        }
         	   
            

		s.close();
	}
}

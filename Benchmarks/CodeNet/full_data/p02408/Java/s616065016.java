import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc =new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int card[][]=new int[4][14];

        for(int i=0;i<n;i++){
        	
        String a =sc.next();
        int b =sc.nextInt();
        
        switch(a) {
        
        case "S":
        card[0][b]=1; break;
        case "H":
        card[1][b]=1; break;
        case "C":
        card[2][b]=1; break;
        case "D":
        card[3][b]=1; break;
        }
        
        }
        
        for(int i=0;i<4;i++) {
        for(int j=1;j<=13;j++)
    
         if (card[i][j]==0)       	
          switch(i) {         
           case 0:
           System.out.println("S "+j); break;
           case 1:
           System.out.println("H "+j);; break;
           case 2:
           System.out.println("C "+j);; break;
           case 3:
           System.out.println("D "+j);; break;
            }
        }
        
    }
}

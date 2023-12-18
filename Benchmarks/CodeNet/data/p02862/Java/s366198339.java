import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    int x = sc.nextInt(); 
    int y = sc.nextInt(); 
           int c[][] = new int [700005][700005];

        int mod = 1000000007;
        c[0][0]=1;
        for(int i=0;i<700003;i++) {
            for(int j=0;j<700003;j++) {
                long tmp =  c[i][j]%mod;
                c[i+1][j]+=tmp;
                c[i+1][j+1]+=tmp;
            }
        }
     if(x<0||y<0||(y+x)%3!=0) System.out.println(0);
else if(x>=y){
 int k = x - y;
  int t = (y - k)/3;
    
  System.out.println(c[2*t+k][t]);
}
   else{
 int k = y - x;
  int t = (x - k)/3;
    
  System.out.println(c[2*t+k][t]);

}

 }

}
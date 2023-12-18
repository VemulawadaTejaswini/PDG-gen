import java.util.*;
public class Main {
   static int check(char ob[][]) {
        int  m = ob.length;
        int n = ob[0].length;
        int arr[][]=new int [ob.length][ob[0].length];
        int count=1;
        for (int i =0;i<m;i++) {
            if(ob[i][0]=='#') {
                arr[i][0]=0;
                count=0;
            }
            else {
                arr[i][0]=count;
            }
            
        }
        count =1;
        for (int j =0;j<n;j++) {
            if(ob[0][j]=='#') {
                arr[0][j]=0;
                count=0;
            }
            else {
                arr[0][j]=count;
            }
            
        }
        for (int  i =1 ; i< m ; i++) {
            for (int  j =1 ; j<n ; j++) {
           
               
                    if(ob[i][j]=='#') {
                        arr[i][j]=0;
                    
                    }
                else {
                       arr[i][j]=(arr[i-1][j]%1000000007+arr[i][j-1]%1000000007)%1000000007;
                }
                      
                    
                   
                }
            }
return arr[m-1][n-1] ;   
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int w = s.nextInt();
        char ob[][] = new char[h][w];
        for(int i =0; i<h ;i++) {
          
                ob[i] = s.next().toCharArray();
            
        }
        System.out.println(check(ob));
        
    }
}
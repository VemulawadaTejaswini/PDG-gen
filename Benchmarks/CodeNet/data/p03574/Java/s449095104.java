import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int w = sc.nextInt();
        int h = sc.nextInt();
        char[][] q = new char[w][h];
        int[][] a = new int[w][h];
        
        for(int i=0; i<w; i++){
            String s = sc.next();
            for(int j=0; j<h; j++){
                q[i][j] = s.charAt(j);
                a[i][j] = 0;
            }
        }
        
        for(int i=0; i<w; i++){
            for(int j=0; j<h; j++){
                if(q[i][j]=='#'){
                    a[i][j]=100;
                    if(i!=0){
                        if(j!=0){
                            a[i-1][j-1]++;
                        }
                        a[i-1][j]++;
                        if(j!=h-1){
                            a[i-1][j+1]++;
                        }
                    }
                    if(j!=0){
                        a[i][j-1]++;
                    }
                    if(j!=h-1){
                        a[i][j+1]++;
                    }
                    if(i!=w-1){
                        if(j!=0){
                            a[i+1][j-1]++;
                        }
                        a[i+1][j]++;
                        if(j!=h-1){
                            a[i+1][j+1]++;
                        }
                    }
                }
            }
        }
        
         for(int i=0; i<w; i++){
            for(int j=0; j<h; j++){
                if(a[i][j]<100){
                    System.out.print(a[i][j]);
                }else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }
        
        
   }
}

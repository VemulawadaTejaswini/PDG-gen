import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        String s = sc.next();
        
        boolean[][][] exist = new boolean[10][10][10];
        
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<10;k++){
                    exist[i][j][k]=false;
                }
            }
        }
        
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    exist[s.charAt(i)-48][s.charAt(j)-48][s.charAt(k)-48]=true;
                }
            }
        }
        
        int count=0;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<10;k++){
                    if(exist[i][j][k]) count++;
                }
            }
        }
        System.out.println(count);
    }
}
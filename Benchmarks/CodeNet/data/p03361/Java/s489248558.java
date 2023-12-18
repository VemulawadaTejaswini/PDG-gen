
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner = new Scanner(System.in);
        int h=scanner.nextInt();
        int w=scanner.nextInt();
        char[][] charMatrix=new char[h][w];
        for(int i=0;i<h;i++){
            String line=scanner.next();
            for(int j=0;j<w;j++){
                charMatrix[i][j]=line.charAt(j);
            }
        }
        boolean result=true;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                result=result&&isAdjoin(charMatrix,i,j,h,w);
            }
        }
        if(result){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static boolean isAdjoin(char[][] charMatrix,int i,int j, int h,int w){
        if(charMatrix[i][j]=='.') return true;
        if(i!=0) {
            if(charMatrix[i-1][j]=='#') return true;
        }
        if(i!=h-1) {
            if(charMatrix[i+1][j]=='#') return true;
        }if(j!=0) {
            if(charMatrix[i][j-1]=='#') return true;
        }
        if(j!=w-1) {
            if(charMatrix[i][j+1]=='#') return true;
        }
        return false;
    }
}

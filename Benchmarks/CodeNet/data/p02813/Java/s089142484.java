import java.util.Scanner;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
 
        int n = stdIn.nextInt();
        int p[] = new int[n];
        int q[] = new int[n];
        int a = 0;
        int b = 0;
        //int c = stdIn.nextInt();
        //int x = stdIn.nextInt();
        //int num[] = new int[];
        //String s = stdIn.next();
        //int sum = 0;
        //boolean flag = true;
        for(int i = 0; i < n; i++){
            p[i] = stdIn.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            q[i] = stdIn.nextInt();
        }
        
        int used[] = {1, 1, 1, 1, 1, 1, 1, 1};
        
        int nokori = n - 1;
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            int num = p[i];
            int count = 0;
            used[p[i] - 1] = 0;
            int junretsu = 1;
            for(int j = 0; j < num - 1; j++){
                if(used[j] == 1){
                    count++;
                }
            }
            
            for(int j = nokori; j > 0; j--){
                junretsu *= j;
            }
            
            sum += junretsu * count;
            nokori--;

        }
        
        
        a = sum;
        
        int used2[] = {1, 1, 1, 1, 1, 1, 1, 1};
        
        nokori = n - 1;
        sum = 0;
        for(int i = 0; i < n; i++){
            int num = q[i];
            int count = 0;
            used2[q[i] - 1] = 0;
            int junretsu = 1;
            for(int j = 0; j < num - 1; j++){
                if(used2[j] == 1){
                    count++;
                }
            }
            
            for(int j = nokori; j > 0; j--){
                junretsu *= j;
            }
            
            sum += junretsu * count;
            nokori--;
        }
        
        b = sum;
        
        System.out.println(Math.abs(a - b));
 
        //System.out.println();
        //System.out.print();
 
        stdIn.close();
    }
}
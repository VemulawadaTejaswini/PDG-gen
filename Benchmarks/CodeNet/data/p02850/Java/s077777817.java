import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int a[] = new int[n + 1];
        int b[] = new int[n + 1];
        int color[] = new int[n + 1];
        int num[] = new int[n + 1];
        int numcopy[] = new int[n + 1];
        boolean flag = new boolean[n + 1];
        int index = 1;
        
        for(int i = 1; i < n; i++){
            a[i] = stdIn.nextInt();
            b[i] = stdIn.nextInt();
            color[i] = 0;
            num[a[i]]++;
            num[b[i]]++;
            numcopy[a[i]]++;
            numcopy[b[i]]++;
            flag[i] = true;
        }
        
        Arrays.sort(numcopy);
        
        int maxindex = 0;
        
        for(int i = 0; i < n; i++){
            if(numcopy[n] == num[i]){
                maxindex = i;
                break;
            }
        }
        
        //color[maxindex] = index;
        
        //index++;

        for(int i = 1; i < n; i++){
            if(a[i] == maxindex || b[i] == maxindex){
                color[i] = index;
                index++;
            }
            
        }
        
        
        System.out.println(numcopy[n]);
        
        for(int i = 1; i < n; i++){
            System.out.println(color[i]);
        }
        
    }
}

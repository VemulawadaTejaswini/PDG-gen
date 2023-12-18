import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int max = 0;
        int maxposi = 0;
        boolean jdg = true;
        for(int i = 0;i < n;i++){
            h[i] = sc.nextInt();
            if(max < h[i]){
                max = h[i];
                maxposi = i;
            }
        }

        for(int i = 0;i < n-1;i++){
            if(h[i]-h[i+1] > 1){
                jdg = false;
                break;
            }
            
        }

        for(int i = 0;i < n;i++){
            if(i >= maxposi){
                if(max > h[i]){
                    jdg = false;
                    break;
                }
            }
        }
        System.out.println(jdg == true?"Yes":"No");
        
    }
}
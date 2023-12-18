import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        
        Map<Long, Integer> po = new HashMap<>();
        int[] ans = new int[10];
        ans[0] = (h-2)*(w-2);
        for(int t=0; t<n; t++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            ArrayList<Integer> chg = new ArrayList<>();
            
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    if(!(0<=a+i-2 && a+i<h && 0<=b+j-2 && b+j<w)) continue;
                    int cnt = 0;
                    for(int k=0; k<3; k++){
                        for(int l=0; l<3; l++){
                            int y = a+i+k-2;
                            int x = b+j+l-2;
                            cnt += po.getOrDefault(y*(1L<<30)+x, 0);
                        }
                    }
                    chg.add(cnt);
                }
            }
            for(int cnt : chg){
                ans[cnt]--;
                ans[cnt+1]++;
            }
            po.put(a*(1L<<30)+b, 1);
        }
        
        for(int i=0; i<10; i++){
            System.out.println(ans[i]);
        }
    }
}

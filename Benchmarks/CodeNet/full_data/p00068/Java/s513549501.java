import java.util.Scanner;
public class Main{
    
     
    public static void main(String[] args) {
    	Main app = new Main();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt(),left = 0,ans = 0,end,sta; 
            if(n == 0)break;
            double[][] p = new double[n][2];
            
            for(int i=0;i<n;i++){
                String[] s = sc.next().split(",");
                p[i][0] = Double.parseDouble(s[0]);
                p[i][1] = Double.parseDouble(s[1]);
            }
            
            
            
            
            boolean[] judge1 = new boolean[n];
            for(int i=1;i<n;i++){
            	if(p[i][0]<p[left][0])left=i;
            }
            judge1[left]=true;
            end = left;
            sta = left;
            
            
            
            
            
            while(true){
                for(int i = 0;i < n;i++){
                    if(sta == i)continue;
                    boolean judge2 = true;
                    for(int j  =0;j  < n;j++){
                        if(j == sta||j == i)continue;
                        if(app.doing(p[sta][0], p[sta][1], p[i][0], p[i][1], p[j][0], p[j][1]) <= 0){
                            judge2 = false;
                            break;
                        }
                    }
                    if(judge2){
                        judge1[i] = true;
                        sta = i;
                        break;
                    }
                }
                if(sta == end)break;
            }
            for(int i = 0;i < n;i++){
            	if(!judge1[i])ans++;
            }
            System.out.println(ans);
        }
    }

    double doing(double x1, double y1, double x2, double y2, double x3, double y3){
        double dx1 = x2-x1,
        	   dy1 = y2-y1,
        	   dx2 = x3-x1,
        	   dy2 = y3-y1;
        return (dx1*dy2)-(dx2*dy1);
    }

}
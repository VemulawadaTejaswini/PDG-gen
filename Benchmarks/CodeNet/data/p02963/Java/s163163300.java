import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=Long.parseLong(sc.next());
        long n2=n;
        int ans=0;
        boolean c=(n%4==2);
        ArrayList<Integer>bunkai=new ArrayList<>();
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                n/=i;
                bunkai.add(i);
            }
        }
        if(n!=1)bunkai.add((int)n);
        Collections.sort(bunkai);
        int ans1=1;
        int ans2=1;
        for(int i=bunkai.size()-1;i>=0;i--){
            if(ans1>ans2){
                ans2*=bunkai.get(i);
            }
            else{
                ans1*=bunkai.get(i);
            }
        }
            if((ans1+ans2)%2==0){
                
            int x=(ans2+ans1)/2;
            int y=Math.abs((ans2-ans1))/2;
            System.out.println("0 0 "+x+" "+y+" "+y+" "+x);
            }
            else System.out.println("0 0 "+ans1+" 0 0 "+ans2);
   
    }
    
}

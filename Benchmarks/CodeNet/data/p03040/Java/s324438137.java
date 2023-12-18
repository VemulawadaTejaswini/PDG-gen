import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        ArrayList<Integer>po=new ArrayList<>();
        long c=0;
        po.add(Integer.MIN_VALUE);
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            if(m==1){
                int r=sc.nextInt();
                po.add(r);
                c+=sc.nextInt();
            }
            else{
                Collections.sort(po);
                int l=po.get(po.size()/2);
                long r=0;
                for(int j=1;j<po.size();j++){
                    
                    r+=Math.abs(po.get(j)-l);
                }
                //System.out.println(c+" "+r);
                System.out.println(l+" "+(c+r));
            }
        }
    }
}

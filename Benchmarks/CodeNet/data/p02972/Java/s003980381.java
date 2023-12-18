import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        boolean c=true;
        ArrayList<Integer>po=new ArrayList();
        for(int i=0;i<n;i++){
            if((sum/(i+1)%2)==a[i]){
                if(a[i]==1){
                    po.add(i+1);
                }
            }
            else{
                c=false;
                break;
            }
        }
        if(c){
        System.out.println(po.size());
        for(int i=0;i<po.size();i++)System.out.println((i==0)?po.get(i):" "+po.get(i));
            
        }
        else System.out.println(-1);
        
    }
}

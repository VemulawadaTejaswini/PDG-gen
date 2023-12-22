import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt(),x;    
        int[] lst=new int[r+c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                x = sc.nextInt();
                lst[i]+=x;lst[r+j]+=x;
                if(j!=0)System.out.print(" ");
                System.out.print(x);
            }
            System.out.printf(" %d\n",lst[i]);
        }
        
        int sum=0;
        for(int i=0;i<c;i++){
            sum+=lst[r+i];
            if(i!=0)System.out.print(" ");
            System.out.print(lst[r+i]);
        }
        System.out.printf(" %d\n",sum);
    }
}

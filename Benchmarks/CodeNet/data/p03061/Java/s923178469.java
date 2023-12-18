import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=1;
        int d=0;
        int a[]=new int[n];
        
        int k[]=new int[n];
        a[0]=sc.nextInt();
        if(a[0]%2!=0)
            d++;
        for(int i=1;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2!=0)
                d++;
            if(a[i]==a[i-1])
                s++;
        }
        if(d>=2)
        {
            System.out.println("1");
            return;
        }
        else if(s==n)
        {
            System.out.println(a[0]);
            return;
        }
        else
        {
            ArrayList<Integer> ar=new ArrayList<>();
            Arrays.sort(a);
            for(int i=n-1;i>0;i--)
            {
                if(a[i]%2!=0)
                {
                    i--;
                    if(i>0)
                     ar.add(a[i]-a[i-1]);
                }
                else if(i-1>=0 && a[i-1]%2!=0)
                {
                    if(i-2>=0)
                        ar.add(a[i]-a[i-2]);
                     
                }
                else
                {
                    ar.add(a[i]-a[i-1]);
                }
               
            }
           
            System.out.println(ar.get(0));
        }
    }
}

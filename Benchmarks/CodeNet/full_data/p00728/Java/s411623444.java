import java.util.*; 
public class Main{
    public static void main(String[] args){
        while(true){
            int n;
            Scanner sc =new Scanner(System.in);
            n = sc.nextInt();
            if(n==0){
                System.exit(0);
            }
            int[] s;
            int i=0;
            s=new int[n];
            int max=0;
            int min=999;
            while(i<n){
                s[i]=sc.nextInt();
                i++;
            }
            Arrays.sort(s);
            i=1;
            int sum=0;
            while(i<n-1){
                sum+=s[i];
                i++;
            }
            System.out.println(sum/(n-2));
        }
    }
}

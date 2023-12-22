    import java.util.*;    
    public class Main{
          public static void main(String []args){
            Scanner sc = new Scanner(System.in);
           int n =sc.nextInt();
            int a[] = new int[n];
            int k = sc.nextInt();
            for (int i=0; i<n; i++){
              a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int ans=0;
            for(int i=0; i<k; i++){
              ans+=a[i];
            }
            System.out.println(ans);
          }
         }
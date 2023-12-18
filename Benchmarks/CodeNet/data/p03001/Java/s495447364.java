import java.util.*;
     
    public class Main{
     
         public static void main(String []args) throws Exception {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            a[0] = sc.nextInt();
            for(int i=1;i<n;i++) a[i] = a[i-1] + sc.nextInt();
            long sum = 0;
            for(int i=0;i<n;i++) { if(a[i]>=k) { sum += n-i; break; } }
            
            for(int i=0;i<n-1;i++){
                if(a[n-1]-a[i]<k) break;
                int val = binarsearch(a,k+a[i]);
                sum += n - val;
            }
            System.out.println(sum);
            
    }  
     
     static int binarsearch(int[] a, int x){
         int we = a.length;
         int l = 0;
         int f = a.length - 1 ;
         int mid = l + (f-l)/2 ;
         while(1==1){
             mid = l + (f-l)/2 ;
             if(mid<0) return 0;
             if(a[mid]==x || f<=l){
                 if(a[mid]==x) return mid;
                 if(f==a.length-1 && a[l]<x) return f+1;
                 if(f<l) {  return l; }
                 if(f==l && a[l]<x) return l+1;
                 else {  return f; }
             }
            else if(a[mid]>x){
                 f = mid - 1;
             }
             else if(a[mid]<x){
                 l = mid + 1;
             }
             
             
         }
         
     } 
     
    }
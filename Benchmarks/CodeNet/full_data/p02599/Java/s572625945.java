     import java.util.*;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
int q=sc.nextInt();
         int arr[]=new int[n+1];
 
         for(int i=0;i<n+1;i++){
           
         arr[i]=sc.nextInt();
         }



 
 

 
   
         for(int i=0;i<q;i++){
 int l=sc.nextInt();
             int r=sc.nextInt();
   HashSet<Integer> m=new HashSet<>();
           for(int i=l;i<=r;i++){
m.add(arr[i])
           }
            System.out.println(m.size());
         }
  
}
    
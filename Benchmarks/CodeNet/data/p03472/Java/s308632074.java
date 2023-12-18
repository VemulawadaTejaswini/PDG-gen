import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int H = sc.nextInt();
   int[] a= new int[N];
   int[] b= new int[N];
   for(int i=0;i<N;i++)
   {
     a[i]= sc.nextInt();
     b[i]= sc.nextInt();
   }

   Arrays.sort(a);
   Arrays.sort(b);
   
   int amax=a[N-1];
   
   int bcount =N-1;
   int sum = 0;
   
   while(b[bcount]>amax&&sum<H&&bcount>=0)
   {
     sum+=b[bcount];
     bcount--;
   }
   int ans = N - bcount - 1 ;
   if(sum<H)
   { 
     if((H-sum)%amax==0) ans+=(H-sum)/amax;
     else ans+=(H-sum)/amax +1;
   }
   
   System.out.println(ans);
 }
}
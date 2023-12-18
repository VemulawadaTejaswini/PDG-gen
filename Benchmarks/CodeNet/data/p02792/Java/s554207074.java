import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a= new int[10][10];
  
   for(int i=1; i<=n; i++){
    String i1= String.valueOf(i);
    a[Integer.parseInt(i1.substring(0,1))][i%10]+=1;
   }
  
  int ans=0;
  
  for(int c=1; c<=9; c++){
   for(int d=1; d<=9; d++){
    ans+=a[c][d]*a[d][c];
   }
  }
    
    
    
    System.out.println(ans);
   
    }
}
